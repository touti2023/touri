/*

课堂练习：
实现登陆验证，有3次机会，如果用户名为“丁真”，密码“666”提示登录成功，
否则提示还有几次机会，请使用for+break完成。

思路分析：
1.创建Scanner对象接受用户输入
2.定义String name和 String passwd 保存用户名和密码。
3.最多循环3次，如果满足条件就退出。
4.定义一般变量int chance 记录还有几次登录机会。

*/
import java.util.Scanner;
public class BreakExercise02 {
	
	public static void main(String[] agrs) {
		
		Scanner myScanner = new Scanner(System.in);
		
		String name = "";
		String passwd = "";
		int chance = 3;//登录一次就减少一次
        for(int i = 1; i < 4; i++) {
        	System.out.println("请输入姓名");
        	name = myScanner.next();
    		System.out.println("请输入密码");
    		passwd = myScanner.next();
    		//字符串的比较用 【equals】
    		if("丁真".equals(name) && "666".equals(passwd)) {
    			System.out.println("恭喜你，登录成功！");
    			break;
    		}else {chance--;
        }
        System.out.println("输入有误，你还有" + chance + "次登录机会，请重新输入");
		
        }
	}
}