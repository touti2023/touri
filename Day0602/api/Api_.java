package Day0602.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

//演示InetAddress 类的使用
public class Api_ {
    public static void main(String[] args) throws UnknownHostException {

        //获取本机的InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//计算机名称/ip地址//usernoMBP/192.168.1.41

        //根据指定的主机名 获取 InetAddress对象
        InetAddress host1 = InetAddress.getByName("usernoMBP");
        System.out.println(host1);//usernoMBP/192.168.1.41

        //根据域名返回，InetAddress对象，比如 www.baidu.com 对应
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2);//119.63.197.139

        //通过 InetAddress对象，获取对应的地址
        String hostAddress = host2.getHostAddress();
        System.out.println(hostAddress);//119.63.197.139

        //通过 InetAddress对象，获取对应的主机名/或者地域名
        String hostName = host2.getHostName();
        System.out.println(hostName);//www.baidu.com
    }
}
