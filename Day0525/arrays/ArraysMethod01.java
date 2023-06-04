package Day0525.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {
    public static void main(String[] args) {

        int[] integers = {1,20,90};
        //遍历数组
        //for (int i = 0; i < integers.length; i++) {
        //    System.out.println(integers[i]);
        //}
        //直接使用Arrays.toString方法，显示数组。
        //System.out.println(Arrays.toString(integers));

        //演示 sort方法的使用

        Integer arr[] = {1,-1,7,0,89};
        //进行排序
        //1.可以直接使用冒泡排序，也可以直接使用 Arrays 提供的 sort 方法排序
        //2.因为数组是引用类型，所以通过sort排序后，会直接影响到 实参arr
        //Arrays.sort(arr);//默认排序 从小到大

        //3.sort重载的，也可以通过传入一个接口 Comparator 实现定制排序
        //4.调用 定制排序时，传入两个参数（1） 排序的数组 arr （2）实现了 Comparator 接口的匿名内部类
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println("=====排序后=====");
        System.out.println(Arrays.toString(arr));
    }
}
