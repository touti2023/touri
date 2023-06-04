package Day0531.tankgame;

//坦克大战的绘图区域

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    //定义我的坦克
    Hero hero = null;

    public MyPanel() {
         hero = new Hero(100, 200);//初始化自己的坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充颜色

        //画出坦克-封装方法
        drawTank(hero.getX(), hero.getY(), g, 0, 0);//第一个0代表向上，第二个0代表自己的坦克
    }

    //编写方法，画出坦克
    public void drawTank(int x, int y, Graphics g, int direct, int type) {

        switch (type) {
            case 0://我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向，来绘制坦克
        switch (direct) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//坦克身子
                g.fill3DRect(x + 10, y + 20, 20, 20, false);//坦克盖子
                g.drawLine(x + 20, y + 30, x + 20, y);//画出炮筒
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

}



