package Day0519.stasic_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        tom.payFee(100);

        Stu kenn = new Stu("kenn");
        kenn.payFee(200);

        //输出当前收到的总学费
        Stu.showFee();//300

    }
}

class Stu {
    private String name;
    //定义一个静态变量，来累积学生学费。
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    //静态方法就可以访问静态属性
    public static void payFee(double fee) {
        Stu.fee += fee;
    }
    public static void showFee() {
        System.out.println("总学费有: " + Stu.fee);
    }
}
