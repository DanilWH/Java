package oop;

public class Main {

	public static void main(String[] args) {
		// working with the Dog class.
		Dog danil = new Dog("Danil", 17);
		danil.speak();
		
		Dog bill = new Dog("bill", 3);
		bill.speak();
		
		Dog ball = new Dog("ball", 756);
		ball.speak();
		
		danil.speak();
		
		int x = danil.getAge();
		System.out.println(x);
		
		danil.changeAge(435);
		System.out.println(danil.getAge());
		danil.speak();
		
		// working with the Cat class.
		Cat bob = new Cat("Bob", 3, 100);
		Cat bullet = new Cat("Bullet", 7);
		Cat gun = new Cat("Gun");
		
		bob.speak();
		bob.eat(10);
		bob.speak();
		System.out.println(bob.getAge());
		
		bullet.speak();
		System.out.println(bullet.getAge());
		
		System.out.println(gun.getAge());
		gun.speak();
		
		System.out.println(Dog.getCount());
		Dog.setCount(345);
		System.out.println(Dog.getCount());
		
		System.out.println(Cat.getCount());
		Cat.setCount(987);
		System.out.println(Cat.getCount());
	}

}
