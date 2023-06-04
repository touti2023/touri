package Day0523.enum_;

/*
1.声明Week枚举类，其中包含周一至周日；
2.使用values返回所有的枚举数组，并遍历，输出。
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        //获取到所有的枚举对象，即数组
        Week[] weeks = Week.values();
        //使用增强for循环遍历，输出
        System.out.println("====所有星期的信息如下====");
        for(Week week: weeks) {
            System.out.println(week);
        }
    }
}

enum Week {
    //定义Week的枚举对象
    MONDAY("周一"),TUESDAY("周二"),WEDNESDAY("周三"),THURSDAY("周四"),
    FRIDAY("周五"),SATURDAY("周六"),SUNDAY("周日");
    private String name;

    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}