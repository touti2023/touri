package Day0520.intface_;

public class Interface02 {
    public static void main(String[] args) {

    }
}

/*
    1.如果一个类 inplements实现 接口
    2.需要将该接口的所有抽象方法都实现
 */
class A implements Ainterface {
    @Override
    public void hi() {
        System.out.println("hi......");
    }
}

