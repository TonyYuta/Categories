package core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppTest {
	@BeforeClass
	public static void BeforeClass02() {
		System.out.println("@BeforeClass");
	}
	
	@AfterClass
	public static void AfterClass02() {
		System.out.println("@AfterClass");
	}
	
	@Before
	public void Before() {
		System.out.println("@Before");
	}
	
	@After
	public void After() {
		System.out.println("@After");
	}
	
	@Category(AcceptanceTest.class)
	@Test
	public void Test_01() {
		System.out.println("Test_01");
	}
	
	@Category(RegressionTest.class)
	@Test
	public void Test_02() {
		System.out.println("Test_02");
	}
	
	@Category({AcceptanceTest.class, RegressionTest.class})
	@Test
	public void Test_03() {
		System.out.println("Test_03");
	}
	
	@Test
	public void Test_04() {
		System.out.println("Test_04");
	}


}
