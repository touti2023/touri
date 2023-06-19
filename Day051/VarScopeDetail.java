package Day0510;


//作用域的细节
//1.全局变量和局部变量可以重名，访问是遵循就近原则。
//2.全局变量（属性）生命周期较长，伴随对象的创建而创建；伴随着对象的销毁而销毁。
//局部变量生命周期较短，即在一次方法调用过之后销毁。
//3.同一个作用域中，两个局部变量不能重名。会导致无法判断。
//类和类之间的全局变量可以通过对象调用使用，局部变量不可以。
//4.全局变量可以前缀添加修饰符，如public...等，局部变量不可。
public class VarScopeDetail {
	public static void main(String[] agrs) {
		   Pers p1 = new Pers();
		   p1.say();//当执行say方法时，say方法的局部变量name会创建，当say方法执行完毕之后
		   //name局部变量就会被销毁，但是全局变量仍然可以使用。
		   TTT t1 = new TTT();
		   t1.test();//通过TTT类创建的的对象t1，调用Pers类的全局变量 name。成功//jack
	   }
}
class TTT {
	public void test() { //属性/全局变量可以加修饰符。
		Pers p1 = new Pers();
		System.out.println(p1.name);//jack 调用其他类的全局变量，ok
	}
}

class Pers {
	String name = "jack"; //全局变量
	//public int age = 11;//局部变量不可添加修饰符
	
	public void say() {
		String name = "king"; //局部变量，都是String name，但就近输出 局部变量的 king
		
		System.out.println("say() name=" + name);
		
	}
}
