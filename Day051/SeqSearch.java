import java.util.Scanner;
public class SeqSearch    {
	
	public static void main(String[] agrs) {
	
		String[] names = {"关羽","张飞","马超","黄忠"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入名称");
		String findName = myScanner.next();
		
		int index = -1;
		for(int i = 0; i < names.length; i ++) {
			if(findName.equals(names[i])) {
				System.out.println("恭喜你，找到" + findName);
				System.out.println("下标为:" + i);
				index = i;
				break;
			}
				}
		if(index == -1) {
			System.out.println("很遗憾，没有找到" + findName);
		}
		
	}
}