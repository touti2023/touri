package Day0601.file_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {

        String filePath = "/Users/dreamtank131/Desktop/a.txt";
        //创建对象
        FileWriter fileWriter1 = null;
        char[] chars = {'a','b','c'};
        try {
            fileWriter1 = new FileWriter(filePath);
            //写入单个字符
            fileWriter1.write('H');
            //写入指定数组
            fileWriter1.write(chars);
            //写入指定数组
            fileWriter1.write("hsp".toCharArray(),0,3);
            //写入整个字符串
            fileWriter1.write(" 你好北京～");
            //写入字符串的指定部分
            fileWriter1.write("上海天津",0,2);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //对应FileWriter，一定要关闭流，或者flush才能真正把数据写入到文件
            try {
                fileWriter1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("程序结束");
    }
}
