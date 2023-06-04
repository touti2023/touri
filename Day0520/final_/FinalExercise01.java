package Day0520.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("面积=" + circle.calAres());
    }
}
class Circle {
    private double radius;
    private final double PI;

    //构造器


    public Circle(double radius) {
        this.radius = radius;
        PI = 3.14;
    }

    public double calAres() {
        return PI * radius * radius;
    }
}