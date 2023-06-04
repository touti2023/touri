package Day0518.Homework04;

public class Employee {

    private String name;
    private double daySal;
    private int days;
    private double grade;

    public Employee(String name, double daySal, int days, double grade) {
        this.name = name;
        this.daySal = daySal;
        this.days = days;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    //方法名
    public void printSal() {
        System.out.println(name + " 的工资是 " + daySal * days * grade);
    }
}
