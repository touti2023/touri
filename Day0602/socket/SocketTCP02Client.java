package Day0602.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

@SuppressWarnings({"all"})
//客户端，发送hello，server 给服务端
public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {

//1.链接服务器（ip，端口）
        Socket socket = new Socket(InetAddress.getLocalHost(), 9998);
        System.out.println("客户端，socket返回=" + socket.getClass());
//2.链接成功后，生成Socket，通过socket。grtOutputStream()
        OutputStream outputStream = socket.getOutputStream();
//3.通过输出流，写入数据到 数据通道
        outputStream.write("hello,server".getBytes());
//  设置结束标记
        socket.shutdownOutput();
//4.获取和Socket相关联的输入流，读取数据，并显示
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLen));
        }
//5.关闭流对象和socket
        outputStream.close();
        socket.close();
        inputStream.close();
        System.out.println("客户端退出...");
    }
}
