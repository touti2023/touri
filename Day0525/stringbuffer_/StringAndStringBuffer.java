package Day0525.stringbuffer_;

public class StringAndStringBuffer {
    public static void main(String[] args) {

        //1.String ---> StringBuffer
        String str = "heool tom";
        //方法1 使用构造器
        //注意：返回的才是 StringBuffer 对象，对 str 本身没有影响。
        StringBuffer stringBuffer = new StringBuffer(str);

        //方法2 使用的是append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer.append(str);

        //2.StringBuffer ---> String
        StringBuffer stringBuffer2 = new StringBuffer("韩顺平教育");
        //方法1 使用 StringBuffer 提供的 ToString方法
        String s = stringBuffer2.toString();

        //方法2：使用构造器来搞定
        String s1 = new String(stringBuffer2);
    }
}
