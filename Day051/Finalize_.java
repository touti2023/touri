package Finalize_;

public class Finalize_ {

	public static void main(String args) {
		
		Car bmw = new Car("宝马");
		bmw = null;
		//这时，没有被引用，就会被垃圾回收器销毁。在销毁前，会调用该对象的finalize方法。
		//程序员就可以在finalize中，写自己的业务逻辑代码
		//如果程序员不重写 finalize，那么就会调用 Object类的 finalize，即默认处理。
		//如果程序员重写了finalize，就可以实现自己的逻辑。
		System.gc();//主动调用垃圾回收器
		System.out.println("程序退出了...");
	}
}
class Car {
	private String name;

	public Car(String name) {
		super();
		this.name = name;
	}
	//重写finalize
	
	protected void finalize() throws Throwable {
		System.out.println("我们销毁 汽车" + name);
		System.out.println("释放了某些资源......" );
	}
	
}
