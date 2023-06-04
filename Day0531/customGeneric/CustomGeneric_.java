package Day0531.customGeneric;

/*
自定义泛型

 */
public class CustomGeneric_ {
    public static void main(String[] args) {

    }
}

/*
1.因为 Tiger  后面有泛型，所以把 Tiger 称为 自定义泛型
2.T,R,M 为泛型标识符，一般是单个大写字母
3.泛型标识符可以有多个
4.使用泛型的数组，不能初始化。
5.静态方法中不能使用类的泛型


 */
class Tiger<T,R,M> {
    String name;
    R r;
    M m;
    T t;
    //T[] ts = new T[8]; //x
    //public static void m1(M m) {  //x

    }
