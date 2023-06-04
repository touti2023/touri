package Day0511;

public class Homework02 {

	public static void main(String[] agrs) {
		
		String[] strs = {"add","pdd","adds","jpt"};
		A02 a02 = new A02();
		int index = a02.find("pdd",strs);
		System.out.println("查找的索引为: " + index);
	}
}

//编写类 A02，定义方法find，实现查找某字符串是否在字符串数组中。并返回索引(即下标），
//如果找不到，返回-1，

//思路分析
//1.类名 A02
//2.方法名 find
//3.形参(String,String[[])
//4.返回值 int

class A02 {
	
	public int find(String findStr,String[] strs) {
		//直接遍历字符串数组，如果找到，则返回索引（下标）
		
		for(int i = 0; i < strs.length; i ++) {
			if(findStr.equals(strs[i])) {
				return i;
			}
			}
		return -1;
		}
	}
