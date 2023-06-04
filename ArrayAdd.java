/*
 要求：实现动态地给数组添加元素效果，实现对数组扩容。
 1.原始数组使用静态分配 int[] arr = {1,2,3}
 2.增加的元素4，直接放在数组的最后 arr = {1,2,3,4}
 3.用户可以决定是否继续日添加，添加成功，是否继续？ y/n
 
 思路分析:
 1.定义初始数组 int[] arr = {1,2,3}
 2.定义一个新的数组 int[] arrNew = new int[arr.length+1];
 3.遍历 arr，依次将arr的元素拷贝到 arrNew数组。
 4.将4 赋给 arrNew[arrNew.length = 1] = 4;即把4赋给arrNew的最后一个元素
 5.arr = arrNew;
 6.创建Scanner，接受输入。
 7.因为用户什么时候退出不确定，所以使用do-while + break来控制。
 
*/
import java.util.Scanner;
public class ArrayAdd {
	
	public static void main(String[] agrs) {
		
		Scanner myScanner = new Scanner(System.in);
		
		int[] arr = {1,2,3};
		do {
		int[] arrNew = new int[arr.length + 1];
		
		for(int i = 0;  i < arr.length; i ++) {
			arrNew[i] = arr[i];
		}
		
		System.out.println("请输入你要添加的元素");
		int addNum = myScanner.nextInt();
		arrNew[arrNew.length - 1] = addNum;
		arr = arrNew;
		
		System.out.println("=====arr扩容元素情况=====");
		for(int i = 0;  i < arr.length; i ++) {
		System.out.print(arr[i] + "\t");
		}
		System.out.println("添加成功，是否继续添加 y/n？");
		char key = myScanner.next().charAt(0);
		if(key == 'n') {
		 break;}
		}while(true);
		System.out.println("你退出了添加  ");
	}
}