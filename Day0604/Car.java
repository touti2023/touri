package Day0604;

public class Car {
    public String brand = "フェラーリ";
    public int price = 30000000;
    public String color = "黄色";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
