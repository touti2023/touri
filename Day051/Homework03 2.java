package Day0511;

//编写类 Book，定义方法updatePrice，实现更改某本书的价格，具体:如果价格>150,则更改为150；
//如果价格>100,则改为100，否则不变。
public class Homework03 {
  public static void main(String[] agrs) {
	  Book book = new Book("包青天",300);
	  book.info();
	  book.updatePrice();//更新价格
	  book.info();
  }
}
//思路分析
//1.类名 Book
//2.方法名 updatePrice
//3.形参(double d1)
//4.返回值 无
//5.属性 price，name
//6.提供一个构造器

class Book  {
	String name;
	double price;
	
	public Book(String name,double price) {
		this.name = name;
		this.price = price;  
	}
	public void updatePrice() {
		if(this.price > 150.0) {
			this.price = 150.0;
		}else if (this.price > 100) {
			this.price = 100.0;
		}
	
	}
	//显示书籍的情况
	public void info() {
		System.out.println("书名" + this.name + "价格是 " + this.price);
	}
}

