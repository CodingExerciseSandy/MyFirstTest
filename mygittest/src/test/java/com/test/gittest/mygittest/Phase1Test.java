package com.test.gittest.mygittest;

import org.junit.Test;

import com.test.gittest.mygittest.base.Animal;
import com.test.gittest.mygittest.base.Fly;
import com.test.gittest.mygittest.base.Flyable;
import com.test.gittest.mygittest.base.Sing;
import com.test.gittest.mygittest.base.Singable;
import com.test.gittest.mygittest.type.Bird;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class Phase1Test extends TestCase
{
	
	private Bird bird;
	private Flyable flyable;
	private Singable singable;
	
	@Test
    public void testIsBirdAnAnimal()
    {
		flyable = new Fly();
		singable = new Sing();
    	bird = new Bird(singable,flyable);
        assertTrue( bird instanceof Animal );
    }
    
	@Test
    public void testCanBirdSing()
    {
		flyable = new Fly();
		singable = new Sing();
    	bird = new Bird(singable,flyable);
        assertTrue( bird instanceof Singable );
    }
    
	@Test
    public void testSolution() {
		// TODO : Temp fix
		System.out.println("\n");
		System.out.println("Exercise 1 :: Testing");
		
		flyable = new Fly();
		singable = new Sing();
    	bird = new Bird(singable,flyable);
		System.out.println("I am Bird");
		bird.walk();
		bird.fly();
		bird.sing();
    }

}
