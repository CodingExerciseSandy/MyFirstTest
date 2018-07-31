package com.test.gittest.mygittest;

import org.junit.Test;

import com.test.gittest.mygittest.base.Animal;
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
	
	@Test
    public void testSolution() {
		
		// TODO : Temp fix
		System.out.println("\n");
		System.out.println("Exercise 2 :: Testing");
		
		Bird duck = new Duck();
		System.out.println("I am Duck");
		duck.walk();
		duck.fly();
		duck.sing();
		
		System.out.println("\n");
		
		Bird chicken = new Chicken();
		System.out.println("I am Chicken");
		chicken.walk();
		chicken.fly();
		chicken.sing();
    }

	@Test
    public void testIsDuckABirdAndAnimal()
    {
    	bird = new Duck();
        assertTrue( bird instanceof Bird );
        assertTrue( bird instanceof Animal );
    }
    
	@Test
    public void testIsChickenABirdAndAnimal()
    {
    	bird = new Chicken();
        assertTrue( bird instanceof Bird );
        assertTrue( bird instanceof Animal );
    }
}
