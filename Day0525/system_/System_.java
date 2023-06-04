package Day0525.system_;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
        //指令1.exit 退出当前程序

        System.out.println("ok1");

        //1.exit(0)白噢是程序退出
        //2.0表示状态，时正常退出。
        //System.exit(0);
        System.out.println("ok2");//不会输出

        //指令2.arraycopy:复制数组元素，比较适合底层调用
        //一般使用Arrays.copyOf完成复制数组

        int[] src = {1,2,3};
        int[] dest = new int[3];//dest当前时{0,0,0}

        System.arraycopy(src,0,dest,0,src.length);
        System.out.println("dest=" + Arrays.toString(dest));

        //指令3.currentTimeMillis:返回当前时间距离1970-1-1 的毫秒数
        //
        System.out.println(System.currentTimeMillis());
    }
}
