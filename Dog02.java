package Day0516;
//1.因为dog2是animal的子类，
//2.两者的 cay方法定义形式一样（名称，返回类型，参数）
//3.这时我们就说，子类的dog2的cry方法，覆盖了父类 animal的cry 方法。
public class Dog02 extends Animal{
	public void cry() {
		System.out.println("小狗汪汪叫...");
	}
}
