package Day0523.enum_;

//演示Enum类的各种方法的使用（1.name(), 2.ordinal(),3.values(), 4.valueOf() ,5.compareTo()

public class EnumMethod {
    public static void main(String[] args) {
        //使用Season2 枚举类，来演示各种方法。
        Season2 autumn = Season2.AUTUMN;
        //1.使用name()方法，可以输出枚举对象的名字
        System.out.println(autumn.name());

        //2.使用ordinal()方法，可以输出该枚举对象的编号/次序，从0开始编号。
        // （SPRING=0，SUMMER = 1，AUTUMN= 2， WINTER = 4）//这里输出2
        System.out.println(autumn.ordinal());
        
        //3.使用values()方法，可以返回该类数组，即是返回含有定义的所有枚举对象组成的数组。
        Season2[] values = Season2.values();
        System.out.println("====办理增强for循环，取出枚举对象====");
        for (Season2 season: values) {//增强for循环
            System.out.println(season);
        }

        //4.使用valueOf()方法，可以讲字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报错。
        Season2 season2 = Season2.valueOf("AUTUMN");
        System.out.println("autumn=" + autumn);

        //5.使用compareTo()方法，可以比较两个枚举常量，比较的就是位置号/编号。即3-2 =1
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));//结果输出  1
    }
}
