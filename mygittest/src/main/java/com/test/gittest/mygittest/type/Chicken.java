package com.test.gittest.mygittest.type;

import com.test.gittest.mygittest.base.Flyable;
import com.test.gittest.mygittest.base.Singable;

public class Chicken extends Bird{
	
	public Chicken(Singable singable, Flyable flyable) {
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
