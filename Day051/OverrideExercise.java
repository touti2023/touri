package Day0516;

/*
 1.编写一个Person类，包括属性/private（name，age），构造器，方法say（返回自我介绍的字符串）。
 2.编写一个Student类，继承Person类，增加id，score属性/private，以及构造器，定义say方法
 （返回自我介绍的字符串）。
 3.在main中，分别创建Person和Student对象，调用say方法输出自我介绍。
 */
public class OverrideExercise {
	public static void main(String [] args) {
		
		Person jack = new Person("jack",20);
		System.out.println(jack.say());
		
		Student ak = new Student("ak",22,3344556,99.5);
		System.out.println(ak.say());
	}
}
