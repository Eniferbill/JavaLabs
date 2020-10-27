package lab;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CompareTest {
	
	@BeforeClass
    public static void beforeClass() {
        System.out.println("Before CompareTest.class");
    }
 
    @AfterClass
    public  static void afterClass() {
        System.out.println("After CompareTest.class");
    }
    
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
