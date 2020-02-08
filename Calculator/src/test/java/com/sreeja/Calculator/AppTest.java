package com.sreeja.Calculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.sreeja.Calculator.Operations.*;

/**
 * Unit test for simple App.
 */

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
	
	private static App a = new App(new Implementation());;
	
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
   public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    

    /**
     * Rigourous Test :-)
     */
    
    public void testApp()
    {
    	assertEquals(13.0, a.performCalculation(5, 8, '+'), 0.0);
    	assertEquals(-90.0, a.performCalculation(-100, -10, '-'), 0.0);
    	assertEquals(117.0, a.performCalculation(9, 13, '*'), 0.0);
    	assertEquals(1.5, a.performCalculation(3,2, '/'), 0.0);
    	
    } 
    
}