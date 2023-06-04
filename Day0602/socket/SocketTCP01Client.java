package Day0602.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端，发送hello，server 给服务端
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {

//1.链接服务器（ip，端口）
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端，socket返回=" + socket.getClass());
//2.链接成功后，生成Socket，通过socket。grtOutputStream()
        OutputStream outputStream = socket.getOutputStream();
//3.通过输出流，写入数据到 数据通道
        outputStream.write("hello,server".getBytes());
//4.关闭流对象和socket
        outputStream.close();
        socket.close();
        System.out.println("客户端退出...");
    }
}
