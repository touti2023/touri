package Day0531.tankgame2;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//为了监听 键盘事件，实现KeyListener
public class HspTankGame02 extends JFrame  implements KeyListener {

    //定义MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {

        HspTankGame02 hspTankGame02 = new HspTankGame02();
    }

    public HspTankGame02() {//绘制区域
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
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
