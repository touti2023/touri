package Day0602.socket;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

@SuppressWarnings({"all"})
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        //1.在本机的 9999 端口监听，等待链接
        ServerSocket serverSocket = new ServerSocket(9998);
        System.out.println("服务端，在9998端口监听，等待链接...");
        //2.当没有客户端链接9999端口时，程序会阻塞，等待链接
        Socket socket = serverSocket.accept();

        System.out.println("服务器端 socket= " + socket.getClass());
        //3.通过socket.getInputStream() 读取客户端写入到数据统通到的数据，显示
        InputStream inputStream = socket.getInputStream();
        //4.IO读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));//根据读取到的实际长度，显示内容
        }
        //5.获取 Socket相关的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes());
        //设置结束标记
        socket.shutdownOutput();

        //6.关闭流和socket
        inputStream.close();
        socket.close();
        serverSocket.close();
        outputStream.close();
    }
}
