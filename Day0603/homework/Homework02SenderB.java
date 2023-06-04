package Day0603.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

@SuppressWarnings({"all"})
public class Homework02SenderB {
    public static void main(String[] args) throws IOException {
        //创建一个 DatagramSocket 对象，准备在 9998端口 接收数据
        DatagramSocket socket = new DatagramSocket(9998);

        //2.将需要发送的数据，封装到 DatagramPacket对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题:");
        String question = scanner.next();
        byte[] data = question.getBytes();
        DatagramPacket packet =
                new DatagramPacket(data, data.length, InetAddress.getByName("192.168.12.1"), 8888);
        System.out.println("接收端 等待接收问题...");
        socket.send(packet);

        //3.==== 接收从A端回复的信息
        //构建一个 DatagramPacket 对象，准备接收数据
        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);
        //接收方法，将通过网络传输的 DatagramPacket 对象 填充到 packet对象
        //如果没有发送到本机 9998端口，就会阻塞等待
        socket.receive(packet);

        //4.可以吧packet 进行拆包，取出数据并显示。
        int length = packet.getLength();//实际接收到的数据字节长度
        data = packet.getData();//接收到数据
        String s = new String(data, 0, length);
        System.out.println(s);


        //关闭
        socket.close();
        System.out.println("B端退出...");
    }
}
