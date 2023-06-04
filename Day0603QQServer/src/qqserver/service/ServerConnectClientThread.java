package qqserver.service;

import qqcommon.Message;
import qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

//该类的一个对象和某个客户端保持通信
public class ServerConnectClientThread extends Thread {
    private Socket socket;
    private String userId;//连接到服务器端的用户id

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;
    }

    public Socket getSocket() {
        return socket;
    }

    @Override
    public void run() {//这里线程处于run状态，可以发送/接收消息

        while (true) {
            System.out.println("服务端和客户端" + userId + "保持通信，读取数据...");
            try {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
                //后面会使用message,根据message类型，做相应的业务处理
                if (message.getMesType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)) {
                    //客户端要在线用户列表
                    System.out.println(message.getSender() + " 要在线用户列表");
                    String onlineUser = ManageClientThreads.getOnLineUser();
                    //返回message
                    //构建一个对象，返回给客户端
                    Message message2 = new Message();
                    message2.setMesType(MessageType.MESSAGE_RET_ONLINE_FRIEND);
                    message2.setContent(onlineUser);
                    message2.setGetter(message.getSender());
                    //返回给客户端
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message2);
                } else if (message.getMesType().equals(MessageType.MESSAGE_COMM_MES)) {
                    //根据message获取getter id，然后得到对应线程
                    ServerConnectClientThread serverConnectClientThread = ManageClientThreads.
                            getServerConnectClientThread(message.getGetter());
                    //得到对应的对象输出流，将message转发给指定客户端
                    ObjectOutputStream oos = new ObjectOutputStream(serverConnectClientThread.
                            getSocket().getOutputStream());
                    oos.writeObject(message);

                } else if (message.getMesType().equals(MessageType.MESSAGE_TO_ALL_MES)) {
                    //遍历管理线程的集合，把所有的线程的socket得到，然后把message进行转发即可
                    HashMap<String ,ServerConnectClientThread> hm = ManageClientThreads.getHm();

                    Iterator<String> iterator = hm.keySet().iterator();
                    while (iterator.hasNext()) {
                        //取出在线用户id
                        String onLineUserId = iterator.next().toString();

                        if (! onLineUserId.equals(message.getSender())) {

                            //进行转发messagr
                            ObjectOutputStream oos =
                                    new ObjectOutputStream(hm.get(onLineUserId).getSocket().getOutputStream());
                            oos.writeObject(message);
                        }
                    }

                } else if (message.getMesType().equals(MessageType.MESSAGE_FILE_MES)) {
                    //根据getter id 获取到对应的线程，将message对象转发
                    ServerConnectClientThread serverConnectClientThread =
                            ManageClientThreads.getServerConnectClientThread(message.getGetter());
                    ObjectOutputStream oos =
                            new ObjectOutputStream(serverConnectClientThread.getSocket().getOutputStream());
                    //转发
                    oos.writeObject(message);

                } else if (message.getMesType().equals(MessageType.MESSAGE_CLIENT_EXIT)) {

                    System.out.println(message.getSender() + " 退出");
                    //将这个客户端对应线程，从集合删除
                    ManageClientThreads.removeServerConnectClientThread(message.getSender());
                    socket.close();//关闭连接
                    //退出线程
                    break;

                }else {
                    System.out.println("暂不处理");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
