package qqclient.service;

import qqcommon.Message;
import qqcommon.MessageType;
import qqserver.service.ManageClientThreads;

import java.io.*;

//该类完成 文件传输服务
public class FileClientService {
    public void sendDileToOne(String src, String dest, String senderId, String getterId) throws IOException {
        //读取文件
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_FILE_MES);
        message.setSender(senderId);
        message.setGetter(getterId);
        message.setSrc(src);
        message.setDest(dest);

        //需要将文件读取
        FileInputStream fileInputStream = null;
        byte[] fileBytes = new byte[(int) new File(src).length()];

        try {
            fileInputStream = new FileInputStream(src);
            fileInputStream.read(fileBytes);

            //将文件对应的字节数组设置message
            message.setFileBytes(fileBytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //提示信息
        System.out.println("\n" + senderId + " 给 " + getterId +
                " 发送文件: " + src + " 到对方的电脑的目录 " + dest);

        //发送
        ObjectOutputStream oos =
                new ObjectOutputStream(ManageClientConnectServerThread.
                        getClientConnectServerThread(senderId).getSocket().getOutputStream());
        oos.writeObject(message);
    }
}
