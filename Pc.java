package Day0513;


//编写pc子类，继承Computer类，添加特有属性【品牌brand】
public class Pc extends Computer {
	private String brand;

	public Pc(String cpu, int memory, int disk, String brand) {
		super(cpu, memory, disk);
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
