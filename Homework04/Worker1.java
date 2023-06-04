package Day0518.Homework04;

public class Worker1 extends Employee {
    public Worker1(String name, double daySal, int days, double grade) {
        super(name, daySal, days, grade);
    }
    public void printSal() {
        System.out.print("员工 " );
        super.printSal();
    }
}


