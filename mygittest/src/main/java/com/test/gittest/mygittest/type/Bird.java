package com.test.gittest.mygittest.type;

import com.test.gittest.mygittest.base.Animal;
import com.test.gittest.mygittest.base.Flyable;
import com.test.gittest.mygittest.base.Singable;

public class Bird extends Animal implements Singable, Flyable{

	public Bird(Singable singable, Flyable flyable) {
		this.flyable = flyable;
		this.singable = singable;
	}
}
