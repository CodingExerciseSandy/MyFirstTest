package com.test.gittest.mygittest.type;

import com.test.gittest.mygittest.base.Animal;
import com.test.gittest.mygittest.base.Flyable;
import com.test.gittest.mygittest.base.Singable;

public class Bird extends Animal implements Singable, Flyable{

	protected Singable singable;
	protected Flyable flyable;
	
	public Bird(Singable singable, Flyable flyable) {
		this.flyable = flyable;
		this.singable = singable;
	}
	
	public void fly() {
		flyable.fly();
	}

	public void sing() {
		singable.sing();
	}
}
