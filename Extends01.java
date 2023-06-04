package Day0512;

public class Extends01 {
	public static void main(String[] args) {
		Pupil pupil = new Pupil();
		pupil.name = "あらし";
		pupil.age = 22;
		pupil.testing();
		pupil.setScore(100);
		pupil.showInfo();
		
		System.out.println("===========");
		Graduate graduate = new Graduate();
		graduate.name = "李和阳";
		graduate.age = 33;
		graduate.testing();
		graduate.setScore(59 + 1);
		graduate.showInfo();
		
	}
}
