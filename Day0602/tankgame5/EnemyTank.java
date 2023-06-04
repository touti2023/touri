package Day0602.tankgame5;

import java.util.Vector;

//敌人的坦克
public class EnemyTank extends Tank implements Runnable {

    //在敌人坦克类，使用Vector 保存多个Shot
    Vector<Shot> shots = new Vector<>();
    //增加成员，EnemyTank 可以得到敌人坦克的Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();

    //坦克生命
    boolean isLive = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }

    //编写方法，防止坦克重叠
    public boolean isTouchEnemyTank() {

        //判断当前敌人坦克（this）方向
        switch (this.getDirect()) {
            case 0:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //上下的情况
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌人坦克是左右的情况
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //上下的情况
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌人坦克是左右的情况
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 2:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //上下的情况
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 60) {
                                return true;
                            }
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌人坦克是左右的情况
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;
                            }
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 3:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //上下的情况
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌人坦克是左右的情况
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
        }
        return false;
    }


                @Override
                public void run () {
                while (true) {

                    //创建子弹，放入shots集合，并启动
                    if (isLive && shots.size() < 3) {
                        Shot s = null;
                        //判断方向，创建子弹
                        switch (getDirect()) {
                            case 0:
                                s = new Shot(getX() + 20, getY(), 0);
                                break;

                            case 1:
                                s = new Shot(getX() + 60, getY() + 20, 1);
                                break;

                            case 2:
                                s = new Shot(getX() + 20, getY() + 60, 2);
                                break;

                            case 3:
                                s = new Shot(getX(), getY() + 20, 3);
                                break;
                        }
                        shots.add(s);
                        new Thread(s).start();//启动
                    }
                    //根据坦克的方向继续移动
                    switch (getDirect()) {
                        case 0:
                            //让坦克保持一个方向，走30步
                            for (int i = 0; i < 30; i++) {
                                if (getY() > 0 && !isTouchEnemyTank()) {
                                    moveUp();
                                }
                                //休眠100毫秒
                                try {
                                    Thread.sleep(100);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            break;

                        case 1:
                            for (int i = 0; i < 30; i++) {
                                if (getX() + 60 < 1000 && !isTouchEnemyTank()) {
                                    moveRight();
                                }
                                //休眠100毫秒
                                try {
                                    Thread.sleep(100);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            break;

                        case 2:
                            for (int i = 0; i < 30; i++) {
                                if (getY() + 60 < 750 && !isTouchEnemyTank()) {
                                    moveDown();
                                }
                                //休眠100毫秒
                                try {
                                    Thread.sleep(100);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            break;

                        case 3:
                            for (int i = 0; i < 30; i++) {
                                if (getX() > 0 && !isTouchEnemyTank()) {
                                    moveLeft();
                                }
                                //休眠100毫秒
                                try {
                                    Thread.sleep(100);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            break;
                    }
                    //然后随机改变坦克方向 0-3
                    setDirect((int) (Math.random() * 4));
                    //写并发程序，一定要考虑什么时候结束。
                    if (!isLive) {//一旦被打爆就立即结束线程
                        break;
                    }
                }
            }
        }
