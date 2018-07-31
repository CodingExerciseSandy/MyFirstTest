package com.test.gittest.mygittest.type;

import com.test.gittest.mygittest.base.Animal;
import com.test.gittest.mygittest.base.Singable;

public class Bird extends Animal implements Singable{

	public void fly() {
		System.out.println("I am flying");
	}

	public void sing() {
		System.out.println("I am Singing");
	}
}
