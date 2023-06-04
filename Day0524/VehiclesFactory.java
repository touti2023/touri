package Day0524;

public class VehiclesFactory {
    private static House house = new House();
    private VehiclesFactory() {}
    public static House getHouse() {
        return house;
    }
    public static Boat getBoat() {
        return new Boat();
    }
    public static Plane getPlane() {
        return new Plane();
    }
}
