package Day051603obkect_;

public class EwqualsExercise01 {

	public static void main(String[] args) {
		Person person1 = new Person("jack",10,'男');
		Person person2 = new Person("jack",10,'男');
		
		System.out.println(person1.equals(person2));//false
		
	}
}

class Person {
	private String name;
	private int age;
	private char gender;
	
	//重写Object 的 equals方法
	public boolean equals(Object obj) {
		//如果鼻尖的两个对象相同，则直接返回true。
		if(this == obj) {
			return true;
		}
		//再判断类型
		if(obj instanceof Person) {//是Person才比较。
			
			//进行 向下转型，因为我需要得到obj的 各个属性
			Person p = (Person)obj;
			return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
		}
		return false;
	}
	//以上 改完返回true。
	
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}