package Day0603.homework;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

@SuppressWarnings({"all"})

//使用字符流
public class Homework01Server {
    public static void main(String[] args) throws IOException {
        //1.在本机的 9999 端口监听，等待链接
        ServerSocket serverSocket = new ServerSocket(9997);
        System.out.println("服务端，在9997端口监听，等待链接...");
        //2.当没有客户端链接9999端口时，程序会阻塞，等待链接
        Socket socket = serverSocket.accept();

        //
        //3.通过socket.getInputStream() 读取客户端写入到数据统通到的数据，显示
        InputStream inputStream = socket.getInputStream();
        //4.IO读取，使用字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        String answer = "";
        if ("name".equals(s)) {
            answer = "我是hsp";
        } else if ("hobby".equals(s)) {
            answer = "编写java程序";
        } else {
            answer ="你说什么？";
        }

        //5.获取 Socket相关的输出流
        OutputStream outputStream = socket.getOutputStream();
        //使用字符输出流的方式回复信息
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write(answer);
        bufferedWriter.flush();//刷新
        bufferedWriter.newLine();//换行结束
        //6.关闭流和socket
        bufferedReader.close();
        socket.close();
        serverSocket.close();
        bufferedWriter.close();
    }
}
