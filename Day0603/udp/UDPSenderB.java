package Day0603.udp;

import java.io.IOException;
import java.net.*;
@SuppressWarnings({"all"})
public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //创建一个 DatagramSocket 对象，准备在 9998端口 接收数据
        DatagramSocket socket = new DatagramSocket(9998);

        //2.将需要发送的数据，封装到 DatagramPacket对象
        byte[] data = "hello,明天吃火锅~".getBytes();
        DatagramPacket packet =
                new DatagramPacket(data, data.length, InetAddress.getByName("192.168.12.1"), 9999);

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
