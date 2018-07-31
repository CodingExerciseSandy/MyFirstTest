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
	protected Swimable swimable;
	
	public Singable getSingable() {
		return singable;
	}
	public Flyable getFlyable() {
		return flyable;
	}
	public Walkable getWalkable() {
		return walkable;
	}
	public Swimable getSwimable() {
		return swimable;
	}
	
	
	
}
