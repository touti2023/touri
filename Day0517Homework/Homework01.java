package Day0517Homework;


/*
定义一个Person类{name,age,job},初始化Person 对象数组，有3个person对象，
并按照 age 从 大到小 进行冒泡排序。
 */

public class Homework01 {

	public static void main(String[] args) {
		
		
	}
}

class Person {
	private String name;
	private int age;
	private String job;
	
	public Person(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
	  
	
	
}