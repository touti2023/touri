package Day0601.file_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//演示使用FileOutputStream 将数据写到文件中，如果该文件不存在，则创建该文件

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile() {
        // 创建对象
        String filePath = "/Users/dreamtank131/Desktop/a.txt";
        FileOutputStream fileOutputStream = null;

        try {
            // 得到一个对象
            fileOutputStream = new FileOutputStream(filePath);
            // 写入一个字节
            fileOutputStream.write('a');
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}