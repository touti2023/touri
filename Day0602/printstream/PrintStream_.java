package Day0602.printstream;

import java.io.IOException;
import java.io.PrintStream;

//演示 PrintStream 字节打印流
public class PrintStream_ {
    public static void main(String[] args) throws IOException {

        PrintStream out = System.out;
        out.print("john,hello");

        //因为print底层使用的时write，所以我们可以直接调用write进行打印输出
        out.write("heool".getBytes());

        out.close();

        //可以去修改打印输出流的位置/设备
        //输出修改到"/Users/dreamtank131/Desktop/gg.txt"
        //"ye!oooo" 就会输出到 该位置
        System.setOut(new PrintStream("/Users/dreamtank131/Desktop/gg.txt"));
        System.out.println("ye!oooo");
    }
}
