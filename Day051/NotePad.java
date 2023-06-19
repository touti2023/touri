package Day0513;

//编写Notepad子类，继承Computer类，添加特有属性【color】。
public class NotePad extends Computer {
	private String color;

	public NotePad(String cpu, int memory, int disk, String color) {
		super(cpu, memory, disk);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
