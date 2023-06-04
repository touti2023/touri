package Day0518.homework05;

public class Worker extends Employee{
    public Worker(String name, double sal) {
        super(name, sal);
    }

    public void printSal() {
        System.out.println("工人 ");
        super.printSal();
    }
}
