package Day0510;

//构造器：
//基本语法：修饰符 方法名（形参列表）{ 方法体
//}

//修饰符可以是默认
//构造器可以初始化对象，不能创建对象，
//没有返回值。
//方法名和类 名必须一致
//参数列表和成员方法一致
//自动生成不需要传递或引用。
//***构造器即便没有设定，也会有一个默认的无参构造器，如创建新的构造器则会销毁默认构造器，除非再次声明，
//否则无法使用默认构造器。
public class Constructor01 {
	public static void main(String[] agrs) {
		Person p1 = new Person("保国",70);
		System.out.println("p1的信息如下");
		System.out.println("p1对象的姓名是：" + p1.name);
		System.out.println("p1对象的年龄是；" + p1.age);
	}
}

//入门：
//在创建人类的对象时，直接指定年龄和姓名。

class Person {
	String name;
	int age;
	
	//构建构造器
	//1.构造器没有返回值。也不可以写void
	//2.构造器的名称和类Person一样。
	//3.(String pName,int pAge) 是构造器形参列表，规则和成员方法一样。
	public /*没有返回值*/Person(String pName,int pAge) {
		System.out.println("构造器被调用，已完成对象的属性初始化。");
		name = pName;
		age = pAge;
	}
}