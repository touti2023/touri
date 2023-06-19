package Day0517Homework;

public class Teacher {
     private  String name;
     private  int age;
     private  double salary;
     private  String grade;
     private  double post;


    public Teacher(String name, int age, String grade, double salary,  double post) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.grade = grade;
        this.post = post;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setPost(double post) {
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getGrade() {
        return grade;

    }

    public double getPost() {
        return post;
    }

    public void introduce() {
        System.out.println("name: " + name + "age: " + age + "post: " + post+ "salary: " + salary +"grade: " + grade );
    }
}
