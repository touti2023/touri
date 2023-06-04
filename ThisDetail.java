package Day0510;
//this
/*
1.this 关键字可以用来访问本类的属性，方法，构造器
2.this用户区分当前类的属性和局部变量
3.访问成员方法的语法：this.方法名(参数列表);
4.访问构造器语法：this(参数列表);注意只能在构造器中使用（即只能在构造器中访问另外一个构造器）。
  ***且必须放在第一条语句。
5.this不能在类定义的外部使用，只能在类定义的方法中使用。
 */
public class ThisDetail {
	public static void main(String[] agrs) {
     // T t1 = new T();
    //  t1.f2();
		T t2 = new T();
    }
}

class T {
	
	//4.访问构造器语法：this(参数列表);注意只能在构造器中使用（即只能在构造器中访问另外一个构造器）。 
	
	//**注意：访问构造器语法：this(参数列表)；必须放置在第一条语句。
	public T() {
		//这里去访问 ("T(String name, int age) 构造器")
		this("jack",100);
	    System.out.println("T() 构造器");
	
	    
	}
	public T(String name, int age) {
		System.out.println("T(String name, int age) 构造器");
	}
	public void f1() {
		System.out.println("f1()方法...");
	}
	public void f2() {
		System.out.println("f2()方法...");	
		
		//调用本类的第一种方式
		f1();
		//第二种方式
		this.f1();
		
   }
}