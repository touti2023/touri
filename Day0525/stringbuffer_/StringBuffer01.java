package Day0525.stringbuffer_;

public class StringBuffer01 {
    public static void main(String[] args) {
        //1.StringBuffer 的直接父类是 AbstractStringBuilder
        //2.StringBuffer 实现了 Serializable，即StringBuffer 的对象可以串行化
        //3.在父类中，AbstractStringBuilder 有属性 char[] value,不是final
        //4.StringBuffer 是一个 final类，不能被继承
        StringBuffer stringBuffer = new StringBuffer();
    }
}

