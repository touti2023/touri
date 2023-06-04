
public class AutoConvertDetail {
	
	public static void main(String[] agrs) {
		
		//自动类型转换细节
		//有多种类型的数据混合运算时，
		//系统首先自动将所有数据转换成容量最大的那种数据类型，然后计算。
		
		int n1 = 10;
		//float d1 = n1 + 1.1;//错误 n1 + 1.1 --> 结果类型是 double
		//double d1 = n1 +1.1;//对 n1 + 1.1 --> 结果类型是 double
		float d1 = n1 + 1.1F;//对 n1 + 1.1 --> 结果类型是float
		
		// 当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据型时，
		//就会报错，反之就会进行自动类型转换。
		//（byte，short）  和char之间不会相互自动转换
		//虽然默认类型是int，当把具体数值赋给byte时，
		//（1）先判断该数值是否在byte范围内，如果是就可以。
		byte b1 = 10;//对；byte范围：-128~127
		//int n2 = 10;//ok,是int
		//byte b2 = n2;错误，如果是变量赋值，判断类型。
		
		//char c1 = b1; //错误，byte不能自动转换为char。
		
		//byte，short，char 三者可以计算，无论是单独还是混合计算，计算时首先转变为int类型。
		
		byte b2 = 1;
		short s1 = 1;
		//short s2 = b2 + s 1;//错误。int比short大。
		int n2 = b2 + s1;//ok,int
		byte b3 = 1;
		//byte b4 = b2 + b3;//错误，b2 + b 3 是int
		
		//boolean 不参与转换
		boolean pass = true;
		//int num100 = pass;//错误
		
		//自动提升原则：表达式结果的类型自动提升为操作数中最大的类型。
		
		byte b4 = 1;
		short s3 = 100;
		int num200 =1;
		double num300 = 1.1;
		
		//思考左边是什么类型？  b4 + s3 + num200 + num300;
		//只能是精度最大的bouble
		double num500 = b4 + s3 + num200 + num300;
				
		
		
	}
}
