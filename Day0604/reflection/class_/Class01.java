package Day0604.reflection.class_;

import Day0604.Car;

import java.lang.reflect.Field;

//演示Class类常用方法
public class Class01 {
    public static void main(String[] args) throws Exception {
        String classALLPath = "Day0604.Car";
        Class<?> cls = Class.forName(classALLPath);
        //输出cls
        System.out.println(cls);//显示cls对象
        System.out.println(cls.getClass());//运行类型
        //得到包名
        System.out.println(cls.getPackage().getName());//包名
        //得到全类名
        System.out.println(cls.getName());
        //通过cls创建对象实例
        Object o = cls.newInstance();
        Car car = (Car) o;
        System.out.println(car);//car.toString()
        //通过反射获取属性 brand
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));
        //通过反射给属性赋值
        brand.set(car,"ポルシェ");
        System.out.println(brand.get(car));
        //我希望大家可以得到所有的属性
        Field[] fields = cls.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());

        }


    }
}
