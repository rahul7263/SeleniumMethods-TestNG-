package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.testng.annotations.DataProvider;
public class Dataprovider {
    	
	@Test(priority= 0,dataProvider = "LoginData")
	public void loginTest(String email, String pwd) {
		
		System.out.println(email+" "+pwd);
	}
	
	@Test(priority=1,dataProvider = "data")
	public void data(String email, String pwd) {
		
		System.out.println(email+" "+pwd);
	}
	
	@DataProvider(name="LoginData")
    public Object[][] getData(){
    return new Object[][] 
    	{
            { "Guru99", "India" },
            { "Krishna", "UK" },
            { "Bhupesh", "USA" }
        };
     
	   }
  
	@DataProvider(name="data")
		 public Object[][] data(){
		Object[][] data = {{"rahul","kande"},{"Ashok","Kande"}};
		
	   return data;	
    }	
	
 }
  
	 


