package Day0531.draw;

import javax.swing.*;
import java.awt.*;

/*
演示如何在面板上画出圆形
 */
//@SuppressWarnings({"all"})
public class DrawCircle extends JFrame{//画板 放入 画框

    //定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {//构造器
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口（画框）
        this.add(mp);
        //设置窗口大小
        this.setSize(400,300);
        //当点击窗口的小X，程序完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可视化

    }
}

//1.先定义一个画板：MyPanel,继承JPanel类，画图。
class MyPanel extends JPanel {

    //Graphics g 理解成一支画笔
    //Graphics g 提供了很多绘图方法
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);//调用父类方法完成初始化。
        //画出一个圆形
        //g.drawOval(10,10,100,100);

        //演示绘制不同的图形......
        //画直线 drawLine
        g.drawLine(10,10,100,100);


    }
}
