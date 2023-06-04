

//数组拷贝
//将int[] arr1 = {10,20,30};拷贝到arr2数组，要求数据空间是独立的。（即互不影响所包含元素）
public class ArrayCopy {
	
	public static void main(String[] agrs) {
		int[] arr1 = {10,20,30};
		
		//创建一个新的数组arr2，开辟新的数据空间，大小 arr1.length;
		
		int[] arr2 = new int[arr1.length];
		
		//遍历arr1，把每个元素拷贝到arr2对应元素的位置。
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
	//////此时修改 arr2 就不会影响arr1 的元素。//////////
		arr2[0] = 100;
		//输出arr 1试试
		for(int i = 0; i < arr1.length; i++)
		System.out.println(arr1[i]);
		
		for(int i = 0; i < arr1.length; i++) {
		System.out.println(arr2[i]);
	}
	}
}