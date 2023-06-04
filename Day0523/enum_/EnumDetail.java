package Day0523.enum_;

/*
enum实现接口

1.使用enum关键字后，就不能再继续其他类类，因为enum会隐士继承Enum，而java是单继承机制。
2.枚举类和普通类一样，可以实现接口，语法如下:
  enum 类名 implements 接口1，接口2 {}
 */
public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASSICMUSIC.playing();
    }
}

interface Playing {
    public void playing();
}
enum Music implements Playing {
    CLASSICMUSIC;
    public void playing() {
        System.out.println("播放好听的音乐...");
    }

}
