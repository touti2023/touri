package Day0531.cpu_;

public class CpuNum {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑cpu数量
        int cpuNum = runtime.availableProcessors();
        System.out.println(cpuNum);
    }
}
