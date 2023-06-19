package PolyArray_;
	

	//多态实例应用
	//现有一个继承结构如下：要求创建1个Person对象，
	//2个Student对象和2个Teacher对象，统一放在数组中，并调用每个对象的say方法。
public class PolyArray {
	public static void main(String[] args) {
		Person [] persons = new Person [5];
		persons[0] = new Person("jack",22);
		persons[1] = new Student("maria",16,97);
		persons[2] = new Student("Black",17,55);
		persons[3] = new Teacher("Song",29,18000);
		persons[4] = new Teacher("Zhao",49,33000);
		
		//循环遍历多态数组，调用每一个say方法。
		for(int i = 0; i < persons.length; i++) {
			//person[i] 编译类型是 Person，运行类型是根据 = 右侧实际情况来改变。
			persons[i].say();//动态绑定机制
			//输出
			System.out.println(persons[i].say());
			
			//第二题，输出Student 和Teacher 各自特有的方法。
			//使用类型判断 + 向下转型。
			if(persons[i] instanceof Student) {
				Student student = (Student)persons[i];
				student.study();//更加简化；((Student)persons[i]).sutdy();
			}else if(persons[i] instanceof Teacher) {
				((Teacher)persons[i]).teach();
			}else {
			}
		}
	}
}
