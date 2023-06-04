package Day0518.homework05;

public class Peasant extends Employee{
    public Peasant(String name, double sal) {
        super(name, sal);
    }

    public void printSal() {
        System.out.println("农民 ");
        super.printSal();
    }
}
