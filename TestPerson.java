package Day0511;


/*
课堂练习

定义Person类，里面有name，age属性，并提供compareTo比较方法，用于判断是否
和另一个人相等，提供测试类TestPerson用于测试，名字和年龄完全一样，就返回true，否则返回false。
 */
public class TestPerson {
     public static void main(String[] agrs) {
    	 Person p1 = new Person("king",30);
    	 Person p2 = new Person("king",30);
    	 
    	 System.out.println("p1和p2比较的结果是 " + p1.compareTo(p2));
     }
}

class Person {
	String name;
	int age;
	//构造器
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//compareTo比较方法
	public boolean compareTo(Person p) {
		//名字和年龄完全一样
	//	if(this.name.equals(p.name) && this.age == p.age) {
	//		return true;
	//	}else {
	//		return false;
	//	}
		return this.name.equals(p.name) && this.age == p.age;
	}
}