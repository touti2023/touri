package Day0601.file_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FireReader_ {
    public static void main(String[] args) {

        String filePath = "/Users/dreamtank131/Desktop/a.txt";
        FileReader fileReader = null;
        int data = 0;
        //创建FR对象
        try {
            FileReader fileReader1 = new FileReader(filePath);
            //循环读取
            while ((data = fileReader1.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
