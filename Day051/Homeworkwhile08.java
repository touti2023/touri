/*
求出1-1/2+1/3-1/4...1/100 的和

 思路分析:
 1.1-1/2+1/3-1/4...1/100 = （1/1）-(1/2)+(1/3)-(1/4)...1/100
 2.分析：一共有100个数，分子为1；坟墓为1-100
 3.分母为奇数时，前面是+；分母为偶数时，前面为 -
 4.把结果存放到 double sum里
 5.确保精度，分子应为1.0 *****
 */



public class Homeworkwhile08 {
	
	public static void main(String[] agrs) {
		
		double sum = 0;
		for(int i = 1; i <= 100; i++) {
			//判断时奇偶，然后不同处理。
			if(i % 2 != 0) { //分母是奇数
			sum += 1.0/i;
			}else {//分母是偶数
				sum -= 1.0/i;
			}
		}
		System.out.println("sum=" + sum);
	}
}