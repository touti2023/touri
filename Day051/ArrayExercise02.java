
/*
  
 应用案例：
请求出一个数组int【 】的最大值{4，-1，9，10，23}，并得到对应的下标。

思路：


 */

public class ArrayExercise02 {
	
	public static void main(String[] agrs) {
		
		int[] arr = {4,-1,9,10,23,110,-23,56,888,-256,1844,-999,13834};
		int max = arr[0];//嘉定第一个元素就是最大值
		int maxIndex = 0;//为最大值下标
		for(int i = 1; i < arr.length;i++ ) {//从下标1开始遍历，因为0就是本身。
			if(max < arr[i]) { //如果max《当前元素
				max = arr[i];  //就把max 设置成 当前元素
				maxIndex = i; //下标也匹配上
			}
		}//当我们遍历整个数组后，max就是真正的最大值，maxIndex为最大值下标
		System.out.println("最大值为:" +max +  "最大值对应的下标为:" + maxIndex);
		
		
	}
}
	