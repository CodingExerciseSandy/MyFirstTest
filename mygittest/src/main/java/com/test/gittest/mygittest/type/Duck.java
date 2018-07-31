package com.test.gittest.mygittest.type;

import com.test.gittest.mygittest.base.Flyable;
import com.test.gittest.mygittest.base.Singable;
import com.test.gittest.mygittest.base.Walkable;

public class Duck extends Bird{

	public Duck(Singable singable, Flyable flyable, Walkable walkable) {
		super(singable, flyable, walkable);
	}
	
}
