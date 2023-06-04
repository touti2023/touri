package Day0602.transformation;

import java.io.*;

//演示 OutputStreamWriter 使用
//把 FileOutputStream 字节流，转成字符流 OutputStreamWriter
//指定处理的编码 gbk/utf-8/utf8
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/dreamtank131/Desktop/SS.txt";
        String charSet = "utf-8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath),"gbk");
        osw.write("hi,hsp教育");
        osw.close();
        System.out.println("按照 " + charSet + " 保存文件成功~");
    }
}
