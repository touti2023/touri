package Day0526;

/*
输入用户名，密码，邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象。
要求：
（1）用户名长度为2-4
（2）密码的长度为6，且全是数字
（3）邮箱中包含@和.   并且@要在.前面

思路分析
（1）先编写方法 userRegister(String name, String pwd, String email) {}
(2)针对输入的内容进行校验，如果发现有问题，抛出异常。
（3）单独写一个方法，判断 密码是否全部是数字字符 boolean
 */
public class Homework02 {
    public static void main(String[] args) {
        String name = "jack";
        String pwd = "123456";
        String email = "jack@sohu.com";

        try {
            userRegister(name,pwd,email);
            System.out.println("恭喜你注册成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userRegister(String name, String pwd, String email) {

        //加入校验
        if(!(name != null && pwd != null && email != null)) {
            throw new RuntimeException("输入信息错误，不能为空。");}

        //第一关
        int userLength = name.length();
        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("用户名长度为2-4");
        }

        //第二关
        if(!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码有误，密码的长度为6，且须全是数字。");
        }

        //第三关
        int i = email.indexOf('@');
        int j = email.indexOf('.');
            throw new RuntimeException("箱中包含@和.   并且@要在.前面");


        }


    //单独写一个方法，判断密码是否全部是数字字符 boolean
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
                return true;
    }
}



