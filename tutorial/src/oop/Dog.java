package oop;

public class Dog {
	
	private static int count = 0; // a static variable known as a class variable.
	
	public String name;
	public int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		Dog.count++;
	}
	
	public void speak() {
		System.out.println("I am " + this.name + " and I am " + this.age + " years old!");
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void changeAge(int new_age) {
		this.age = new_age;
	}
	
	/*** static methods ***/
	
	public static int getCount() {
		return Dog.count;
	}
	
	public static void setCount(int val) {
		Dog.count = val;
	}
}
