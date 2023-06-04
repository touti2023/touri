package Day0511;


//定义Music类，里面有音乐名name，音乐时长times属性，
//并有播放play功能和返回本身属性信息的功能方法 getInfo。
public class Homework08 {
   public static void main(String[] agrs) {
	   Music music = new Music("天师钟馗",300);
	   music.play();
	   System.out.println(music.getInfo());
   }
}

class Music {
	String name;
	int times;
	public Music(String name, int times) {
		this.name = name;
		this.times = times;
	}
	//播放play功能
	public void play() {
		System.out.println("音乐 " + name + " 正在播放中... " + times + "秒");
	}
	//返回本身属性信息的功能方法getInfo
	public String getInfo() {
		return "音乐 " + name + " 播放时间为 " + times;
	}
}

