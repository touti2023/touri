package Day0525.math_;

public class MathMethod {
    public static void main(String[] args) {

        //Math常用的方法（静态方法）
        //1.绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);//9

        //2.pow 求幂
        double pow = Math.pow(2, 4);//2的4次方
        System.out.println(pow);//16

        //3.ceil 向上取整，返回>=该参数的最大整数
        double ceil = Math.ceil(-3.0001);
        System.out.println(ceil);//-3.0

        //4.floor 向下取整，返回<=该参数的最大整数
        double floor = Math.floor(-4.999);
        System.out.println(floor);//-5.0

        //5.round 四舍五入 Math.round(该参数+0.5)
        long round = Math.round(-5.001);
        System.out.println(round);//-5

        //6.sqrt 求开方
        double sqrt = Math.sqrt(9.0);
        System.out.println(sqrt);//3.0R

        //7.random 求随机数
        //获取一个a-b之间的一个随机整数公式：
        //int num =(int)(Math.random()*(b-a+1)+a)

        //8.max / min 最大值和最小值
        int min = Math.min(1,9);
        int max = Math.max(45, 90);
        System.out.println(max);
        System.out.println(min);

    }
}
