
public class MiGong  {
	
	public static void main(String[] agrs) {
		
		/*
		思路；
		1.先创建迷宫，用二维数组表示 int[][] map = new int[8][7];
		2.先规定 map 数组的元素值：0 表示可以走，1 表示障碍物
		 */
		int [][] map = new int[8][7];
		//3.将最上面的以一行和最下面的一行全部设置为 1
		for(int i = 0; i< 7; i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//4.将最右面的以一行和最左面的一行全部设置为 1
		for(int i = 0; i < 8; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;
		//输出当前地图
		System.out.println("=====当前地图情况=====");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
		//使用findWay给老鼠找路
		T2 t1 = new T2();
		t1.findWay(map,1,1);
		
		System.out.println("\n====找路的情况如下====");
		
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class T2{
	/*
	使用递归回溯的思想来解决老鼠出迷宫。
	
	1.findWay方法就是专门来找出迷宫的路径
	2.如果找到，就返回 true ，否则返回false
	3.map 就是二维数组，即表示迷宫。
	4.i，j 就是老师的位置坐标，初始化的位置为（1，1）
	5.因为我们是递归的找路，所以我先规定 map数组的各个值的含义
	  0=表示可以走 ；  1=表示障碍物； 2表示走过，且能走得通； 3 表示走过，但是是死路
	6.当map[6:[5: =2 就说明找到通路，就可以结束，否则就继续找
	7.确定老鼠找路策略 下-右-上-左
	 */
	
	public boolean findWay(int[][]map,int i,int j) { 
		if(map[6][5] ==2 ) {
			return true;
		}else {
			if(map[i][j] == 0) {
				map[i][j] = 2;
				
				if(findWay(map,i + 1, j)) {
					return true;
				}else if(findWay(map,i , j + 1)) {
					return true;
				}else if(findWay(map,i - 1 , j)) {
					return true;
				}else if(findWay(map,i , j - 1)) {
					return true;
				}else {
					map[i][j] = 3;
					return false;
				}
			}else {
				return false;
			}
		}
	}
}

