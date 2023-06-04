package Day0604.reflection.question;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

//引出反射问题
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //根据配置文件 re.properties 指定信息，创建Cat对象并调用方法hi

        //1.使用Properties 类，可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        System.out.println("classfullpath" + classfullpath);
        System.out.println("method: " + methodName);

        //2.使用反射机制解决
        //类加载
        Class cls = Class.forName(classfullpath);
        //通过 cls 得到你加载的类 Cat的对象实例
        Object o = cls.newInstance();
        System.out.println(o.getClass());
        //通过cls 得到加载类Cat 的 methodName“hi” 的方法对象
        //即：在反射中，可以吧方法视为对象(万物皆对象)
        Method method1 = cls.getMethod(methodName);
        //通过 method1 调用方法：即通过方法对象来实现调用方法
        System.out.println("==========================");
        method1.invoke(o);//传统方法：对象.方法(),   反射机制 方法.invoke(对象)

    }
}
