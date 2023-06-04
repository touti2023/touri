package Day0517Homework;

public class Professor extends  Teacher {


    public Professor(String name, int age, String grade, double salary, double post) {
        super(name, age, grade, salary, post);
    }

    @Override
    public void introduce() {
        System.out.println(" 这是教授的信息");
        super.introduce();
    }
}
