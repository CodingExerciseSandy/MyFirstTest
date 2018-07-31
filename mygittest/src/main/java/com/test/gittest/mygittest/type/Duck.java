package com.test.gittest.mygittest.type;

import com.test.gittest.mygittest.base.Flyable;
import com.test.gittest.mygittest.base.Singable;

public class Duck extends Bird{

	public Duck(Singable singable, Flyable flyable) {
		super(singable, flyable);
	}
	
	public void sing() {
		singable.sing();
	}
	
	public void walk() {
		System.out.println("I am swimming");
	}
	
}
