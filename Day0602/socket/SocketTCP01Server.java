package Day0602.socket;


import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //1.在本机的 9999 端口监听，等待链接
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待链接...");
        //2.当没有客户端链接9999端口时，程序会阻塞，等待链接
        Socket socket = serverSocket.accept();

        System.out.println("服务器端 socket= " + socket.getClass() );
        //3.通过socket.getInputStream() 读取客户端写入到数据统通到的数据，显示
        InputStream inputStream = socket.getInputStream();
        //4.IO读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLen));//根据读取到的实际长度，显示内容
        }
        //5.关闭流和socket
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
