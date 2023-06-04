package qqclient.service;

import java.util.HashMap;
import java.util.Iterator;

//赶礼客户端链接到服务器端的线程类
public class ManageClientConnectServerThread {
    //我们把多个线程放入一个HashMap集合，key 就是用户id，value 就是线程
    private static HashMap<String,ClientConnectServerThread> hm = new HashMap<>();

    //将某个线程加入到集合
    public static void addClientConnectServerThread(String userId,ClientConnectServerThread clientConnectServerThread) {
        hm.put(userId,clientConnectServerThread);
    }


    //通过userId 可以得到对应线程
    public static ClientConnectServerThread addClientConnectServerThread(String userId) {
        return hm.get(userId);
    }

    public static ClientConnectServerThread getClientConnectServerThread(String userId) {
        return hm.get(userId);
    }


}
