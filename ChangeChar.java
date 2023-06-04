//演示转义字符的使用
public class ChangeChar {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//\t: 一个制表位，实现对其功能
		System.out.println("北京\t天津\t上海");
		
		//\n:换行符
		System.out.println("jack\nsmith\nmary");
		
		//\\：一个\
		System.out.println("C:\\Windows\\System32\\cmd.exe");
		
		//\\\\：两个\
		System.out.println("C:\\\\Windows\\\\System32\\\\cmd.exe");
	
		
		//\"：一个"
		System.out.println("老韩说：\"要好好学习java，才有前途\"");
		
		//\'：一个‘
		System.out.println("老韩说：\'要好好学习java，才有前途\'");
		
		//\r：回车
		System.out.println("韩顺平教育\r北京");
		
		//\r\n：回车+换行
		System.out.println("韩顺平教育\r\n北京");
		//最后两个结果一样，但是视频演示不一样，不知道是不是软件的进步。。
	}
}