package Day0601.file_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

//演示创建文件
public class FileCreate {
    public static void main(String[] args) {

    }

    //方式1 new file(String pathname)
    @Test
    public void create01() throws IOException {
        String filePath = "/Users/dreamtank131/Desktop.txt";
        File file = new File(filePath);

        file.createNewFile();
    }
}
