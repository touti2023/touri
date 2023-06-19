package Day0516;

public class Poly01 {
	public static void main(String[] args) {
		
		
		Master master =  new Master("耿鬼");
		Panda panda = new Panda("八神太一");
		Bone bone = new Bone("四魂ノ玉");
		
		master.feed(panda, bone);
		
		Snake snake = new Snake("八岐大蛇");
		Fish fish = new Fish("巨齿鲨");
		master.feed(snake, fish);
		
		//多态后
		Pig pig = new Pig("小花猪");
		Rice rice = new Rice("密法球");
		master.feed(pig, rice);
		
	}
}

//如果动物很多，失误很多，feed方法就会很多，代码冗长不利于管理和维护。因此引出使用多肽。