package Day0520.abstract_;

public class BB {

    //计算任务
    //1+......+ 10000
    public void job() {

        //得到开始的时间
        long start = System.currentTimeMillis();

        long num = 0;
        for (long i = 1; i <= 800000; i++) {
            num *= i;
        }
        //得到结束的时间
        long end = System.currentTimeMillis();
        System.out.println("BB 执行时间 " + (end - start));
    }
}
