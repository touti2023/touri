package Day0523.enum_;
//演示自定义枚举 实现
/*
1.不需要提供set方法，因为枚举对象通常为只读】】
2.枚举对象/属性使用 final + static 共同修饰，实现底层优化】
3.枚举对象名通常使用全部大写，常量的命名规范
4.枚举对象根据需要，也可以有多个属性。
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }
}
class Season {//类
    private String name;
    private String desc;//描述

    //定义四个对象，固定。
    public static final Season SPRING = new Season("春天","温暖");
    public static final Season SUMMER = new Season("夏天","炎热");
    public static final Season AUTUMN = new Season("秋天","凉爽");
    public static final Season WINTER = new Season("冬天","寒冷");

    //1.将构造器私有化，防止被new
    //2.去掉set方法，防止属性被串改
    //3.在Season 内部，直接创建固定的对象
    //4.优化，可以加入 final 修饰符
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
/*
枚举小结
1.构造器私有化
2.本类内部创建对象
3.对外暴露，但要为对象添加public static final 修饰符
4.不要提供set方法。
 */