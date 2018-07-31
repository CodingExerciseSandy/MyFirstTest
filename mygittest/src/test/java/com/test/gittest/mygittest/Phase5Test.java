package com.test.gittest.mygittest;

import org.junit.Test;

import com.test.gittest.mygittest.base.Animal;
import com.test.gittest.mygittest.base.CannotSing;
import com.test.gittest.mygittest.base.CannotWalk;
import com.test.gittest.mygittest.base.Fly;
import com.test.gittest.mygittest.base.Flyable;
import com.test.gittest.mygittest.base.Meow;
import com.test.gittest.mygittest.base.Quack;
import com.test.gittest.mygittest.base.Singable;
import com.test.gittest.mygittest.base.Swim;
import com.test.gittest.mygittest.base.Swimable;
import com.test.gittest.mygittest.base.Walk;
import com.test.gittest.mygittest.base.Walkable;
import com.test.gittest.mygittest.base.Woof;
import com.test.gittest.mygittest.type.Bird;
import com.test.gittest.mygittest.type.ClownFish;
import com.test.gittest.mygittest.type.Fish;
import com.test.gittest.mygittest.type.MeowParrot;
import com.test.gittest.mygittest.type.QuackParrot;
import com.test.gittest.mygittest.type.Shark;
import com.test.gittest.mygittest.type.WoofParrot;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class Phase5Test extends TestCase
{
	
	private Bird bird;
	private Swimable swimable;
	private Singable singable;
	private Walkable walkable;
	
	@Test
    public void testSolution() {
		
		// TODO : Temp fix
		System.out.println("\n");
		System.out.println("Exercise 5 :: Testing");

		swimable = new Swim();
		singable = new CannotSing();
		walkable = new CannotWalk();
		Fish fish = new Fish(singable, walkable, swimable);
		System.out.println("I am Fish");
		fish.walk();
		fish.swim();
		fish.sing();
		
		System.out.println("\n");

		swimable = new Swim();
		singable = new CannotSing();
		walkable = new CannotWalk();
		Fish shark = new Shark(singable, walkable, swimable);
		System.out.println("I am Shark");
		shark.walk();
		shark.swim();
		shark.sing();
		shark.features();
		shark.behavior();
		
		System.out.println("\n");
		
		swimable = new Swim();
		singable = new CannotSing();
		walkable = new CannotWalk();
		Fish clownfish = new ClownFish(singable, walkable, swimable);
		System.out.println("I am ClownFish");
		clownfish.walk();
		clownfish.swim();
		clownfish.sing();
		clownfish.features();
		clownfish.behavior();
    }

	@Test
    public void testIsCownFishAFish()
    {
		swimable = new Swim();
		singable = new Meow();
		walkable = new Walk();
		Fish clownfish = new ClownFish(singable, walkable, swimable);
        assertTrue( clownfish instanceof Fish );
    }
    
}
