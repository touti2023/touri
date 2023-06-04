public class FloatDetail {
	
	public static void main(String[] agrs) {
		
		//java 的浮点型常量默认为double型，声明float型常量时，须后加‘f’或‘F’。
		//float num1 = 1.1；//x错误。 float < 默认的double，会被撑爆。
		
		float num2 = 1.1f;  //正确
		double num3 = 1.1;  //正确
		double num4 = 1.1f; // 正确
		
		//十进制数形式：如：5.12   512.0f    .512(必须有小数点)    
		double num5 = .123;  //等价 0.123
		System.out.println(num5);
		
		//科学技术法形式：如：5.12e2 [5.12 * 10的2次方 】    5.12E-2 【5.12 / 10的2次方 】
		System.out.println(5.12e2);
		System.out.println(5.12E-2);
		
		
		//通常情况下，应该使用double型，因为它比float型更精确。
		//【举例说明】double num9 = 2.1234567851; float num10 = 2.1234567851F;
		double num9 = 2.1234567851;
		float num10 = 2.1234567851F;
		System.out.println(num9);  //结果：2.1234567851
		System.out.println(num10); //结果：2.1234567
		//float 近似值，精度较低，如果无法掌握长度，默认使用double型。
		
		
		//浮点数使用陷阱:2.7 和 8.1 / 3 比较
		//看看一段代码
		double num11 = 2.7;
		double num12 = 8.1 / 3; //2.7
		System.out.println(num11);//=2.7
		System.out.println(num12);//接近2.7的一个小数，而不是2.7（2.699999999997）
		//得到一个重要的使用点：当我们对运算的结果是小数进行相等判断时，要小心。
		//因该是以两个数的差值的绝对值，在某个精度范围内判断。
		
		if(Math.abs(num11 - num12) < 0.000001) {
			System.out.println("差值非常小，到规定的精度，认为相等。");
		}
		
		//可以通过java API 来看
		System.out.println(Math.abs(num11 - num12));
		//如果是非运算即查询得到的小数或者直接赋值，可以判断相等。
		
	}
}