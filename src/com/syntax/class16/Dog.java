package com.syntax.class16;

public class Dog {

	int age;
	String name, size;
	static String breed = "Hasky";
	static int paws = 4;
	static int tail = 1;
	static int eyes = 2;

	void DisplayDog() {
		System.out.println("Dog name is " + name + " and it is " + size + " dog and age is " + age);
		System.out.println("Dog breed is " + breed + " and it has " + paws + " paws and " + tail + " tail");
	}

	public static void main(String[] args) {

		Dog obj = new Dog();
		obj.age = 3;
		obj.name = "Lucy";
		obj.size = "big";
		obj.age = 6;
		obj.DisplayDog();
		System.out.println(Dog.breed);
		System.out.println(Dog.paws);
		System.out.println(obj.breed);
		System.out.println(breed);

		// changing value of static variable
		breed = "Buldog";
		
		Dog obj2 = new Dog();
		obj2.age = 2;
		obj2.name = "Macy";
		obj2.size = "small";
		obj.DisplayDog();

		Dog obj3 = new Dog();
		obj3.age = 5;
		obj3.name = "Sharik";
		obj3.size = "medium";
		obj3.DisplayDog();

		System.out.println("Dog one name is " + obj.name);
		System.out.println("Dog two name is " + obj2.name);

	}

}
