package com.test.gittest.mygittest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.test.gittest.mygittest.base.Animal;
import com.test.gittest.mygittest.base.Singable;
import com.test.gittest.mygittest.type.Bird;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class Phase1Test extends TestCase
{
	
	private Bird bird;
	
	@Test
    public void testIsBirdAnAnimal()
    {
		
    	bird = new Bird();
        assertTrue( bird instanceof Animal );
    }
    
	@Test
    public void testCanBirdSing()
    {
    	bird = new Bird();
        assertTrue( bird instanceof Singable );
    }
    
	@Test
    public void testSolution() {
		// TODO : Temp fix
		System.out.println("\n");
		System.out.println("Exercise 1 :: Testing");
		
		Bird bird = new Bird();
		System.out.println("I am Bird");
		bird.walk();
		bird.fly();
		bird.sing();
    }

}
