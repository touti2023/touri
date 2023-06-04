package Day0602.properties_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {
        //使用Properties 类来创建 配置文件，修改配置文件内容

        Properties properties = new Properties();
        //创建
        properties.setProperty("charset", "utf8");
        properties.setProperty("user", "汤姆");
        properties.setProperty("pwd", "abc111");

        //将k-v 存储文件中即可
        properties.store(new FileOutputStream("src/mysql2.Properties"), null);
        System.out.println("保存配置成功~");
    }
}
