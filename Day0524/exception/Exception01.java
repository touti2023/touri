package Day0524.exception;
//异常处理
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            int res = num1 / num2;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        //分母为零，异常，抛出异常后，程序会崩溃，
        // 处理方法：选中代码块，按option+command+t 选中 try-catch。
        //如果进行了异常处理，即使出现了异常也能继续执行而不至于退出。

        System.out.println("程序继续运行...");
    }
}
