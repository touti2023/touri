package Day0604.reflection.hmoework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) throws Exception {
        /*
        定义一个privateTest类 ,name=hellokitty
        提供getName的公有方法
        创建privateTest类，利用Class类得到私有属性name，修改属性值，并调用getName方法打印name
         */

        //1.得到 PrivateTest类 对应的 Class类对象
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        //2.创建实例对象
        PrivateTest privateTestobj = privateTestClass.newInstance();
        //3得到name属性对象
        Field name = privateTestClass.getDeclaredField("name");
        //4.爆破name
        name.setAccessible(true);
        name.set(privateTestobj,"容嬷嬷");
        //5.得到方法对象
        Method getName = privateTestClass.getMethod("getName");
        //6.直接调用公共方法
        Object invoke = getName.invoke(privateTestobj);
        System.out.println(invoke);


    }
}

class PrivateTest {
    private String name = "hellokitty";

    public String getName() {
        return name;
    }
}