package Day0510;

public class ConstructorExercise {
	public static void main(String[] agrs) {
		Personn p1 = new Personn();//无参构造器
		System.out.println("p1的信息 名字=" + p1.name + "年龄=" +p1.age);//null,18
		
		Personn p2 = new Personn("许仙",35);
		System.out.println("p2的信息 名字=" + p2.name + "年龄=" +p2.age);//"许仙",35
	}
}
/*
 练习：
 在前面定义的Person类中添加两个构造器，
 第一个无参构造器，利用构造器设置所有人的age属性初始值为18，
 第二个带pName和pAge两个参数的构造器，
 使得每次创建Person对象的同时初始化对象的age属性值和name属性值，
 分别使用不同的构造器，创建对象。
 */

class Personn {
	String name;
	int age;
	//第一个无参构造器，利用构造器设置所有人的age属性初始值为18，
	public Personn() {
		age = 18;//18
	}
	
	//第二个带pName和pAge两个参数的构造器，
	public Personn(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
	
	
}