package Day0511;

//编写A03，实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样。（克隆）
public class Homework04 {

	  public static void main(String[] agrs) {
		   int[] oldArr = {10,30,50};
		   A03 a03 = new A03();
		   int[] newArr = a03.copyArr(oldArr);
		   //遍历newArr，验证
		   System.out.println("返回的newArr元素情况");
		   for(int i =0; i < newArr.length; i++) {
			   System.out.println(newArr[i] + "\t");
		   }
	  }
}

class A03 {
	public int[] copyArr(int[] oldArr) {
		//在堆中，创建一个长度为 oldArr.length 数组
		int[] newArr = new int[oldArr.length];
		//遍历数组oldArr,将元素拷贝到 newArr
		for(int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
			
		}
		return newArr;
	}
}