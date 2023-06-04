package Day0602.tankgame5;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

//为了监听 键盘事件，实现KeyListener
public class HspTankGame05 extends JFrame  implements KeyListener {

    //定义MyPanel
    MyPanel mp = null;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        HspTankGame05 hspTankGame05 = new HspTankGame05();
    }

    public HspTankGame05() {//绘制区域
        System.out.println("请输入选择：1 新游戏 / 2 继续游戏");
        String key = scanner.next();
        mp = new MyPanel(key);
        //将mp 放入到Thread，并启动
        Thread thread = new Thread(mp);
        thread.start();

        this.add(mp);
        this.setSize(1300,950);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        //在JFrame 中增加响应关闭窗口的处理
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecord();
                System.exit(0);
            }
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }


    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
