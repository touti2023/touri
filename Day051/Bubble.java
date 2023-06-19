
public class Bubble {
	public static void main(String[] args) {
		int[] arr = {22,-3,15,74,2};
		
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = 0; j < arr.length-1 -i; j++ ) {
				int temp = 0;
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1] = temp;
					
				}
			}
		}
		
		System.out.print("排序后的结果为=");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1 ) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i] + ",");
			}
		}
		
	}
}
