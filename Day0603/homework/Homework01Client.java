package Day0603.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

@SuppressWarnings({"all"})
//使用字符流
//客户端，发送hello，server 给服务端
public class Homework01Client {
    public static void main(String[] args) throws IOException {

//1.链接服务器（ip，端口）
        Socket socket = new Socket(InetAddress.getLocalHost(), 9998);
        System.out.println("客户端，socket返回=" + socket.getClass());
//2.链接成功后，生成Socket，通过socket。grtOutputStream()
        OutputStream outputStream = socket.getOutputStream();
//3.通过输出流，写入数据到 数据通道，使用字符流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        //从键盘读取用户的问题
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String question = scanner.next();

        bufferedWriter.write(question);
        bufferedWriter.newLine();//插入换行符，表示写入内容结束
        bufferedWriter.flush();//字符流必须刷新，否则无效
//  设置结束标记
        socket.shutdownOutput();
//4.获取和Socket相关联的输入流，读取数据（字符），并显示
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
//5.关闭流对象和socket
        bufferedReader.close();
        socket.close();
        bufferedWriter.close();//关闭外层流
        System.out.println("客户端退出...");
    }
}
