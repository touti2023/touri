package Day0616.listdemo.test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        /*
        定义一个Phone类
        定义一个集合，存入三个手机对象
        分别为：小米，1000；苹果，8000；锤子，2999
        定义方法，将小于3000的手机信息返回
         */

        //1.创建集合
        ArrayList<Phone> list = new ArrayList<>();

        //2.创建Phone对象
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);

        //3.添加对象
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //4.调用方法
        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);

        //5.遍历集合
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone phone = phoneInfoList.get(i);
            System.out.println(phone.getName() + "," + phone.getPrice());
        }


    }

    /*
    灵魂三连：
    我要干啥？ 查询信息
    怎么干？   在集合里找 - 集合
    要返回啥？  要
     */

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {//返回值是集合
        //技巧
        //如果要返回多个数据，可以先放进一个容器中，再把容器返回。容器=集合
        //定义一个集合，返回结果
        ArrayList<Phone> resultList = new ArrayList();

        for (int i = 0; i < list.size(); i++) {

            Phone p = list.get(i);
            int price = p.getPrice();

            if (price < 3000) {//如果低于3000，就存入集合中
                resultList.add(p);
            }
        }
        return resultList;//返回集合
    }
}
