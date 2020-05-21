package oop;

public class OuterClass {
	
	public class InnerClass {
		public void display() {
			System.out.println("This is an inner class");
		}
	}
	
	public void inner() {
		InnerClass in = new InnerClass();
		in.display();
	}
	
	public void inMethod() {
		class InMethodClass {
			public void display() {
				System.out.println("This is an class in a method");
			}
		}
		
		InMethodClass imc = new InMethodClass();
		imc.display();
	}
}