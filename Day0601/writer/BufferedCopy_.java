package Day0601.writer;

import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) {

        //1.BufferedReader 和 BufferedWriter 是安装字符操作
        //2.不要去操作 二进制文件 可能造成文件损坏

        String srcFilePath = "/Users/dreamtank131/Desktop/a.txt";
        String destFilePath = "/Users/dreamtank131/Desktop/a2.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));

            //说明：readLine 读取一行内容，但是没有换行
            while ((line = br.readLine()) != null) {
                //每读取一次，就写入
                bw.write(line);
                //插入一个换行
                bw.newLine();
            }
            //

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
