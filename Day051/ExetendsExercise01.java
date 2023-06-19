package Day0513;

/*
编写Computer类，包含cpu，内存，硬盘等属性，getDetails方法用于返回Computer的详细信息。
编写pc子类，继承Computer类，添加特有属性【品牌brand】
编写Notepad子类，继承Computer类，添加特有属性【color】。
编写ExetendsExercise01类，继承属性赋值，并打印输出信息。
 */
public class ExetendsExercise01 {
	public static void main(String[] args) { 
		Computer c = new Computer("i-7",1,2);
		Pc p = c.getPc(c, "Apple");
		NotePad n = c.getNotePad(c, "Yellow");
		c.printInfo(c,p,n);
	}
}
