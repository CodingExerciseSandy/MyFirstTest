package com.test.gittest.mygittest.type;

import com.test.gittest.mygittest.base.Animal;
import com.test.gittest.mygittest.base.Features;
import com.test.gittest.mygittest.base.Singable;
import com.test.gittest.mygittest.base.Swimable;
import com.test.gittest.mygittest.base.Walkable;

public class Fish extends Animal implements Features{

	public Fish(Singable singable, Walkable walkable, Swimable swimable) {
		this.walkable = walkable;
		this.singable = singable;
		this.swimable = swimable;
	}
	
	public void walk() {
		walkable.walk();
	}

	public void sing() {
		singable.sing();
	}
	
	public void swim() {
		swimable.swim();
	}
	
	public void features() {
		System.out.println(Color.GREY + " in color and "+Size.SMALL);
	}

	public void behavior() {
		System.out.println("Silent in nature");		
	}
}
