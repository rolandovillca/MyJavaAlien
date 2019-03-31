package OOP;

class DownCasting {
	public static void main(String[] args) {
		// Polymorfism:
		Animal animal = new Cat("Missifuss");
		System.out.println(animal.speak());

		animal = new Dog("Sparky");
		System.out.println(animal.speak());

		// Downcasting examples:
		Animal a2 = new Cat("Cat2");
		Cat cat2 = (Cat)a2;

		Animal a3 = new Dog("Dog3");
		Dog dog3 = (Dog)a3;
		System.out.println(dog3.speak());

		Animal a4 = new RedCat("RedCat4");
		System.out.println(a4.speak());
		Cat c4 = (Cat)a4;
		System.out.println(c4.speak());
		RedCat rc4 = (RedCat)a4;
		System.out.println(rc4.speak());
		a4 = (Animal)rc4;
		System.out.println(a4.speak());
	}
}

abstract class Animal {
	private String name;

	protected Animal(String name) {
		this.name = name;
	}

	protected String getName() {
		return this.name;
	}

	protected abstract String speak();
}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	protected String speak() {
		return "Meaw!!!!!";
	}
}

class RedCat extends Cat {
	public RedCat(String name) {
		super(name);
	}

	protected String speak() {
		return "I am a red cat...";
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	protected String speak() {
		return "Woof!!!";
	}
}