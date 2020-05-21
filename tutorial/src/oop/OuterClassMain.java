package oop;

public class OuterClassMain {
	public static void main(String[] args) {
		// access to the inner class through private access.
		OuterClass out = new OuterClass();
		out.inner();
		// access to the inner class through public access.
		OuterClass.InnerClass in = out.new InnerClass();
		in.display();
		
		// creation of a class using a method of the outer class.
		out.inMethod();
	}
}