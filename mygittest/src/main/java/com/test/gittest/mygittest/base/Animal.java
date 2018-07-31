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
	
	public void fly() {
		flyable.fly();
	}

	public void sing() {
		singable.sing();
	}
	
	public void walk() {
		System.out.println("I am walking");
	}
	
}
