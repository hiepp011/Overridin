package overiding;

public class Bird extends Animal {

	public Bird() {
		super("Bird");
	}

	@Override
	public void eat() {
		System.out.println("I eat nust");
	}

	@Override
	public void makeSound() {
		System.out.println("I sing");
	}
	
	
}
