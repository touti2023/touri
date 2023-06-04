package Day0602.transformation;

//演示 PrintWriter 使用方式

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {

        //PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter("/Users/dreamtank131/Desktop/f2.txt"));
        printWriter.print("hi,Beijing");
        printWriter.close();
    }
}
