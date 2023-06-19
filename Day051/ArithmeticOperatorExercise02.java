

public class ArithmeticOperatorExercise02 {
	
	public static void main(String[] agrs) {
		
		//需求1：
		//假如还有59天放假，问：合xx个星期零xx天？
		//思路分析
		//（1）使用int 变量 days 保存 天数
		//（2）一个星期是7天 星期数： days / 7 ；  零几天： days % 7
		//走代码
		
		int days = 59;
		int weeks = days / 7;
		int k = days % 7;
		
		System.out.println("还剩" + weeks + "个星期" + k + "天" );
		
		
		//需求2:
		//定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*（华氏温度-100），请求出华氏温度对应的摄氏温度。
		//思路分析
		//（1）使用double hs 变量保存 华氏温度 
		//（2）根据给出的公式，进行计算即可5/9*（hs-100）
		//（3）将得到的结果保存到double摄氏温度
		//走代码
		
		double hs = 234.6;
		//double ss = 5 / 9 *(hs - 100);
		//System.out.println("华氏温度" + hs +"对应的摄氏温度为" + ss);//0.0错误，因为5/9为小数，java会省略小数后默认为0，即为精度损失。
		//要考虑数学公式和java语言的特性。
		
		double ss = 5.0 / 9 *(hs - 100);
		System.out.println("华氏温度" + hs +"对应的摄氏温度为" + ss);//5.0,加上，即为正解。
		
	}
}