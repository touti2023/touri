package Day0602.tankgame5;

//坦克大战的绘图区域

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//为了让 Panel 不停地重绘子弹，需要将 MyPanel 实现Runnable ，当作一个线程使用。
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    Hero hero = null;
    //定义敌人的坦克，放入到Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    //定义一个存放Node 对象的Vector，用于恢复敌人坦克的坐标和方向
    Vector<Node> nodes = new Vector<>();

    //定义一个Vector，用于存放炸弹
    //说明，当子弹击中坦克时，加入一个Bomb对象到bombs
    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSize = 3;//敌人数量

    //定义三张炸弹图片，用于显示炸弹效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;


    public MyPanel(String key) {
       nodes = Recorder.getNodesAndEnemyTankRec();
        //将MyPanel对象的 enemyTank 设置给 Recorder 的 enemyTanks
        Recorder.setEnemyTanks(enemyTanks);
        hero = new Hero(500, 200);//初始化自己的坦克
        hero.setSpeed(12);//初始化自己的坦克速度


        switch (key) {
            case "1":
                for (int i = 0; i < enemyTankSize; i++) {
                    //创建一个敌人坦克
                    EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);//初始化敌人位置
                    //将enemyTank 设置给 对象 !!!!!!!!!
                    enemyTank.setEnemyTanks(enemyTanks);
                    //设置方向
                    enemyTank.setDirect(2);
                    //启动敌人坦克线程，让它动起来
                    new Thread(enemyTank).start();
                    //给该enemyTank 加入一颗子弹
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
                    //加入enemyTank的Vector 成员
                    enemyTank.shots.add(shot);
                    //启动对象
                    new Thread(shot).start();
                    //加入
                    enemyTanks.add(enemyTank);
                }
                break;
            case "2":
                for (int i = 0; i < nodes.size(); i++) {
                    Node node = nodes.get(i);
                    //创建一个敌人坦克
                    EnemyTank enemyTank = new EnemyTank(node.getX(), node.getY());//初始化敌人位置
                    //将enemyTank 设置给 对象 !!!!!!!!!
                    enemyTank.setEnemyTanks(enemyTanks);
                    //设置方向
                    enemyTank.setDirect(node.getDirect());
                    //启动敌人坦克线程，让它动起来
                    new Thread(enemyTank).start();
                    //给该enemyTank 加入一颗子弹
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
                    //加入enemyTank的Vector 成员
                    enemyTank.shots.add(shot);
                    //启动对象
                    new Thread(shot).start();
                    //加入
                    enemyTanks.add(enemyTank);
                }
                break;
            default:
                System.out.println("你的输入有误.");
        }
        //初始化敌人的坦克

        //初始化图片对象
//        image1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bomb_1.png"));
//        image2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bomb_2.png"));
//        image3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bomb_3.png"));

    }

    //编写方法，显示我方击毁敌方坦克信息
    public void showInfo(Graphics g) {
        //画出玩家总成绩
        g.setColor(Color.BLACK);
        Font font = new Font("宋体", Font.BOLD, 25);
        g.setFont(font);

        g.drawString("已累计击毁敌方坦克",1020,30);
        drawTank(1020,60,g,0,0);//画出一个敌方坦克
        g.setColor(Color.BLACK);//重设文字颜色，避免被坦克颜色掩盖
        g.drawString(Recorder.getAllEnemyTankNum() + "",1080,100);//记分板坐标
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充颜色
        showInfo(g);
        if (hero != null && hero.isLive) {
            //画出坦克-封装方法
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);//第一个0代表向上，第二个0代表自己的坦克
        }
//        //画出Hero射击的子弹
//        if (hero.shot != null && hero.shot.isLive == true) {
//            // g.fill3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
//            g.draw3DRect(hero.shot.x, hero.shot.y, 2, 2, false);
//        }
        
        //将hero的子弹集合 shots，遍历取出绘制
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if(shot != null && shot.isLive == true) {
                g.draw3DRect(shot.x,shot.y,2,2,false);
            } else {//该对象无效，从集合中拿掉
                hero.shots.remove(shot);
            }
        }
        //如果bombs 集合中有对象，就画出
        for (int i = 0; i < bombs.size(); i++) {
            //取出炸弹
            Bomb bomb = bombs.get(i);
            //根据当前这个bomb对象的life值去画出对应的图片
            if (bomb.life > 6) {
                g.drawImage(image1,bomb.x,bomb.y,60,60,this);
            } else if (bomb.life > 3) {
                g.drawImage(image2,bomb.x,bomb.y,60,60,this);
            } else {
                g.drawImage(image3,bomb.x,bomb.y,60,60,this);
            }
            //让炸弹生命值减少
            bomb.lifeDown();
            //如果bomb life 为0，就从bombs 集合中删除
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }

        //画出敌人的坦克,要遍历Vector。因为不知道要出多少个
        for (int i = 0; i < enemyTanks.size(); i++) {
            //从Vector 中取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //判断当前坦克是否还存活
            if (enemyTank.isLive) {
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);

            //画出 enemyTank的所有子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                //取出子弹
                Shot shot = enemyTank.shots.get(j);
                //绘制
                if (shot.isLive) {
                    g.draw3DRect(shot.x, shot.y, 2, 2, false);
                } else {
                    //从 Vector 移除
                    enemyTank.shots.remove(shot);
                }
            }
            }
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
            if (hero.getY() > 10) {
                hero.moveUp();
            }

        } else if (e.getKeyCode() == KeyEvent.VK_D) {//右
            hero.setDirect(1);
            if (hero.getX() + 60 < 750) {
                hero.moveRight();
            }

        } else if (e.getKeyCode() == KeyEvent.VK_S) {//下
            hero.setDirect(2);
            if (hero.getY() + 100 < 750) {
                hero.moveDown();
            }

        } else if (e.getKeyCode() == KeyEvent.VK_A) {//左
            hero.setDirect(3);
            if (hero.getX() > 10) {
                hero.moveLeft();
            }
        }

        //如果按下J，就发射
        if (e.getKeyCode() == KeyEvent.VK_J) {

            //判断当前子弹是否销毁
//            if (hero.shot == null || !hero.shot.isLive)
//            //System.out.println("用户按下了J，开始射击！！！！");
//            hero.shotEnemyTank();
            //发射多颗子弹
            hero.shotEnemyTank();
        }
        //重绘
        this.repaint();
    }

    //所有子弹们都取出和敌人的所有坦克，进行判断
    public void hitEnemyTank() {

//        //遍历我们的子弹
//        for (int j = 0; j < hero.shots.size(); j++) {
//            Shot shot = hero.shots.get(j);
//
//        }
        //单个子弹
        if (hero.shot != null && hero.shot.isLive) {

            //遍历敌人
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                hitTank(hero.shot,enemyTank);
            }
        }
   }

    //编写方法，判断敌人子弹是否击中我方坦克
    public void hitHero() {
        //遍历所有的敌人坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出敌人坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //办理enemyTank 对象的所有子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
               //取出子弹
                Shot shot = enemyTank.shots.get(j);
                //判断 shot 是否击中我方坦克
                if (hero.isLive && shot.isLive) {
                    hitTank(shot,hero);
                }
            }
        }
    }
    //在run方法中去判断是否被击中。
    public void hitTank(Shot s, Tank enemyTank) {
        //判断 击中坦克
        switch (enemyTank.getDirect()) {
            case 0:
            case 2:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    //当子弹击中敌人后，将 enemyTank 从Vector 拿掉
                    enemyTanks.remove(enemyTank);
                    //当我们击毁一个时，++
                    if (enemyTank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
                    //创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1:
            case 3:
                if (s.x>enemyTank.getX()&&s.x<enemyTank.getX()+60
                &&s.y>enemyTank.getY()&&s.y<enemyTank.getY()+40) {
                    s.isLive =false;
                    enemyTank.isLive = false;
                    //当子弹击中敌人后，将 enemyTank 从Vector 拿掉
                    enemyTanks.remove(enemyTank);
                    //当我们击毁一个时，++
                    if (enemyTank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
                    //创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {//每隔 100毫秒，重绘区域
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //判断我们的子弹是否击中类敌人坦克
            hitEnemyTank();

            //判断敌人坦克击中我
            hitHero();


            this.repaint();
        }
    }
}



