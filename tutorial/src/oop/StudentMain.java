package oop;

public class StudentMain {

	public static void main(String[] args) {
		Student danil = new Student("Danil");
		Student tim = new Student("Tim");
		Student vee = new Student("Vee");
		
		// Object comparisons.
		System.out.println(danil.compareTo(tim) > 0);
		System.out.println(vee.compareTo(tim) > 0);
		
		// A string representation of an object.
		System.out.println(danil);
	}

}
