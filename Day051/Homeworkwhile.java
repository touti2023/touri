
/*

某人有100，000元，每次经过一次路口，需要交费，规则如下:
1)当现金>50000时，每次交5%
2)当现金<=50000时，每次交1000
编程计算该人可以经过多少次路口，要求使用while + break 方式完成

思路：
1.定义 double money 保存 100000
2.根据题目要求，分析出来三种情况：
  money > 50000
  money >=1000 && money <=50000
  money <1000
3.使用多分支 if - elseif -else
4.while + break【money < 1000】,同时使用一个变量 count 来保存通过路口的次数。

   

*/

public class Homeworkwhile {
	
	public static void main(String[] agrs) {
		
		double money = 100000;//还有多少钱
		int count = 0;//经过的次数 
		
		while(true) {//无限循环
			if(money > 50000) {
				money *= 0.95;//扣除5%，就是乘以0.95
				count++;
			}else if(money >= 1000 && money <= 50000){ 
				money  -= 1000;
				count++;
				}else { //钱少于1000
					break;
			}
		}
		System.out.println("一万块钱可以过" + count + "次路口");
	}
}