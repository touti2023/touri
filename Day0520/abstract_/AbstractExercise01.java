package Day0520.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        //测试
        Manager manager = new Manager("包拯",999,50000);
        manager.setBonus(8000);
        manager.work();

        CommonEmployee commonEmployee = new CommonEmployee("展昭",666,2000);
        commonEmployee.work();
    }
}
