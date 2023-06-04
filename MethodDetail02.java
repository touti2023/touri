
public class MethodDetail02   {
	
	public static void main(String[] agrs) {
		
		A a = new A();
		a.sayOk();
		a.m1();
	}
}

class A {
	
	//同一类中方法可以直接调用。
	
	public void print(int n) {
		System.out.println("print()方法被调用" + n);
	}
	
	public void sayOk() {
		print(10);
		System.out.println("继续执行sayOk()");
	}
	
	public void m1() {
		//跨类引用时：创建B对象，然后调用即可。
		System.out.println("m1()方法被调用");
		B b = new B();
		b.hi();
		
		System.out.println("m1()继续执行");
	}
}

//跨类中的方法A类调用b类方法:需要通过对象名调用

class B {
	public void hi() {
		System.out.println("B类中的 hi()被执行");
	}
}