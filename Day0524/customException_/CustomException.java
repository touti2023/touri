package Day0524.customException_;
//自定义异常
/*
一般情况下，我们自定义异常时继承 RuntimeException
即把自定义异常做成 运行时异常，好处是，我们可以使用默认的处理机制。
 */
public class CustomException {
    public static void main(String[] args) {

        int age = 180;
        //要求范围在 18 - 120 之间，否则抛出一个自定义异常。
        if(!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄需要在 18-120 之间");
        }
        System.out.println("你的年龄范围正确。");
    }
}
class AgeException extends RuntimeException {
    public AgeException(String message) {//构造器
        super(message);
    }
}