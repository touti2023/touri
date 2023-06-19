package Day0511;
/*
创建一个Employee类，
属性有（名字，性别，年龄，职位，薪水），提供3个构造器，可以初始化：
（1）（名字，性别，年龄，职位，薪水）
（2）（名字，性别，年龄）
（3）（职位，薪水）
要求充分复用构造器
 */
public class Homework10 {
	public static void main(String[] args) {
		   
	   }
}

class Employee {
	//名字，性别，年龄，职位，薪水
	String name;
	char gender;
	int age;
	String job;
	double sal;
	//因为要求复用，所以先写属性少的构造器  第一个构造器
	//职位，薪水
	public Employee(String job,double sal) {
		this.job = job;
		this.sal = sal;
	} 
	//名字，性别，年龄  第二个构造器
	public Employee(String name,char gender,int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	//名字，性别，年龄，职位，薪水 第三个构造器
	public Employee(String job,double sal,String name,char gender,int age) {
		this(name,gender,age);
		//可以使用前面的构造器，但是由于this语句只能在第一行引用，所以第二个不能这样掉用。
		//只能再写一遍
		this.job = job;
		this.sal = sal;
	}
}