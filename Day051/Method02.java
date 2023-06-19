
public class Method02   {
	
	public static void main(String[] agrs) {
		
		//请遍历一个数组，输出数组的各个元素值
		int [][] map = {{0,0,1},{1,1,1},{1,1,3}}; 
		MyTools tool = new MyTools();
		tool.printArr(map);
	}
}
	class MyTools {
		
		public void printArr(int[][] map) {
			for(int i = 0; i < map.length; i ++) {
				for(int j = 0; j < map[i].length; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
