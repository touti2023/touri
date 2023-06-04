package Day0602.transformation;

import java.io.*;

//演示使用 InputStreamReader 转换流解决中文乱码问题
//将字节流 FileInputStream 转成字符流 InputStreamReader，指定编码 gbk/utf-8
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/dreamtank131/Desktop/a.txt";

        //把 FileInputStream 转成 InputStreamReader
        //指定编码 gbk
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"gbk");
        //把 InputStreamReader 传入 BufferedReader
        BufferedReader br = new BufferedReader(isr);
        //读取
        String s = br.readLine();
        System.out.println("读取内容 " + s);
        //关闭外层流
        br.close();
    }

}
