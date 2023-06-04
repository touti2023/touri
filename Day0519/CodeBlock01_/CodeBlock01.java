package Day0519.CodeBlock01_;

//代码块
//语法;{  }
//可以在大括号前添加static，变为静态，即static{  },否则就是普通代码块。

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("西游记");
        System.out.println("敢问路在何方。。。");
        System.out.println("--------------------------");

        Movie movie2 = new Movie("稀巴",35.5,"稀巴王子");
        System.out.println("啊，稀巴儿");
    }

}

class Movie {
    private String name;
    private double price;
    private String director;

    //有3个构造器，构成重载。
    //将3个构造器的相同语句，封装到一个代码块中即可。
    //封装之后无论我们调用那个构造器，都会先调用代码块的内容，即代码块调用顺序优先于构造器。
    //创建代码块
    {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影正式开始");
        System.out.println();
    }

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}