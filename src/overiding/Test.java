package overiding;


public class Test {
	public static void main(String[] args) {
		Animal a = new Animal("Animal");
		System.out.println(a.getName());
		a.eat();
		a.makeSound();
		a.sleep();
		Dog d = new Dog();
		System.out.println(d.getName());
		d.eat();
		d.makeSound();
		d.sleep();
		Cat c = new Cat();
		System.out.println(c.getName());
		c.eat();
		c.makeSound();
		c.sleep();
		Bird b = new Bird();
		System.out.println(b.getName());
		b.eat();
		b.makeSound();
		b.sleep();
				
	}
}
