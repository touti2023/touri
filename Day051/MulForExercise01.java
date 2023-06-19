
/*多重循环控制，应用实例：
1.统计3个班的成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分。【学生成绩从键盘输入】
2.统计3个班及格人数，每个班有5名同学。
3.打印出九九乘法表。

思路分析：
化繁为简：
（1）先计算1个班级，5个学生的成绩，使用for。
1.1创建一个Scanner对象，接受用户输入。
1.2得到该班级的平均分，定义一个 double sum 把该班级5个学生成绩求和再除以5.

(2)统计3个班（每个班5个学生）平均分

(3)统计所有班级的平均分。
3.1定义一个变量 double totalScore 累积所有学生的成绩。
3.2当多重循环结束后，double totalScore / （3 * 5）即是班级乘以学生人数

(4)统计三个班的及格人数
4.1定义一个变量，int passNum = 0;当有一个学生成绩>=60,passNum++;

(5)可以优化【效率，可读性，结构】

*/

import java.util.Scanner;
public class MulForExercise01 {
	
	public static void main(String[] agrs) {
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;//所有学生成绩
		int passNum = 0;//累积及格人数
		
		for(int i = 1; i <=3; i++) { //i = 班级
        double sum = 0; 	//一个班的总分
		for(int j = 1; j<=5; j++) {  //学生人数
			System.out.println("请输入第" + i +"个班的第" + j + "个学生的成绩");
			double score = myScanner.nextDouble();
			if(score >= 60) {
			passNum++;
			}
			sum += score; //累积
			System.out.println("成绩为:" + score);
		}
		System.out.println("总分为:" + sum + "平均分为：" + sum / 5);
		//把sum 累积到 totalScore
		totalScore += sum;
		
		}
		System.out.println("三个班级的总分为:" + totalScore + ",平均分为：" + totalScore / 15);
		System.out.println("及格人数为:" + passNum);
	}
}