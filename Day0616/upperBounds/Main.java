package Day0616.upperBounds;

public class Main {
    public static void main(String[] args) {
        SchoolPerson person = new SchoolPerson("Peter");
        Bus<SchoolPerson> busWPerson = new Bus<>(person);
        busWPerson.printRider();
    }
}
