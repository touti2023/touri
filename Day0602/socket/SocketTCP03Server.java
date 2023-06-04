package Day0602.socket;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

@SuppressWarnings({"all"})

//使用字符流
public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        //1.在本机的 9999 端口监听，等待链接
        ServerSocket serverSocket = new ServerSocket(9997);
        System.out.println("服务端，在9997端口监听，等待链接...");
        //2.当没有客户端链接9999端口时，程序会阻塞，等待链接
        Socket socket = serverSocket.accept();

        System.out.println("服务器端 socket= " + socket.getClass());
        //3.通过socket.getInputStream() 读取客户端写入到数据统通到的数据，显示
        InputStream inputStream = socket.getInputStream();
        //4.IO读取，使用字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
        //5.获取 Socket相关的输出流
        OutputStream outputStream = socket.getOutputStream();
        //使用字符输出流的方式回复信息
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello client 字符流");
        bufferedWriter.flush();//刷新
        bufferedWriter.newLine();//换行结束
        //6.关闭流和socket
        bufferedReader.close();
        socket.close();
        serverSocket.close();
        bufferedWriter.close();
    }
}
