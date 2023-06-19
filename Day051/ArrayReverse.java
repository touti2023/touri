
//数据反转
//要求:把数组的元素内容反转。
//arr{11,22,33,44,55,66} >>>>>{66,55,44,33,22,11}

public class ArrayReverse {
	
	public static void main(String[] agrs) {
		
		int[] arr = {11,22,33,44,55,66};
		
		//使用逆序赋值的方式
		//思路：
		//1.先创建一个新的数组 arr2，大小 arrlength
		//2.逆序遍历 arr ，将 每个元素【顺序拷贝】到 arr2的元素中
		//3.增加一个循环变量 j 去匹配arr2的顺序拷贝。
		int[] arr2 = new int[arr.length];
		
		for(int i = arr.length - 1, j = 0; i >= 0; i--, j++ ) {
			 arr2[j] = arr[i];
		}
		//4.当for循环结束，arr2就是一个逆序的数组；{66,55,44,33,22,11}
		arr = arr2;  //让 arr 指向 arr2数据空间,arr原来的数据没有被变量引用，空间会被销毁。
		for(int i = 0; i < arr.length; i++) {  //遍历全新的arr，输出。
		System.out.print(arr[i] + "\t");
		}
	}
}