package Day0513;


//编写Computer类，包含cpu，内存，硬盘等属性，getDetails方法用于返回Computer的详细信息。
public class Computer {
	private String cpu;
	private int memory;
	private int disk;
	public Computer(String cpu, int memory, int disk) {
		super();
		this.cpu = cpu;
		this.memory = memory;
		this.disk = disk;
	}
	//按要求，返回Computer信息 
	public String getDetails() {
		return "cpu= " + cpu + "memory=" + memory + "disk=" + disk;
	}
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public int getDisk() {
		return disk;
	}
	public void setDisk(int disk) {
		this.disk = disk;
	}
	
	public Pc getPc(Computer c, String brand) {
		return new Pc(cpu,memory,disk,brand);
	}
	
	public NotePad getNotePad(Computer c, String color) {
		return new NotePad(cpu,memory,disk,color);
	}
	
	public void printInfo(Computer c,Pc p,NotePad n) {
		System.out.println("Computer信息为:");
		System.out.println(c.getDetails() + " brand=" + p.getBrand() + " color=" + n.getColor());
	}
}
