package Day0603.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1.创建一个 DatagramSocket 对象，准备在9999接收数据
        DatagramSocket socket = new DatagramSocket(9999);
        //2.构建一个 DatagramPacket 对象，准备接收数据
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //3.调用接收方法，将通过网络传输的 DatagramPacket 对象 填充到 packet对象
        //如果没有发送到本机 9999端口，就会阻塞等待
        System.out.println("接收端A等待接收数据......");
        socket.receive(packet);

        //4.可以吧packet 进行拆包，取出数据并显示。
        int length = packet.getLength();//实际接收到的数据字节长度
        byte[] data = packet.getData();//接收到数据
        String s = new String(data, 0, length);
        System.out.println(s);

        //=========回复信息给B端=======

        //2.将需要发送的数据，封装到 DatagramPacket对象
        data = "好的，明天见".getBytes();
        packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.12.1"), 9998);

        socket.send(packet);//发送

        //5.关闭资源
        socket.close();
        System.out.println("A端退出...");
    }
}
