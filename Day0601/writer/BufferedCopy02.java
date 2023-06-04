package Day0601.writer;

import java.io.*;

//要求：编程完成图片/音乐 的拷贝（要求使用Buffered...流）
//演示使用 BufferedOutputStream 和 BufferedInputStream 的使用
public class BufferedCopy02 {
    public static void main(String[] args) {

        String srcFilePath = "/Users/dreamtank131/Desktop/a.txt";
        String destFilePath = "/Users/dreamtank131/Desktop/a.txt";

        //创建对象
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

            //循环的读取文件，并写入到 destFilePath
            byte[] buff = new byte[1024];
            int readLen = 0;

            //当返回 -1 时，就表示文件读取完毕
            while ((readLen = bis.read(buff)) != -1) {
                bos.write(buff,0,readLen);
            }

            System.out.println("文件拷贝完毕~~~");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //关闭流，关闭外层的处理流即可，底层会去关闭节点流
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
