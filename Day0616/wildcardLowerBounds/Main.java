package Day0616.wildcardLowerBounds;

import Day0616.upperBounds.Bus;
import Day0616.upperBounds.SchoolPerson;
/*
public class Main {
  public static void main(String[] args) {
    Bus<Student> studentBus = new Bus<>(new Student("Mike", "Math"));
    Bus<SchoolPerson> personBus = new Bus<>(new SchoolPerson("Jerry"));

    transferData(studentBus, personBus);
  }

  public static void transferData(Bus<? extends Student> src, Bus<? super SchoolPerson> dsc) {
    System.out.print("dsc bus rider before switch: ");
    dsc.printRider();
    Student studentInSrcBus = src.getRider();
    System.out.print("dsc bus rider after switch: ");
    dsc.setRider(studentInSrcBus);
    dsc.printRider();
  }
}
*/
