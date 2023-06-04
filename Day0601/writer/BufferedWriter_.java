package Day0601.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//演示BufferedWriter_的使用
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/dreamtank131/Desktop/a.txt";
        //创建对象
        //1.FileWriter(filePath,true) 表示以追加的方式写入
        //2.FileWriter(filePath)，表示以覆盖的方式写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hello,韩顺平教育");
        bufferedWriter.newLine();//插入一个换行
        bufferedWriter.write("hello,韩顺平教育");
        bufferedWriter.newLine();
        bufferedWriter.write("hello,韩顺平教育");
        bufferedWriter.newLine();
        //插入一个换行

        //关闭外层流即可
        bufferedWriter.close();
    }
}
