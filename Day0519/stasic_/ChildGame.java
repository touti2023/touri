package Day0519.stasic_;

public class ChildGame {
    public static void main(String[] args) {

        //定义一个变量 count，统计有多少小孩加入类游戏
        //int count = 0;

        Child child1 = new Child("白骨精");
        child1.join();
        //count++;
        child1.count++;

        Child child2 = new Child("蜘蛛精");
        child2.join();
        //count++;
        child2.count++;

        Child child3 = new Child("琵琶精");
        child3.join();
        //count++;
        child3.count++;

        System.out.println("共有 " + Child.count + " 小孩加入了游戏");


    }
}

class Child {
    private String name;
    //定义一个变量 count，是一个类变量，也叫静态变量。statuc 静态
    //该变量的最大特点就是会被Child 类的所有对象实例共享。
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name+" 加入了游戏......");
    }
}