
/*
  
 应用案例：
请求出一个数组int【 】的最大值{4，-1，9，10，23}，并得到对应的下标。

思路：


 */

public class ArrayAssign {
	
	public static void main(String[] agrs) {
		
		  int [] arr1 = {1,2,3};
		  int [] arr2 = arr1;
		  arr2[0] = 10;
		  
		  System.out.println("====arr1的元素====");
		  for(int i = 0; i < arr1.length; i++) {
			  System.out.println(arr1[i]);
		  }
		  System.out.print("====arr2的元素====");
		  for(int i = 0; i < arr2.length; i++) {
			  System.out.println(arr2[i]);
		  }//数组重新赋值会影响到原先变量。即arr2 使数组里的元素改变，同样会传递给arr1，这里和基本类型赋值不同。基本类型赋值互不影响。
	}
}