package com.test.gittest.mygittest;

import org.junit.Test;

import com.test.gittest.mygittest.base.Animal;
import com.test.gittest.mygittest.base.CannotFly;
import com.test.gittest.mygittest.base.CannotSing;
import com.test.gittest.mygittest.base.CannotWalk;
import com.test.gittest.mygittest.base.Crawl;
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
import com.test.gittest.mygittest.type.ButterFly;
import com.test.gittest.mygittest.type.CaterPiller;
import com.test.gittest.mygittest.type.ClownFish;
import com.test.gittest.mygittest.type.Fish;
import com.test.gittest.mygittest.type.InsectFly;
import com.test.gittest.mygittest.type.MeowParrot;
import com.test.gittest.mygittest.type.QuackParrot;
import com.test.gittest.mygittest.type.Shark;
import com.test.gittest.mygittest.type.WoofParrot;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class Phase6Test extends TestCase
{
	
	private Bird bird;
	private Flyable flyable;
	private Singable singable;
	private Walkable walkable;
	
	@Test
    public void testSolution() {
		
		// TODO : Temp fix
		System.out.println("\n");
		System.out.println("Exercise 6 :: Testing");

		flyable = new Fly();
		singable = new CannotSing();
		walkable = new CannotWalk();
		InsectFly butterFly = new ButterFly(singable, flyable, walkable);
		System.out.println("I am Buterfly");
		butterFly.walk();
		butterFly.fly();
		butterFly.sing();
		
		System.out.println("\n");

		flyable = new CannotFly();
		singable = new CannotSing();
		walkable = new Crawl();
		InsectFly caterpiller = new CaterPiller(singable, flyable, walkable);
		System.out.println("I am CaterPiller");
		caterpiller.walk();
		caterpiller.fly();
		caterpiller.sing();
		
		System.out.println("\n");
		
		flyable = new Fly();
		singable = new CannotSing();
		walkable = new CannotWalk();
		InsectFly caterpillerm = new CaterPiller(singable, flyable, walkable);
		System.out.println("I am CaterPiller after metamorphosis");
		caterpillerm.walk();
		caterpillerm.fly();
		caterpillerm.sing();
    }

    
}
