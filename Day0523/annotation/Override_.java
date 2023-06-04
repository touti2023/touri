package Day0523.annotation;
//注解篇
//1.@override：重写父类方法
public class Override_ {
    public static void main(String[] args) {

    }
}

class Father {
    public void fly() {
        System.out.println("Father fly...");
    }
}

class Son extends Father {
    //@Override写不写代表父类方法重写，唯一的作用就是编译器会校验重写方法是否为父类所有。
    @Override
    public void fly() {
        super.fly();
        System.out.println("Son fly...");
    }
}