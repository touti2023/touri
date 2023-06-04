package Day0602.standard;

public class InputAndOutput {
    public static void main(String[] args) {
        //System 类的public final staticInputStream in = null;
        //System.in 编译类型 InputStream
        //System.in 运行类型 BufferedInputStream
        //表示的是标准输入 键盘
        System.out.println(System.in.getClass());

        //System.out public final static PrintStream out = null;
        //编译类型 PrintStream
        //运行类型 PrintStream
        //表示标准输出 显示器
        System.out.println(System.out.getClass());
    }
}
