package Day0518.homework05;

public class Teacher extends Employee {

    private int classDay;
    private double classSal;

    public Teacher(String name, double sal) {
        super(name, sal);
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public void printSal() {
        System.out.print("教师 ");
        System.out.println(getName() + " 的年薪是 " + (getSal() * getSalMonth() + classSal * classDay));
    }
}
