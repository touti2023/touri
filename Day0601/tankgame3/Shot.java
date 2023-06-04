package Day0601.tankgame3;

public class Shot implements Runnable {

    int x;
    int y;
    int direct = 0;
    int speed = 20;
    boolean isLive = true;//子弹是否存活

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {//射击
        while (true) {

            //休眠50毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //根据方向来改变x，y坐标
            switch (direct) {
                case 0://向上
                    y -= speed;
                    break;
                case 1://向右
                    x += speed;
                    break;
                case 2://向下
                    y += speed;
                    break;
                case 3://向左
                    x -= speed;
                    break;
            }

            System.out.println("x= " + x + "y= " + y);
            //当子弹到边界时，把启动子弹的线程销毁
            //当子弹碰到坦克，也应该结束线程
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)) {
                isLive = false;
                break;
            }
        }

    }
}
