package com.syntax.class24;

public abstract class Phone {

	public void call() {
		System.out.println("Phone can call");
	}
	
	public void text() {
		System.out.println("Phone can send text");
	}
	
	public abstract void takePicture();
	
	public abstract void playMusic();
	
	
}

class iPhone extends Phone{
	@Override
	public void takePicture() {
		System.out.println("Iphone takes picture");
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		
	}
}


class Samsung extends Phone{

	@Override
	public void takePicture() {
		System.out.println("Samsung takes pictures");
	}

	@Override
	public void playMusic() {
		System.out.println("Sansung plays music using google store");
	}
	
}