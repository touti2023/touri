package qqclient.service;

import qqcommon.Message;
import qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.SplittableRandom;

public class MessageClientService {

    public void sendMessageToAll(String content,String senderId) {
        //创建message
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_TO_ALL_MES);//群发聊天消息
        message.setSender(senderId);
        message.setGetter(content);
        message.setContent(content);
        message.setSender(new Date().toString());//发送时间设置到对象
        System.out.println(senderId + " 对大家说 " + content);

        //发送给服务端
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.
                            getClientConnectServerThread(senderId).getSocket().getOutputStream());
            oos.writeObject(message);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void sendMessageToOne(String content, String sendId, String getterId) {
        //创建message
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_COMM_MES);//普通的聊天消息
        message.setSender(sendId);
        message.setGetter(getterId);
        message.setContent(content);
        message.setSender(new Date().toString());//发送时间设置到对象
        System.out.println(sendId + " 对 " + getterId + " 说 " + content);

        //发送给服务端
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.
                            getClientConnectServerThread(sendId).getSocket().getOutputStream());
            oos.writeObject(message);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
