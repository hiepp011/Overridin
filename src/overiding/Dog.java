package overiding;

public class Dog extends Animal {

	public Dog() {
		super("Dog");
	}

	@Override
	public void eat() {
		System.out.println("I eat bones");
	}

	@Override
	public void makeSound() {
		System.out.println("Gâu gâu");
	}
	

}
