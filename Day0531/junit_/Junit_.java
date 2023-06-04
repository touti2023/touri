package Day0531.junit_;

import org.junit.jupiter.api.Test;

public class Junit_ {
    public static void main(String[] args) {
        //传统方式
        //new junit_().m1();
        //new junit_().m2();
    }

    @Test
    public void m1() {
        System.out.println("m1");
    }

    @Test
    public void m2() {
        System.out.println("m2");
    }
}
