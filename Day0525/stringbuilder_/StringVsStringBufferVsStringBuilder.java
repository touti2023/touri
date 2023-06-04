package Day0525.stringbuilder_;

public class StringVsStringBufferVsStringBuilder {

    //使用原则 结论：
    /*
    1.如果字符串存在大量的修改操作，一般使用 StringBuffer 或者 StringBuilder
    2.如果字符串存在大量的修改操作，并在单线程的情况，使用 StringBuilder
    3.如果字符串存在大量的修改操作，并在多线程的情况，使用 StringBuffer
    4.如果字符串很少修改，被多个对象引用，使用 String 。比如只信息等。
    5.StringBuffer 的方法使用和 StringBuilder 一样。
     */
}
