package com.test.gittest.mygittest;

import com.test.gittest.mygittest.base.Animal;
import com.test.gittest.mygittest.base.Singable;
import com.test.gittest.mygittest.type.Bird;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Phase1Test 
    extends TestCase
{
	
	private Bird bird;
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Phase1Test( String testName )
    {
        super( testName );
    }

    @Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	/**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Phase1Test.class );
    }


    public void testIsBirdAnAnimal()
    {
    	bird = new Bird();
        assertTrue( bird instanceof Animal );
    }
    
    public void testCanBirdSing()
    {
    	bird = new Bird();
        assertTrue( bird instanceof Singable );
    }

}
