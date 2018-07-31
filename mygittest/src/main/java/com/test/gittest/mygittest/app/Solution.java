/**
 * 
 */
package com.test.gittest.mygittest.app;

import com.test.gittest.mygittest.base.Fly;
import com.test.gittest.mygittest.base.Flyable;
import com.test.gittest.mygittest.base.Sing;
import com.test.gittest.mygittest.base.Singable;
import com.test.gittest.mygittest.type.Bird;
import com.test.gittest.mygittest.type.Rooster;

/**
 * @author sandeep
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Flyable flyable = new Fly();
		Singable singable = new Sing();
		Bird bird = new Rooster(singable, flyable);
		bird.walk();
		bird.fly();
		bird.sing();
	}

}
