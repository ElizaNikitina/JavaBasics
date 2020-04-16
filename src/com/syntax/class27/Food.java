package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Food {

	public String type;

	public Food(String type) {
		this.type = type;
	}

	public abstract void calories();

	public abstract void cook();

	public abstract void eat();

}

class Meat extends Food {

	public Meat(String type) {
		super(type);
	}

	@Override
	public void calories() {
		System.out.println(type + " includes 1000 calories per pound");
	}

	@Override
	public void cook() {
		System.out.println(type + " cooking at least one hour");
	}

	@Override
	public void eat() {
		System.out.println(type + " better eat on lunch");
	}
}

class Vegie extends Food {

	public Vegie(String type) {
		super(type);
	}

	@Override
	public void calories() {
		System.out.println(type + " includes 500 calories per pound");
	}

	@Override
	public void cook() {
		System.out.println(type + " cooking 15 minutes");
	}

	@Override
	public void eat() {
		System.out.println(type + " you can eat whenever you want");
	}
}

class Bread extends Food {
	public Bread(String type) {
		super(type);
	}

	@Override
	public void calories() {
		System.out.println(type + " includes 700 calories per pound");
	}

	@Override
	public void cook() {
		System.out.println(type + " better allow to cook your mother");
	}

	@Override
	public void eat() {
		System.out.println(type + " don`t eat at night");
	}
}

class Pasta extends Food {
	public Pasta(String type) {
		super(type);
	}

	@Override
	public void calories() {
		System.out.println(type + " includes 800 calories per pound");
	}

	@Override
	public void cook() {
		System.out.println(type + " cooking 10 minutes");
	}

	@Override
	public void eat() {
		System.out.println(type + " eat with pleasure and white wine ");
	}
}


