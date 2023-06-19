package PolyObject;

public class PolyObject {
	public static void main(String [] args) {
		//体验对象多态的特点
		
		//animall 的编译类型就是Animal, 运行类型是Dog
		Animal animal = new Dog();
		//因为云从类型是Dog，所以cry就是DOg的cry，
	animal.cry();//小狗汪汪叫。
	
	//
	animal = new Cat();
	animal.cry();
	}
}
