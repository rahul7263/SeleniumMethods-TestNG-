package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
   
	 static SoftAssert ast1 = new SoftAssert();
	 static SoftAssert ast2 = new SoftAssert();
	
	@Test
	public static void test1() {
	  
		System.out.println("Soft Assert 1 started");
		ast1.assertTrue(true);
		ast1.assertEquals(true,true);
		System.out.println("Soft Assert 1 ended");
		ast1.assertAll();
		
	}
	
	@Test 
	public static void test2() {
		
		System.out.println("Soft Assert 2 started");
		ast2.assertTrue(false);
		ast2.assertEquals(false, true);
		System.out.println("Soft Assert 2 ended");
		ast2.assertAll();
		
	}
}
