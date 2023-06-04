package qqclient.view;

import qqclient.Utility.Utility;
import qqclient.service.FileClientService;
import qqclient.service.MessageClientService;
import qqclient.service.UserClientService;

//客户端的菜单界面
public class QQView {
    public static void main(String[] args) throws Exception {
        new QQView().mainMenu();
        System.out.println("客户端 退出系统...");
    }
    private boolean loop = true;//控制是否显示菜单
    private String key = "";//接收用户的键盘输入
    private UserClientService userClientService = new UserClientService();//用于登陆服务/注册用户
    private MessageClientService messageClientService = new MessageClientService();//私聊或群聊
    private FileClientService fileClientService = new FileClientService();//该对象用户传输文件
    //显示主菜单
    private void mainMenu() throws Exception {
        while (loop) {
            System.out.println("======欢迎登陆网络通信系统=======");
            System.out.println("\t\t 1 登陆系统");
            System.out.println("\t\t 9 退出系统");
            System.out.print("请输入你的选择:");
            key = Utility.readString(1);

            //根据用户的输入，来处理不同的逻辑
            switch (key) {
                case "1":
                    System.out.println("请输入用户号:");
                    String userId = Utility.readString(50);
                    System.out.println("请输入密  码:");
                    String pwd = Utility.readString(50);
                    //需要到服务端去验证该用户是否合法
                    if (userClientService.chechUser(userId,pwd)) {
                        System.out.println("=======欢迎（用户 " + userId + " 登陆成功)==========");
                        //进入二级菜单
                        while (loop) {
                            System.out.println("\n========网络通信系统二级菜单（用户 \" + userId + \" )==========");
                            System.out.println("\t\t 1 显示在线用户列表");
                            System.out.println("\t\t 2 群发消息");
                            System.out.println("\t\t 3 私聊消息");
                            System.out.println("\t\t 4 发送文件");
                            System.out.println("\t\t 9 退出系统");
                            System.out.print("请输入你的选择:");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    //获取在线用户列表
                                    userClientService.onLineFriendList();
                                    System.out.println("显示在线用户列表");
                                    break;
                                case "2":
                                    System.out.println("请输出想对大家说的话");
                                    String s = Utility.readString(100);
                                    //调用方法，将消息封装成对象，发送给服务器

                                    break;
                                case "3":
                                    System.out.println("请输入想聊天的用户号; ");
                                    String getterId = Utility.readString(50);
                                    System.out.println("请输入想说的话: ");
                                    String content = Utility.readString(100);
                                    //编写方法,将消息发送给服务器端
                                    messageClientService.sendMessageToOne(content,userId,getterId);
                                    System.out.println("私发消息");
                                    break;
                                case "4":
                                    System.out.println("请输入你想发送文件的用户");
                                    getterId = Utility.readString(50);
                                    System.out.println("请输入发送文件的路径(形式 d:/xx.jpg)");
                                    String src = Utility.readString(100);
                                    System.out.println("请输入把文件发送到对应的路径(形式 d:/yy.jpg)");
                                    String dest = Utility.readString(100);
                                    fileClientService.sendDileToOne(src,dest,userId,getterId);

                                    break;
                                case "9":
                                    //调用方法，给服务器发送一个退出系统的message
                                    userClientService.logout();
                                    loop = false;
                                    break;
                            }
                        }
                    } else {
                        System.out.println("======登陆失败=====");
                    }
                    break;
                case"9":
                    loop = false;
                    break;
            }
        }

    }
}
