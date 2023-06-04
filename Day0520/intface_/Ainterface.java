package Day0520.intface_;

public interface Ainterface {
    //写属性
    public int n1 = 10;

    //写方法
    //在接口中，抽象方法，可以省略abstract关键字
    public void hi();
    //在jdk及其以后，可以有默认实现方法,但需要使用 default 关键字修饰。
    default public void ok() {
        System.out.println("ok ");
    }

    //在jdk8及其以后，还可以有静态方法：static
    public static void cry () {
        System.out.println("cry......  ");
    }
}
