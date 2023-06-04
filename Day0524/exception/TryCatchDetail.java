package Day0524.exception;

public class TryCatchDetail {
    public static void main(String[] args) {
        //如果异常，就会转到catch
        //如果没有异常就会无视catch
        //无论是否发生异常，都要执行某段代码，则使用关键字【finally】

        try {
            String str = "韩顺片";
            int a = Integer.parseInt(str);
            System.out.println("数字: " + a);
        } catch (NumberFormatException e) {
            System.out.println("异常" + e.getMessage());
        }finally {
            System.out.println("finally被执行");
        }
        System.out.println("程序继续进行");
    }
}
