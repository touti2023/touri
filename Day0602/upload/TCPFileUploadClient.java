package Day0602.upload;

import org.junit.platform.commons.util.StringUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


@SuppressWarnings({"all"})
//文件上传的客户端
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {

        //客户端链接服务端8888，得到Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //创建读取磁盘文件的输入流
        String filePath = "/Users/dreamtank131/Desktop/www.png";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));

        //bytes 就是filePath对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //通过socket获取到输出流，将bytes数据发送给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);//将文件对应的字节数组的内容，写入到数据通道
        bis.close();//关闭流
        socket.shutdownOutput();//结束标记


        ///======接收从服务端回复的消息==========
        InputStream inputStream = socket.getInputStream();
        //使用StreamUtils 的方法，直接将 inputStream 读取到内容 转成字符串
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);

        bos.close();
        socket.close();
        inputStream.close();
    }
}
