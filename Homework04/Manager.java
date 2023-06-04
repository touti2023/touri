package Day0518.Homework04;

public class Manager extends Employee {
    //特有属性 奖金
    private double bonus;

    public Manager(String name, double daySal, int days, double grade) {
        super(name, daySal, days, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //重写父类方法
    public void printSal() {
        System.out.println("经理 " + getName() + " 的工资是 " + (bonus + getDaySal() * getDays() * getGrade()));
    }
}
