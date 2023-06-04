package qqserver.service;

import qqclient.Utility.Utility;
import qqcommon.Message;
import qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class SendNewsToAllService implements Runnable {

    @Override
    public void run() {
        //为了可以推送多次，使用while
        while (true) {
        System.out.println("请输入服务器要推送的新闻/消息，【输入exit】退出推送服务");
        String news = Utility.readString(1000);
        if ("exit".equals(news)) {//退出推送
            break;
        }
        //构建一个群发消息
        Message message = new Message();
        message.setSender("服务器");
        message.setMesType(MessageType.MESSAGE_TO_ALL_MES);
        message.setContent(news);
        message.setSender(new Date().toString());
        System.out.println("服务器推送消息给所有人 说; " + news);

        //遍历当前所有的通信线程，得到socket，并发送message
        HashMap<String, ServerConnectClientThread> hm = ManageClientThreads.getHm();

        Iterator<String> iterator = hm.keySet().iterator();
        while (iterator.hasNext()) {
            String onLineUserId = iterator.next().toString();
            ServerConnectClientThread serverConnectClientThread = hm.get(onLineUserId);
            try {
                ObjectOutputStream oos =
                        new ObjectOutputStream(serverConnectClientThread.getSocket().getOutputStream());
                oos.writeObject(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }
}
