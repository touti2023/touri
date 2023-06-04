package Day0602.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Homework01 {
    public static void main(String[] args) throws IOException {

        /*
        1.在判断桌面下是否有文件夹mytemp，如果没有就创建mytemp
        2.在/Users/dreamtank131/Desktop/ 目录下，创建 hello.txt
        3.如果hello.txt 已经存在，提示该文件已经存在，不在创建
        4.并且在hello.txt 文件中，写入 hello,world.
         */

        String directoryPath = "/Users/dreamtank131/Desktop/SS.txt";
        File file = new File(directoryPath);
        if (file.exists()) {
            //创建
            if (file.mkdir()) {
                System.out.println("创建 "+ directoryPath + " 创建成功");
            } else {
                System.out.println("创建 "+ directoryPath + " 创建失败");
            }
        }

        String filePath = directoryPath + "\\hello.txt";
        file = new File(filePath);
        if (!file.exists()) {
            //创建文件
            if (file.createNewFile()) {
                System.out.println(filePath + " 创建成功");

                //如果文件存在，使用字符输入流写入内容
                BufferedWriter bf = new BufferedWriter(new FileWriter(file));
                bf.write("hello,world");
                bf.close();

            } else {
                System.out.println(filePath + " 创建失败");
            }
            } else {
                System.out.println(filePath + "已经存在，不再重复创建......");
            }
        }
    }

