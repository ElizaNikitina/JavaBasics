package com.syntax.class19;

public class TestClass {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.breed = "Husky";
		dog.color = "grey";
		dog.fur = "too much";
		dog.size = "big";
		Dog.age = 5;//access for static variables
		
		dog.bark();
		dog.beWild();
		dog.eat();
		dog.sleep();
		
		Animals animal = new Animals();
		animal.color = "Any";
		animal.size = "any";
		animal.fur = "any";
		
		animal.beWild();
		animal.sleep();
		animal.eat();
		
		Cat cat = new Cat();
		cat.color = "black";
		cat.age = 5;
		
		cat.play();
	}

}
