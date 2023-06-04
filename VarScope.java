package Day0510;


//作用域：

public class VarScope {
   public static void main(String[] agrs) {
	   
   }
}
class Cat {
	//全局变量:也就是属性，作用域为整个类体 Cat类:cry eat 等方法使用属性
	//属性在定义时，可以直接赋值
	int age = 10;//Cat类下的变量，全局皆可使用。
	
	public void cry() {
		//1.局部变量一般是指在成员方法中定义的变量
		//2.n 和 name 就是Cat类下，cyr方法中的定义变量，即局部变量。
		//局部变量只能在本方法中使用。
		int n = 10;
		String name = "kils";
		System.out.println("在cry中使用属性 age=" + age);//成功，age为全局变量。
	}
	
	public void eat() {
		//System.out.println("在eat中使用属性 name=" + name);//不成功，name为局部变量。
	}
	
}