package Day0510;
//课堂练习
//有三个方法，分别实现返回姓名和两门课成绩（总分），返回姓名和三门课成绩（总分），返回姓名和五门课成绩（总分）。
//封装一个可变参数的方法。
//类 HpMethod     方法名 showScore

public class VarParameterExercise {
       public static void main(String[] agrs) {
    	   HpMethod hm = new HpMethod();
    	   String mm = hm.showScore("jack", 68.5,77);
    	   System.out.println(mm);
    	   
    	   String dm = hm.showScore("Lusfar", 99,97,89.8,77,94,88.6);
    	   System.out.println(dm);
       }
}
   
class HpMethod {
	//分析：1.方法名 showScore  2.形参（String，double...) 3. 返回String
	public String showScore(String name, double...scores ) {
		double totalScore = 0;
		for(int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
			
		}
		return name + "有" + scores.length + "门课，成绩总分为:" + totalScore;
	}
}