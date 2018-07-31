package com.test.gittest.mygittest.type;

public class Duck extends Bird{

	@Override
	public void sing() {
		System.out.println("I am singing Quack, quack");
	}
	
	@Override
	public void walk() {
		System.out.println("I am swimming");
	}
	
}
