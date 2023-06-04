package Day0525.arrays;
//遍历 二分法进行查找，要求必须排好
//必须是有序数组，无序不能使用。
//如果数组中不存在该元素，就返回-1

import java.util.Arrays;

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,90,123,567};
        int index = Arrays.binarySearch(arr,123);
        System.out.println("index=" + index);

        //copyOf 数组元素的复制
        //1.从 arr 数组中，拷贝 arr.length 个元素到 newArr数组中
        //2.如果拷贝的长度 > arr.length 就在新数组的后面 增加 null
        //3.如果拷贝长度 < 0 就抛出异常
        Integer[] newArr = Arrays.copyOf(arr,arr.length);
        System.out.println("-------新数组newArr为----------");
        System.out.println(Arrays.toString(newArr));

        //fill 数组元素填充
        Integer[] num = new Integer[]{9,3,2};
        Arrays.fill(num,99);
        //上面代码的意思时用99去替换掉数组里所有的元素，即输出99，99，99
        System.out.println("------num数组填充后-------");
        System.out.println(Arrays.toString(num));

        //equals 比较两个数组元素内容是否完全一致
        Integer[] arr2 = {1,2,90,123,99};
        boolean equals = Arrays.equals(arr,arr2);
        System.out.println("equals=" + equals);

    }
}
