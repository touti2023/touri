package Day0520.intface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {
        System.out.println(IB.n1);
    }
}
interface IB {
    //接口中的属性，只能是final的，而且是public static final
    int n1 = 10;//等价于 public static final int n1 = 10;
    void hi();
}

interface IC {
    void say();
}

//一个类可以体哦那个事实现可多个接口。（继承不可以）
class Pig implements IB,IC {
    @Override
    public void hi() {
    }
        public void say(){

        }


    }
