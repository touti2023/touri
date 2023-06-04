package Day0523.annotation;

//注释符号  2.@Deprecated
public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
    }
}

//Deprecated 修饰某个元素，表示该元素已经过时。
//即不再推荐使用，但是仍然可以使用，不等于报废。
@Deprecated
class A {
    public int n1 = 10;
    public void hi() {

    }
}
