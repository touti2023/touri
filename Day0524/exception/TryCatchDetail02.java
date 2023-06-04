package Day0524.exception;

public class TryCatchDetail02 {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());//空指针异常
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
        }
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }
}
