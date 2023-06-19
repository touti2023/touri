package Day0511;


//编写类A01，定义方法max，实现求某个double数组的最大值，并返回。
public class Homework01 {
    public static void main(String[] agrs) {
    	A01 a = new A01();
    	double[] arr = {1.3,5.5,1.2,9.3,3.2,20.0};
    	Double res = a.max(arr);
    	if(res != null) {
    		System.out.println("arr的最大值=" + res);	
    	}else {
    	System.out.println("arr的值输入有误");
       }
    }
}
//思路分析
//1.类名 A01
//2.方法名 max
//3.形参(double[[])
//4.返回值 double

//先完成正常业务，然后再考虑代码健壮性。

class A01 {
	
	public Double max(double[] arr) {
		//保证arr至少有一个元素（考虑健壮性）
	 if(arr != null && arr.length > 0) { 	
	     double max = arr[0];//jading第一个元素就是最大值
	     for(int i = 1; i < arr.length; i++) {
	    	 if(max < arr[i]) {
	    		 max = arr[i];
	    	 }
	     }
		return max;
	 }else {
		 return null;
	 }
	}
}
