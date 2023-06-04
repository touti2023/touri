package Day0525.String_;

public class String01 {
    public static void main(String[] args) {

//String 类实现了接口 Serializable [可以串行化，在网络输出】
//String 类实现了接口 Comparable 【对象可以比较大小】
//String 是final 类，不能被继承。
//String 有属性：private final char value[];用于存放字符串内容
//一定要注意:value 是一个final类型，不可以修改（即被新的代替）：即value不能指向新地址，但是单个字符内容是可以变化的。
        String name = "jack";
        name = "tom";
        final char value[] = {'a','b','c'};
        value[0] = 'H';//可以修改里面的内容。

        char[] v2 = {'t','o','m'};
        //value = v2  xxx不可以修改 value地址。
    }
}


