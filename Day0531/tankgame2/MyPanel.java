package Day0531.tankgame2;

//坦克大战的绘图区域

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    Hero hero = null;
    //定义敌人的坦克，放入到Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;//敌人尺寸

    public MyPanel() {
        hero = new Hero(100, 200);//初始化自己的坦克
        hero.setSpeed(12);//初始化自己的坦克速度

        //初始化敌人的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            //创建一个敌人坦克
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);//初始化敌人位置
            //设置方向
            enemyTank.setDirect(2);
            //加入
            enemyTanks.add(enemyTank);
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充颜色

        //画出坦克-封装方法
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);//第一个0代表向上，第二个0代表自己的坦克

        //画出敌人的坦克,要遍历Vector。因为不知道要出多少个
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),0);
        }
    }



    //编写方法，画出坦克
    public void drawTank(int x, int y, Graphics g, int direct, int type) {

        switch (type) {
            case 0://敌人的坦克
                g.setColor(Color.cyan);
                break;
            case 1://我的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向，来绘制对应形状的坦克
        //direct 表示方向（0:向上，1向右，2向下，3向左）
        switch (direct) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//坦克身子
                g.fill3DRect(x + 10, y + 20, 20, 20, false);//坦克盖子
                g.drawLine(x + 20, y + 30, x + 20, y);//画出炮筒
                break;

            case 1://右
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//坦克身子
                g.fill3DRect(x + 20, y + 10, 20, 20, false);//坦克盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出炮筒
                break;

            case 2://下
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//坦克身子
                g.fill3DRect(x + 10, y + 20, 20, 20, false);//坦克盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//画出炮筒
                break;

            case 3:
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//坦克身子
                g.fill3DRect(x + 20, y + 10, 20, 20, false);//坦克盖子
                g.drawLine(x + 30, y + 20, x, y + 20);//画出炮筒
                break;

            default:
                System.out.println("暂时没有处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理wdsa 按键情况
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            //改变坦克的方向
            hero.setDirect(0);//上
            //修改坦克坐标
            hero.moveUp();

        } else if (e.getKeyCode() == KeyEvent.VK_D) {//右
            hero.setDirect(1);
            hero.moveRight();

        } else if (e.getKeyCode() == KeyEvent.VK_S) {//下
            hero.setDirect(2);
            hero.moveDown();

        } else if (e.getKeyCode() == KeyEvent.VK_A) {//左
            hero.setDirect(3);
            hero.moveLeft();
        }
        //重绘
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}



