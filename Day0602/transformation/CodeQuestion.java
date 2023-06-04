package Day0602.transformation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//看一个中文乱码问题
public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        //读取“/Users/dreamtank131/Desktop/a.txt”
        //创建字符输入流 BufferedReader【处理流】
        //使用 BufferedReader 对象读取a.txt

        String filePath = "/Users/dreamtank131/Desktop/a.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String s = br.readLine();
        System.out.println("读取到的内容 " + s);
        br.close();
    }
}
