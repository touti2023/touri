package Day0520.abstract_;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override//继承抽象类必须要重写抽象方法
    public void work() {
        System.out.println("经理 " + getName() + " 正在工作中...");
    }

}
