package Day0531.generic.improve;
@SuppressWarnings({"all"})
public class Generic03 {
    public static void main(String[] args) {
        Person person = new Person<String>("hsp");//E = String

        Person person2 = new Person<Integer>(100);//E = Integer

        person.show();//String
        person2.show();//Ingeger
    }
}
//泛型的作用是：可以在类声明时，通过一个标识表示类中某个属性的类型
//或是某个方法的返回值的类型，或是参数类型。

class Person<E> {//在定义Person时，添加泛型E，今后可以更换成任意类型。如上
    E s;//可以是数据类型

    public Person(E s) {//也可以是参数类型
        this.s = s;
    }

    public E f() {//也可以是返回值类型
        return s;
    }

    //验证E 数据类型的变更，打印E的数据类型:getClass
    public void show() {
        System.out.println(s.getClass());
    }
}