package com.test.gittest.mygittest.type;

import com.test.gittest.mygittest.base.Singable;
import com.test.gittest.mygittest.base.Swimable;
import com.test.gittest.mygittest.base.Walkable;

public class ClownFish extends Fish{

	public ClownFish(Singable singable, Walkable walkable, Swimable swimable) {
		super(singable, walkable, swimable);
	}
	
	@Override
	public void features() {
		System.out.println("I am "+Size.SMALL + "and "+Color.ORANGE);
	}
	
	@Override
	public void behavior() {
		System.out.println("Make Jokes");
	}

}
