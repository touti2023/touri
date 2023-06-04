package Day0524;

public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}
class A {
    private String name = "hello";
    public void f1() {
        class B {
            private final String NAME = "韩顺平教育";
            public void show() {
                System.out.println("name=" + NAME + " hello=" + name);
            }
        }
        B b = new B();
        b.show();
    }
}