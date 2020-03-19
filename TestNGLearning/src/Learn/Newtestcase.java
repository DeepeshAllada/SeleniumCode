package Learn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtestcase {
	
	@Test
	public void loan() {
		System.out.println("Loan test case");
	}
	@Test
	public void loanApproval() {
		System.out.println("Loan Approval test case");
	}
	@AfterTest
	public void cleanup() {
		System.out.println("I'll execute Last in the test configured in testng.xml file");
	}
	
	@BeforeSuite
	public void envVariableSetup() {
		System.out.println("I am Before Suite in Newtest.java");
	}
	
	@AfterSuite
	public void envVariabledestroy() {
		System.out.println("I am After Suite");
	}
	
	@BeforeMethod
	public void Functionbefore() {
		System.out.println("I am before method");
	}
	
	@AfterMethod
	public void Functionafter() {
		System.out.println("I am after method");
	}
	
	@BeforeClass
	public void beforeclassfunction() {
		System.out.println("I am before class");
	}
	
	@AfterClass
	public void afterclassfunction() {
		System.out.println("I am after class");
	}
	
}
