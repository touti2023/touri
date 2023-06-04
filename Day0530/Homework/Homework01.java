package Day0530.Homework;

import java.util.ArrayList;

@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新冠确诊病例超千万，数百万印度教信徒赴恒河\"圣浴\"引民众担忧"));
        arrayList.add(new News("男子突然想起2个月前掉的鱼还在网兜里，捞起一看赶紧放生"));

        int size = arrayList.size();
        for (int i = size - 1; i >= 0 ; i--) {
           // System.out.println(arrayList.get(i));
          News news = (News) arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));
        }
    }
    //专门写一个方法，处理显示标题 process处理
    public static String processTitle(String title) {
        if (title == null) {
            return "";
        }

        if (title.length() > 15) {
            return title.substring(0,15) + "......";//[0,15)
        }else {
            return title;
        }
    }

}

/*
 要求：
 1.封装一个新闻类，包含标题和内容属性，提供get，set方法，重写toString方法，打印对象时返回
 2.只提供一个带参数的构造器，实例话对象时，值初始化标题，并且实例化两个对象：
   新闻一：新馆确诊病例超千万，数百万印度教信徒付恒河“圣浴”引民众担忧。
   新闻二：男子突然想起2个月前掉的鱼还在网兜里，捞起一看赶紧放生。

 3.将新闻对象添加到ArrayList集合中，并且进行【倒序】遍历
 4.在遍历集合过程中，对新闻标题进行处理，超过15子的只保留前15个，然后在后边加上......
 5.在控制台打印遍历出经过处理的新闻标题。
 */
class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}