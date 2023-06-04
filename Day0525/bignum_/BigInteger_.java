package Day0525.bignum_;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {

        //long l = 2378888888891999999999999999l;
        //System.out.println("l=" + l);

        //当我们编程中，需要处理很大的整数，long 不够用
        //可以使用BigInteger 来搞定
        BigInteger bigInteger1 = new BigInteger("2378888888891999999999999999");
        BigInteger bigInteger2 = new BigInteger("100");
        System.out.println(bigInteger1);

        //在对 bigInteger 进行运算时，需要对应的方法，不能直接运算。
        BigInteger add = bigInteger1.add(bigInteger2);
        System.out.println(add);//add 加法

        BigInteger subtract = bigInteger1.subtract(bigInteger2);
        System.out.println(subtract);//subtract 减法

        BigInteger multiply = bigInteger1.multiply(bigInteger2);
        System.out.println(multiply);//multiply 乘法

        BigInteger divide = bigInteger1.divide(bigInteger2);
        System.out.println(divide);//除法
    }
}
