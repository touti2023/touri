

/*
 位运算符
 
 java中有7个位运算（&, |, ^, ~, >>, << 和 >>>)
 分别是 按位与&  按位或|  按位异或^   按位取反~ .它们的运算规则是：
 
 按位与&：  两位全为1，结果为1，否则为0.
 按位或|：  两位有一个为1，结果为1，否则为0.
 按位取异： 两位一个位0一个位1，结果为1，否则为0.
 按位取反： 0取1，1取0
 
 试练：2&3=?   ~-2=?    ~2=?   2|3=?   2^3=?
 
*/

public class BitOperator {
	
	public static void main(String[] agrs) {
	
	System.out.println(2&3);//2
	
	System.out.println(~-2);
	
	System.out.println(~2);
	
	System.out.println(2|3);
	
	System.out.println(2^3);
	
	    }
	
	}


