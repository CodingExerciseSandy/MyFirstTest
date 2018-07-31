package com.test.gittest.mygittest;

import org.junit.Test;

import com.test.gittest.mygittest.base.Animal;
import com.test.gittest.mygittest.base.CannotFly;
import com.test.gittest.mygittest.base.Cluck;
import com.test.gittest.mygittest.base.CockADoodle;
import com.test.gittest.mygittest.base.Flyable;
import com.test.gittest.mygittest.base.Singable;
import com.test.gittest.mygittest.base.Walk;
import com.test.gittest.mygittest.base.Walkable;
import com.test.gittest.mygittest.type.Bird;
import com.test.gittest.mygittest.type.Chicken;
import com.test.gittest.mygittest.type.Rooster;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class Phase3Test extends TestCase
{
	
	private Bird bird;
	private Flyable flyable;
	private Singable singable;
	private Walkable walkable;
	
	@Test
    public void testSolution() {
		
		// TODO : Temp fix
		System.out.println("\n");
		System.out.println("Exercise 3 :: Testing");

		flyable = new CannotFly();
		singable = new CockADoodle();
		walkable = new Walk();
		Bird rooster = new Rooster(singable, flyable, walkable);
		System.out.println("I am Rooster");
		rooster.walk();
		rooster.fly();
		rooster.sing();
		
		System.out.println("\n");

		flyable = new CannotFly();
		singable = new Cluck();
		walkable = new Walk();
		Bird chicken = new Chicken(singable, flyable, walkable);
		System.out.println("I am Chicken");
		chicken.walk();
		chicken.fly();
		chicken.sing();
    }

	@Test
    public void testIsRoosterABirdAndAnimal()
    {
		flyable = new CannotFly();
		singable = new CockADoodle();
		walkable = new Walk();
		Bird rooster = new Rooster(singable, flyable, walkable);
        assertTrue( rooster instanceof Bird );
        assertTrue( rooster instanceof Animal );
    }
    
}
