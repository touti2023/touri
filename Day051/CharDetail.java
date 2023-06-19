public class CharDetail {
	
	public static void main(String[] agrs) {
		
		
		//在java中，char的本质是一个整数，在默认输出时，是unicode码对应的字符。
		//要输出对应的数字，可以（int）字符。
		char c1 = 97;
		System.out.println(c1);//a
		
		char c2 = 'a';
		System.out.println(c2);//a
		
		//想输出a对应的数字97，则：
		System.out.println((int)c2);//97
		
		char c3 = '韩';
		System.out.println(c3);//38889
		
		char c4 = 38889;
		System.out.println(c4);//韩
		
		
		//char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码。
		System.out.println('a' + 10);//107 . 因为在unicode码中，a本身就是97这个整数。
		
		//课堂小测
		char c5 = 'b' + 1;//99
		System.out.println((int)c5);//在unicode码中，b本身就是98这个整数。所以结果为99.
		System.out.println(c5);//99对应的字符----》自动查询ASCII编码表------》C
		
	}
}