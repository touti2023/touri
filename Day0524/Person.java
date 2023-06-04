package Day0524;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        if(!(vehicles instanceof Boat) ){
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
        public void common() {
        if(!(vehicles instanceof House)) {
            vehicles = VehiclesFactory.getHouse();
        }
        vehicles.work();
        }

        public void passFireHill() {
        if(!(vehicles instanceof Plane)) {
            vehicles = VehiclesFactory.getPlane();
        }
        vehicles.work();
        }

    public String getName() {
        return name;
    }
}
