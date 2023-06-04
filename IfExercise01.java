

public class IfExercise01 {
	
	public static void main(String[] agrs) {
	
		
		double d1 = 18;
		double d2 = 5;
		if(d1 > 10) {if(d2 < 20) {
			System.out.println(d1 + d2);
		}
			
		}
		
		
		 int num1 = 24;
	     int num2 = 33;
	     int num3 =num1 + num2;
	     if(num3 % 3 ==0  &&  num3 % 5 == 0 ) {
	     System.out.println("可以");
	     }else {
	     System.out.println("不可以被整除");
	     }
	     
	     /*
	     判断一个年份是否是闰年，闰年的条件是符合下面二者之一：
	     （1）年份能被4整除，但不能被100整除；
	     （2）能被400整除；
	      */
	     
	     int year = 2024;
	     if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
	    	 System.out.println("是 闰年");
	     }else {
	    	 System.out.println("不是 闰年");
	     }
	      
	     
	     
	     
	     
	}
	}

       
        
        