package Day0519.single_;

//单例设计
//演示饿汉式单例模式

public class SingleTon01 {
    public static void main(String[] args) {
     //   GirlFriend xh1 = new GirlFriend("小红");
     //   GirlFriend xh2 = new GirlFriend("小花");
     //通过方法，可以获取对象
        GirlFriend girlFriend = GirlFriend.getInstance();
        System.out.println(girlFriend);
    }
}

//有一个类 enGirlFriend
//只能有一个女朋友
class GirlFriend {

    private String name;

    private static GirlFriend gf = new GirlFriend("西施");

    //如何保障只能创建一个对象:
    //步骤[单例模式- 饿汉式]
    //1.构造器私有化：private，这样就不能在外面new对象了。
    //2.在类的内部创建1个私有的，静态化对象。
    //3.提供一个公共的静态化方法，返回 gf对象即可。
    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "你的女朋友是 " + name;
    }
}