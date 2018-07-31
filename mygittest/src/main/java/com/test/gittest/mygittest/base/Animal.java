/**
 * 
 */
package com.test.gittest.mygittest.base;

/**
 * @author sandeep
 *
 */
public abstract class Animal {

	protected Singable singable;
	protected Flyable flyable;
	protected Walkable walkable;
	
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
