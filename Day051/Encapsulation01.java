package Day0512;

/*
封装快速入门案例

请看一个小程序，不能随便查看人的年龄，工资等隐私。并对设置的年龄进行合理的验证。
年龄合理就设置，否则就给默认。年龄必须在1-120，工资不能直接查看，name长度在2-6之间。
 */
public class Encapsulation01 {
     public static void main(String[] args) {
    	 Person person = new Person();
    	 person.setName("ユウジ");
    	 person.setAge(15);
    	 person.setSalary(30000);
    	 System.out.println(person.info());
     }
}
 class Person {
	 public String name;//名字公开
	 private int age;//年龄 私有化
	 private double salary;//薪水 私有化
	 
	 
	 //自己写setXxx 和 getXxx太慢，我们使用快捷键。
	 //然后根据要求来完善我们的代码。
	 public void setName(String name) {
		 //加入对数据的校验，增加业务逻辑。
		 if(name.length() >= 2 && name.length() <= 6) {
			 this.name = name;
		 }else {
			 System.out.println("名字的长度不对，需要2-6个字符，默认名字");
			 this.name = "佚名";
		 }
		
	 }
	 public String getName() {
		 return name;
	 }
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		//加入控制判断
		if(age >= 1 && age <= 120) {//在合理范围内
		this.age = age;
		}else {
			System.out.println("你设置年龄不对，需要在（1-120）");
			this.age = 18;//给一个默认年龄
		}
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//写一个方法，返回属性信息。
	public String info() {
		return "信息为  姓名 " + name + " 年龄 " + age + " 薪水 " + salary;
	}
 }
  