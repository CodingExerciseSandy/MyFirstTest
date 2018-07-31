package com.test.gittest.mygittest;

import org.junit.Test;

import com.test.gittest.mygittest.base.Animal;
import com.test.gittest.mygittest.base.Fly;
import com.test.gittest.mygittest.base.Flyable;
import com.test.gittest.mygittest.base.Meow;
import com.test.gittest.mygittest.base.Quack;
import com.test.gittest.mygittest.base.Singable;
import com.test.gittest.mygittest.base.Walk;
import com.test.gittest.mygittest.base.Walkable;
import com.test.gittest.mygittest.base.Woof;
import com.test.gittest.mygittest.type.Bird;
import com.test.gittest.mygittest.type.MeowParrot;
import com.test.gittest.mygittest.type.QuackParrot;
import com.test.gittest.mygittest.type.WoofParrot;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class Phase4Test extends TestCase
{
	
	private Bird bird;
	private Flyable flyable;
	private Singable singable;
	private Walkable walkable;
	
	@Test
    public void testSolution() {
		
		// TODO : Temp fix
		System.out.println("\n");
		System.out.println("Exercise 4 :: Testing");

		flyable = new Fly();
		singable = new Meow();
		walkable = new Walk();
		Bird meowParrot = new MeowParrot(singable, flyable, walkable);
		System.out.println("I am Meow Parrot");
		meowParrot.walk();
		meowParrot.fly();
		meowParrot.sing();
		
		System.out.println("\n");

		flyable = new Fly();
		singable = new Quack();
		walkable = new Walk();
		Bird quackParrot = new QuackParrot(singable, flyable, walkable);
		System.out.println("I am Quack Parrot");
		quackParrot.walk();
		quackParrot.fly();
		quackParrot.sing();
		
		System.out.println("\n");
		
		flyable = new Fly();
		singable = new Woof();
		walkable = new Walk();
		Bird woofParrot = new WoofParrot(singable, flyable, walkable);
		System.out.println("I am Woof Parrot");
		woofParrot.walk();
		woofParrot.fly();
		woofParrot.sing();
    }

	@Test
    public void testIsParrotABirdAndAnimal()
    {
		flyable = new Fly();
		singable = new Woof();
		walkable = new Walk();
		Bird woofParrot = new WoofParrot(singable, flyable, walkable);
        assertTrue( woofParrot instanceof Bird );
        assertTrue( woofParrot instanceof Animal );
    }
    
}
