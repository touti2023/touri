package Day0523.innerClass01;

//匿名内部类练习
/*
1.有一个铃声接口Bell，里面有个日你个方法。
2.有一个手机类Cellphone，具有闹钟功能alarmClock，参数是Bell类型。
3.测试手机类的闹钟功能，通过匿名内部类作为参数，打印；懒猪起床了。
4.在传入另一个匿名内部类，打印：小伙伴上课了
 */
public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}
interface Bell{//接口
    void ring();//方法
}

class CellPhone {//类
    public void alarmClock(Bell bell) {//形参是接口类型
        bell.ring();
    }
}