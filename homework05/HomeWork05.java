package Day0518.homework05;

public class HomeWork05 {
    public static void main(String[] args) {

        Worker jack = new Worker("jack", 10000);
        jack.printSal();

        Peasant peasant = new Peasant("sjs",550);
        peasant.printSal();

        Teacher teacher = new Teacher("马云",2000);
        //老师有课时费，额外计算
        teacher.setClassSal(1000);
        teacher.setClassDay(300);
        teacher.printSal();

        Scientist scientist = new Scientist("钟南山", 20000);
        scientist.setBonus(2000000);
        scientist.printSal();

        Waiter xz = new Waiter("小张", 3500);
        xz.printSal();
    }
}
