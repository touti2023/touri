
//数组的引出

public class Array01 {
	
	public static void main(String[] agrs) {
		
	/*	double hen1 = 3;
		double hen2 = 5;
		double hen3 = 1;
		double hen4 = 3.4;
		double hen5 = 2;
		double hen6 = 50;
		
		double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
		double avgWeight = totalWeight / 6;
		System.out.println("总体重" + totalWeight + "平均体重" + avgWeight);
		*/
		
		//不灵活，用数组来解决：
		
		double[] hens = {3,5,1,3.4,2,50};
		double totalWeight = 0;
		//数组的长度：数组名.length
		for(int i = 0; i < hens.length; i++) {
			totalWeight += hens[i];
		}
		System.out.println("总体重" + totalWeight + "平均体重" + totalWeight / hens.length);
		
		
	}
}