package com.test.gittest.mygittest;

import org.junit.Test;

import com.test.gittest.mygittest.base.Animal;
import com.test.gittest.mygittest.base.CannotFly;
import com.test.gittest.mygittest.base.CannotSing;
import com.test.gittest.mygittest.base.CannotWalk;
import com.test.gittest.mygittest.base.Cluck;
import com.test.gittest.mygittest.base.CockADoodle;
import com.test.gittest.mygittest.base.Crawl;
import com.test.gittest.mygittest.base.Fly;
import com.test.gittest.mygittest.base.Flyable;
import com.test.gittest.mygittest.base.Meow;
import com.test.gittest.mygittest.base.Quack;
import com.test.gittest.mygittest.base.Sing;
import com.test.gittest.mygittest.base.Singable;
import com.test.gittest.mygittest.base.Swim;
import com.test.gittest.mygittest.base.Swimable;
import com.test.gittest.mygittest.base.Walk;
import com.test.gittest.mygittest.base.Walkable;
import com.test.gittest.mygittest.base.Woof;
import com.test.gittest.mygittest.type.Bird;
import com.test.gittest.mygittest.type.ButterFly;
import com.test.gittest.mygittest.type.CaterPiller;
import com.test.gittest.mygittest.type.Chicken;
import com.test.gittest.mygittest.type.ClownFish;
import com.test.gittest.mygittest.type.Duck;
import com.test.gittest.mygittest.type.Fish;
import com.test.gittest.mygittest.type.Rooster;
import com.test.gittest.mygittest.type.Shark;
import com.test.gittest.mygittest.type.WoofParrot;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class Phase7Test extends TestCase {

	private Flyable fly = new Fly();
	private Flyable cannotfly = new CannotFly();
	
	private Singable singing = new Sing();
	private Singable cannotsing = new CannotSing();
	private Singable cluck = new Cluck();
	private Singable cockadoodle = new CockADoodle();
	private Singable quack = new Quack();
	private Singable meow = new Meow();
	private Singable woof = new Woof();
			
	private Walkable walk = new Walk();
	private Walkable cannotwalk = new CannotWalk();
	private Walkable crawl = new Crawl();
	
	private Swimable swim = new Swim();

	
	Animal[] animals = new Animal[]{ new Bird(singing, fly, walk),
			new Duck(quack, fly, cannotwalk, swim),
	        new Chicken(cluck, cannotfly, walk),
	        new Rooster(cockadoodle, cannotfly, walk),
	        new WoofParrot(woof, fly, walk),
	        new Fish(cannotsing, cannotwalk, swim),
	        new Shark(cannotsing, cannotwalk, swim),
	        new ClownFish(cannotsing, cannotwalk, swim),
	        new ButterFly(cannotsing, fly, cannotwalk),
	        new CaterPiller(cannotsing, cannotfly, walk)};

	
	@Test
    public void testWhoCanFly() {
		int count = 0;
		
		System.out.println("\n\nExercise 7 :: testing");
		System.out.println("\nTesing WhoCanFly");
		
		
		for(Animal animal : animals) {
			if(animal.getFlyable() instanceof Fly) {
				count++;
				System.out.println(animal.getClass().getSimpleName());
			}
		}
		
		System.out.println(count + " animals can fly");
	}
	
	@Test
    public void testWhoCanWalk() {
		int count = 0;
		
		System.out.println("\n\nTesing WhoCanWalk");
		
		for(Animal animal : animals) {
			if(animal.getWalkable() instanceof Walk) {
				count++;
				System.out.println(animal.getClass().getSimpleName());
			}
		}
		
		System.out.println(count + " animals can walk");
	}
	
	@Test
    public void testWhoCanSing() {
		int count = 0;
		
		System.out.println("\n\nTesing WhoCanSing");
		
		for(Animal animal : animals) {
			if(animal.getSingable() instanceof Sing) {
				count++;
				System.out.println(animal.getClass().getSimpleName());
			}
		}
		
		System.out.println(count + " animals can sing");
	}
	
	@Test
    public void testWhoCanSwim() {
		int count = 0;
		
		System.out.println("\n\nTesing WhoCanSwim");
		
		for(Animal animal : animals) {
			if(animal.getSwimable() instanceof Swim) {
				count++;
				System.out.println(animal.getClass().getSimpleName());
			}
		}
		
		System.out.println(count + " animals can swim");
	}

}
