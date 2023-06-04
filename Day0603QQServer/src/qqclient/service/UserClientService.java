package qqclient.service;

import qqcommon.Message;
import qqcommon.MessageType;
import qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

//该类完成用户 登陆验证 和 用户注册 等功能
public class UserClientService {
    //在其他地方用的上，做成成员属性。
    public User u = new User();
    private Socket socket;

    //根据Id 和 pwd 到服务器验证该用户是否合法
    public boolean chechUser(String userId, String pwd) throws Exception {
        boolean b = false;
        //创建User对象
        u.setUserId(userId);
        u.getPasswd();
        //链接到服务端，发送u对象
        socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
        //得到ObjectOutputStream 对象
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        oos.writeObject(u);//发送u给服务器

        //读取从服务器回复的Message 对象
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        Message ms = (Message) ois.readObject();

        if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) {//登陆成功

            //创建一个和服务器端保持通信的线程-> 创建一个类 ClientConnectServerThread
            ClientConnectServerThread ccst = new ClientConnectServerThread(socket);
            //启动客户端的线程
            ccst.start();
            //这里为了后面客户端的发展，我们将线程放入到集合管理
            ManageClientConnectServerThread.addClientConnectServerThread(userId, ccst);
            b = true;
        } else {
                //如果登陆失败，就不能启动和服务器通信的线程，关闭socket
            socket.close();
        }
        return b;
    }

    //向服务器端请求在线用户列表
    public void onLineFriendList() {

        //发送一个Message，类型MESSAGE_GET_ONLINE_FRIEND
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        message.setSender(u.getUserId());

        //发送给服务器
      try{
          //从管理线程的集合中，通过userId，得到这个线程
          ClientConnectServerThread clientConnectServerThread =
                  ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId());
          //得到线程
          Socket socket = clientConnectServerThread.getSocket();
          //得到当前线程的Socket 对应的 ObjectOutputStream对象
          ObjectOutputStream oos =
                  new ObjectOutputStream(ManageClientConnectServerThread.
                          getClientConnectServerThread(u.getUserId()).getSocket().getOutputStream());
          oos.writeObject(message);
      }catch(IOException e){
          e.getMessage();
      }

    }
    //编写方法，退出客户端，并给客户端发送一个退出系统的message对象
    public void logout() {
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(u.getUserId());//一定要指定我是哪个客户端id

        //发送message
        try {
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);
            System.out.println(u.getUserId()+" 退出系统 ");
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
