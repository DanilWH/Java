package oop;

public class Cat extends Dog {
	
	private static int count = 0;
	
	private int food = 50;
	
	/*** A way of doing multiply constructions. ***/
	public Cat(String name, int age, int food) {
		super(name, age);
		this.food = food;
		Cat.count++;
	}
	
	public Cat(String name, int age) {
		super(name, age);
		Cat.count++;
	}
	
	public Cat(String name) {
		super(name, -1);
		Cat.count++;
	}
	/*** End of doing multiply constructions. ***/
	
	public void speak() {
		System.out.println("Meow, I am " + this.name + " and I get fed " + this.food + "!");;
	}
	
	public void eat(int x) {
		this.food -= x;
		if (this.food < 0) this.food = 0;
	}
	
	/*** static methods ***/
	
	public static int getCount() {
		return Cat.count;
	}
	
	public static void setCount(int val) {
		Cat.count = val;
	}
	
}