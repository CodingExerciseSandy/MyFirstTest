package com.test.gittest.mygittest;

import org.junit.Test;

import com.test.gittest.mygittest.base.Animal;
import com.test.gittest.mygittest.base.CannotFly;
import com.test.gittest.mygittest.base.Cluck;
import com.test.gittest.mygittest.base.Fly;
import com.test.gittest.mygittest.base.Flyable;
import com.test.gittest.mygittest.base.Quack;
import com.test.gittest.mygittest.base.Sing;
import com.test.gittest.mygittest.base.Singable;
import com.test.gittest.mygittest.type.Bird;
import com.test.gittest.mygittest.type.Chicken;
import com.test.gittest.mygittest.type.Duck;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class Phase2Test extends TestCase
{
	
	private Bird bird;
	private Flyable flyable;
	private Singable singable;
	
	@Test
    public void testSolution() {
		
		// TODO : Temp fix
		System.out.println("\n");
		System.out.println("Exercise 2 :: Testing");
		
		flyable = new Fly();
		singable = new Quack();
		Bird duck = new Duck(singable, flyable);
		System.out.println("I am Duck");
		duck.walk();
		duck.fly();
		duck.sing();
		
		System.out.println("\n");
		
		flyable = new CannotFly();
		singable = new Cluck();
		Bird chicken = new Chicken(singable, flyable);
		System.out.println("I am Chicken");
		chicken.walk();
		chicken.fly();
		chicken.sing();
    }

	@Test
    public void testIsDuckABirdAndAnimal()
    {
		flyable = new Fly();
		singable = new Sing();
		Bird duck = new Duck(singable, flyable);
        assertTrue( duck instanceof Bird );
        assertTrue( duck instanceof Animal );
    }
    
	@Test
    public void testIsChickenABirdAndAnimal()
    {
		flyable = new CannotFly();
		singable = new Cluck();
		Bird chicken = new Chicken(singable, flyable);
        assertTrue( chicken instanceof Bird );
        assertTrue( chicken instanceof Animal );
    }
}
