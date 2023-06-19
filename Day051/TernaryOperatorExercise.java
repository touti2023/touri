
//三元运算符  课堂练习 
//实现三个数的最大值。

public class TernaryOperatorExercise {
	
	public static void main(String[] agrs) {

		int n1 = 55;
		int n2 = 31;
		int n3 = 123;
				
	//思路：
	//1.先得到n1和n2中的最大值 max1
	//2.再求max1和n3的最大值，得到结果max2.
	    int max1 = n1 > n2 ? n1 : n2;
	    int max2 = max1 > n3 ? max1 : n3;
	    System.out.println("最大值为" + max2);
	
	
	      }
	}