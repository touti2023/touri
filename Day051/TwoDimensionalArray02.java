
public class TwoDimensionalArray02    {
	
	public static void main(String[] agrs) {
	
		int arr[][] = new int [2][3];
		//遍历arr数组
		for (int i = 0; i < arr.length; i++) {//遍历二维
			for(int j = 0; j < arr[i].length; j++) {//遍历一维
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	}