package Day0523.enum_;

//演示使用enum关键字来实现枚举。
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.WINTER);
    }
}

//如果使用 enum 来实现枚举类
/*
1.使用关键字 enum 替代 class
2.直接使用语法：常量名（实参列表）; 来代替原来的冗长的属性，
 即SPRING("春天","温暖"); 来替换掉原来的 public static final Season SPRING = new Season("春天","温暖");
3.如果有多个常量，使用，号间隔，而不是另起一列。
4.使用enum 来实现枚举，要求将定义的常量对象写在最前面，不然就报错。
 */
enum Season2 {//类

    SPRING("春天","温暖"),SUMMER("夏天","炎热"),AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷");
    private String name;
    private String desc;//描述


    //public static final Season SPRING = new Season("春天","温暖");
    //public static final Season SUMMER = new Season("夏天","炎热");
    //public static final Season AUTUMN = new Season("秋天","凉爽");
    //public static final Season WINTER = new Season("冬天","寒冷");

    private Season2(String name, String desc) {
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
