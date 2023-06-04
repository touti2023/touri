package Day0518.homework10_;

public class Doctor {
    //属性
    //{name.age.job,gender,sal}
    private String name;
    private int age;
    private String job;
    private  char gender;
    private double sal;

    //5个参数的构造器

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    //get set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    //重写父类（Object）的equals（）方法：public boolean equals（Object obj），并判断两个对象是否相同。
    public boolean equals(Object obj) {
        //判断相同否
        if(this == obj) {
            return true;
        }
        //过关斩将，校验方式
        if(!(obj instanceof Doctor)) {//不是的话
            return false;
        }
        //向下转型，因为obj的运行类型是Doctor或其子类
        Doctor doctor = (Doctor) obj;
        return this.name.equals(doctor.name) && this.age == doctor.age &&
        this.gender == doctor.gender && this.job.equals(doctor.job) && this.sal == doctor.sal;
    }
}
