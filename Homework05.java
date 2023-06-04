package Day0511;

//定义一个圆类Circle，定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法。

public class Homework05 {
	public static void main(String[] agrs) {
		Circle circle = new Circle(3);
		System.out.println("面积=" + circle.area());
		System.out.println("周长=" + circle.len());
	}
}

class Circle {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {//面积
		return Math.PI * radius * radius;
	}
	
	public double len() {//周长
		return 2 * Math.PI * radius;
		
	}
}