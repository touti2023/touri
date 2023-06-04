package Day0525.wrapper;
//演示 Integer 的装箱和拆箱
public class WrapperType {
    public static void main(String[] args) {
        //jdk5以后，就可以自动装箱和自动拆箱
        //int -> Integer
        int n1 = 100;
        Integer integer = n1;

        //自动拆箱
        //Integer => int
        int n2 = integer;
    }
}
