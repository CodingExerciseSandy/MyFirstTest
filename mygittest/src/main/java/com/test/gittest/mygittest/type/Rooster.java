package com.test.gittest.mygittest.type;

import com.test.gittest.mygittest.base.Flyable;
import com.test.gittest.mygittest.base.Singable;

public class Rooster extends Bird{

	public Rooster(Singable singable, Flyable flyable) {
		super(singable, flyable);
	}
	
	@Override
	public void sing() {
		singable.sing();
	}
	
	@Override
	public void fly() {
		flyable.fly();
	}
}
