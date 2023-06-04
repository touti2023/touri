package Day0519.single_;

//演示 懒汉式单例模式
public class SingleTon02 {
    public static void main(String[] args) {
        Cat ins = Cat.getInstance();
        System.out.println(ins);

    }

}

//希望在运行中，只能创建一个Cat对象。
class Cat {
    private String name;
    private static Cat cat;

    //步骤
    //1.仍然私有化构造器
    //2.定义一个静态属性对象
    //3.提供一个公共的静态方法，可以返回一个对象。
    //4.只有当用户使用时才返回对象，以后再创建也只会返回同一个对象。

    private Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance() {
        if(cat == null)  {//如果还没有创建cat对象
            cat = new Cat("肥猫");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}