package Day0518.Homework04;

public class Homework04 {
    public static void main(String[] args) {

        Manager manager = new Manager("刘备",100,20,1.2);
        //设置奖金，奖金是可以变化的
        manager.setBonus(3000);
        //打印经理的工资情况
        manager.printSal();

        Worker1 worker1 = new Worker1("关羽",50,10,1.0);
        worker1.printSal();
    }
}
