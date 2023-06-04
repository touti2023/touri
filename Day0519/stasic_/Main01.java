package Day0519.stasic_;

public class Main01 {

    //非静态变量
    private static  String name = "abcdefg";
    private int n1 = 10000;

    //静态方法
    public static void hi() {
        System.out.println("Main01的 hi方法");
    }

    //非静态方法
    public void cry() {
        System.out.println("Main01的 cry方法");
    }

    public static void main(String[] args) {
        //可以直接使用 name
        System.out.println(" name=" + name);

        //静态方法要访问本类的非静态成员，需要先创建对象，再调用。
        Main01 main01 = new Main01();
        System.out.println(main01.n1);//ok
        main01.cry();
    }
}
