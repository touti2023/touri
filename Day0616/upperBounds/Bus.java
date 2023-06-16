package Day0616.upperBounds;

public class Bus<T> {
    private T rider;

    public Bus(T rider) {
        this.rider = rider;
    }

    public void setRider(T rider) {
        this.rider = rider;
    }

    public T getRider() {
        return this.rider;
    }

    public void printRider() {
        System.out.println(rider.toString());
    }
}
