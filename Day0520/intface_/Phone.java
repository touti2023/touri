package Day0520.intface_;

//Phone 类 实现UsbInterface
//即 Phone类需要实现 UsbInterface接口 声明的方法。
public class Phone implements UsbInterface {

    @Override
    public void start() {
        System.out.println("手机开始工作......");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作......");
    }
}
