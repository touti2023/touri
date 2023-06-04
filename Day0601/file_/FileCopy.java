package Day0601.file_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String srcFilePath = "/Users/dreamtank131/Desktop/www.png";
        String desFilePath = "/Users/dreamtank131/www.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(desFilePath);

            // 逐个字节复制数据
            int data;
            while ((data = fileInputStream.read()) != -1) {
                fileOutputStream.write(data);
            }
            System.out.println("文件复制完成。");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
