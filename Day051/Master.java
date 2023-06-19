package Day0516;

public class Master {
	private String name;

	public Master(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//	
//主人给熊猫 喂食 骨头
/*public void feed(Panda panda, Bone bone) {
	System.out.println("主人 " + name + " 给 " + panda.getName() + " 吃 " + bone.getName());
	}

//主人给 小蛇喂 黄花鱼
public void feed(Snake snake,Fish fish) {
	System.out.println("主人 " + name + " 给 " + snake.getName() + " 吃 " + fish.getName());
}
*/
//使用多态机制，可以统一管理主人喂食问题，将上方注销。
	public void feed(Animals animals,Food food) {
		System.out.println("主人 " + name + " 给 " + animals.getName() + " 吃 " + food.getName());
	}
}