/**
 * 
 */
package com.test.gittest.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.test.gittest.mygittest.Phase1Test;
import com.test.gittest.mygittest.Phase2Test;
import com.test.gittest.mygittest.Phase3Test;
import com.test.gittest.mygittest.Phase4Test;

/**
 * @author sandeep
 *
 */
@RunWith(Suite.class)
@SuiteClasses({
	Phase1Test.class,
	Phase2Test.class,
	Phase3Test.class,
	Phase4Test.class
})
public class ExerciseTestSuite {

}
