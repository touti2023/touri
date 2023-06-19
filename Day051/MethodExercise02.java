

//编写一个方法copyPerson,可以复制一个Person对象，返回复制的对象。克隆对象。
//注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同。

public class MethodExercise02   {
	
	public static void main(String[] agrs) {
		Person1 p = new Person1();
		p.name = "米兰";
		p.age = 100;
		
		MyToolsn tools = new MyToolsn();
		Person1 p2 = tools.copyPerson(p);
		
		System.out.println("p的属性 age=" + p.age + "名字=" + p.name);
		System.out.println("p2的属性 age=" + p2.age + "名字=" + p2.name);
	}
}

class Person1 {
	String name;
	int age;
}

class MyToolsn {
/*编写思路
1.方法的返回类型 Person
2.方法的名字 copy Person
3.方法的形参 (Person p)
4.方法体 创建一个新对象，并复制属性，返回即可。
*/
	
	public Person1 copyPerson(Person1 p) {
		Person1 p2 = new Person1();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}
