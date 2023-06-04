package Day0520.intface_;
//接口于继承的对比

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("悟空");
        littleMonkey.climbing();
        littleMonkey.swimming();
        littleMonkey.flying();
        littleMonkey.play();

    }
}

//猴子
class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(getName() + " 会爬树......");
    }

    public String getName() {
        return name;
    }
}

//接口
interface Fishable {
    void swimming();
}
interface Birdable {
    void flying();
}
interface Cxk {
    void play();
}

//继承 + 接口
/*
小结：当子类继承了父类，就自动拥有了父类的功能
     如果子类需要扩展，可以通过实现接口的方式扩展。
     可以将 实现接口 看作是 对java 单继承机制的一种补充。
 */
class LittleMonkey extends Monkey implements Fishable,Birdable,Cxk {
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + " 通过学习，可以像鱼儿一样游泳......");
    }

    @Override
    public void flying() {
        System.out.println(getName() +" 通过学习，可以像鱼儿一样飞翔......");
    }

    @Override
    public void play() {
        System.out.println(getName() + " 通过学习2年半，可以像蔡徐坤一样唱跳rap，篮球！！");
    }
}