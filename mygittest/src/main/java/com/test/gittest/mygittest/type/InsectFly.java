package com.test.gittest.mygittest.type;

import com.test.gittest.mygittest.base.Animal;
import com.test.gittest.mygittest.base.Flyable;
import com.test.gittest.mygittest.base.Singable;
import com.test.gittest.mygittest.base.Walkable;

public class InsectFly extends Animal {

	public InsectFly(Singable singable, Flyable flyable, Walkable walkable) {
		this.flyable = flyable;
		this.singable = singable;
		this.walkable = walkable;
	}
	
	public void fly() {
		flyable.fly();
	}

	public void sing() {
		singable.sing();
	}
	
	public void walk() {
		walkable.walk();
	}

}
