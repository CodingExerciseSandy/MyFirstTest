package com.test.gittest.mygittest.type;

public class Chicken extends Bird{

	@Override
	public void sing() {
		System.out.println("I am singing Cluck, cluck");
	}
	
	@Override
	public void fly() {
		System.out.println("I can't fly");
	}
}
