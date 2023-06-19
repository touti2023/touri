package Day0510;

/*
可变参数:
基本概念：将同一类中多个同名同功能但参数个数不同的方法，封装成一个方法。
基本语法：访问修饰符，返回类型，方法名（数据类型...形参名） {
}
*/
public class VarParameter01 {
    public static void main(String[] agrs) {
    	HspMethod m= new HspMethod();
    	System.out.println(m.sum(1,5,100));
    	System.out.println(m.sum(1,19));
    }
}

//入门案例：
//看一个案例，类：HspMethod,方法sum[可以计算 2个数的和，3个数的和，4个数的和,5个数的和...]

class HspMethod {
	//可以使用方法重载
	/*public int sum(int n1, int n2) {//2个数之和
		return n1 + n2;
	}
	public int sum(int n1, int n2, int n3) {//3个数之和
		return n1 + n2 +n3;
    }
	public int sum(int n1, int n2, int n3, int n4) {//4个数之和
		return n1 + n2 +n3 + n4;
    }*/
	//.......
	//上面的三个方法名称相同，功能相同，参数个数不同 -> 使用变量参数优化
	//可变参数解决：
	//1.int... 表示接受的是可变参数，类型是int，即可以接受0～多个int。
	//2.使用可变参数时，可以当作数组来使用，即 nums 可以当作数组。
	//遍历 nums 求和即可
	public int sum(int...nums) {
		//System.out.println("接受的参数个数" + nums.length);
		int res = 0;
		for(int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}
}