
public class PropertiesDetail {
	public static void main(String[] agrs) {
		
		class Person{
			int age;
			String name;
			double sal;
			boolean isPass;
		}
		
		Person p1 = new Person();
		
		System.out.println("\n当前人的信息");
		System.out.println("年龄" + p1.age + "名字" + p1.name + 
				"薪资" + p1.sal + "合格与否" + p1.isPass);
	}
}
//验证未赋值时，各项默认值。