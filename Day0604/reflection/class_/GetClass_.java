package Day0604.reflection.class_;

import Day0604.Car;

//演示得到Class对象的各种方式(6)
public class GetClass_ {
    public static void main(String[] args) throws Exception {

        //1.Class.forNAme
        String classAllPath = "Day0604.Car";//读取配置文件获取
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);

        //2.类名.class,用于参数传递
        Class cls2 = Car.class;
        System.out.println(cls2);

        //3.对象.getClass(),用于对象实例
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);

        //4.通过类加载器来获取类的对象
        //1.得到加载器
        ClassLoader classLoader = car.getClass().getClassLoader();
        //2.通过加载器得到对象
        Class cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);

        //5.基本数据得到对象
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);//int

        //6.基本数据类型对应的包装类，可以通过.TYPE 得到Class类对象
        Class<Integer> type1 = Integer.TYPE;
        Class type2 = Character.TYPE;
        System.out.println(type1);
        System.out.println(type2);


    }
}
