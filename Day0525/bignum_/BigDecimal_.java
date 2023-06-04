package Day0525.bignum_;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        //double d = 1999.11111111999999998877788d;
        //System.out.println(d);

        //当我们需要一个精度很高的数时，double 不够用
        //可以用 BigDecimal

        BigDecimal bigDecimal1 = new BigDecimal("1999.11111111999999998877788");
        System.out.println(bigDecimal1);

        //同理对 bigDecimal 进行运算也需要方法，不能直接运算。
        //创建一个需要操作的 bigDecimal 然后调用相应的方法即可。
        BigDecimal bigDecimal2 = new BigDecimal("1.1");

        System.out.println(bigDecimal1.add(bigDecimal2));//add +
        System.out.println(bigDecimal1.subtract(bigDecimal2));//subtract -
        System.out.println(bigDecimal1.multiply(bigDecimal2));//multiply *
        //System.out.println(bigDecimal1.divide(bigDecimal2));//divide /   注意：这里可能出现除不尽的异常。
        //处理：再调用 divide 方法时，指定精度即可。BigDecimal.ROUND_CEILING
        //如果有无限循环消暑，就会保留分子 的精度
        System.out.println(bigDecimal1.divide(bigDecimal2,BigDecimal.ROUND_CEILING));
    }
}
