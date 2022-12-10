package practice;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
       
	@Test
	public static void test1() {
		
		System.out.println("test 1 started");
		Assert.assertTrue(false);
		System.out.println("test 1 ended");
	
	}
	
	@Test
    public static void test2() {
		
		System.out.println("test 2 started");
		Assert.assertTrue(true);
		System.out.println("test 2 ended");
	}
}
