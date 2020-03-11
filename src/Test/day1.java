package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1{
	
@Test	 
public void Demo() { 
	
	System.out.println("hello");

}
@BeforeTest
public void beforeTest()
{
	System.out.println("before test");
}

@Test
public void secondTest() {
	
	System.out.println("bye");
}

 }