package Day0602.tankgame5;

import java.io.*;
import java.util.Vector;

@SuppressWarnings({"all"})
//Recorder 用于记录相关信息，和文件交互
public class Recorder {
    //定义变量，记录我放机会敌人坦克数
    private static int allEnemyTankNum = 0;
    //定义IO对象，坐标写数据到文件中
    private static FileWriter fw = null;
    private static BufferedWriter bw = null;
    private static BufferedReader br = null;
    private static String recordFile = "/Users/dreamtank131/Desktop/a.txt";
    //定义Vector，指向 MyPanel 对象的 敌人坦克Vector
    private static Vector<EnemyTank> enemyTanks = null;
    //定义一个Node 的Vector，用于保存敌人的信息node
    private static Vector<Node> nodes = new Vector<>();

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }

    //增加一个方法，用于读取recordFile，恢复相关信息
    public static Vector<Node> getNodesAndEnemyTankRec() {
        try {
            br = new BufferedReader(new FileReader(recordFile));
            allEnemyTankNum = Integer.parseInt(br.readLine());
            //循环读取文件，生产nodes 集合
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] xyd = line.split(" ");
                Node node = new Node(Integer.parseInt(xyd[0]),
                        Integer.parseInt(xyd[1]),
                        Integer.parseInt(xyd[2]));
                nodes.add(node);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return nodes;
    }
    //增加一个方法，当游戏退出时，我们将allEnemyTankNum 保存到 recordFile
    //对 keepRecord 进行升级，保存敌人的坐标和方向

    public static void keepRecord() {
        try {
            bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write(allEnemyTankNum + "\r\n");
            //遍历敌人坦克的Vector集合，然后根据情况保存
            //OOP，定义一个属性，然后通过setXxx得到 Vector
            for (int i = 0; i < enemyTanks.size(); i++) {
                //取出敌人的坦克
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLive) {//建议判断
                    //保存信息
                    String record = enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirect();
                    //写入文件
                    bw.write(record + "\r\n");

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    //当我方坦克击毁一个敌人坦克，就++
    public static void addAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }
}
