package Learn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupsExample {
	
	//disadvantage of groups is only that particular test having the group will be executed all others will be skipped when you execute testng_groups.xml
	@Test(groups= {"Smoke"})
	public void LoginWeb() {
		System.out.println("Home : Web Login");
	}
	//testNG will skip the test where enabled=false
	@Test(enabled=false)
	public void LoginMobile() {
		System.out.println("Home : Mobile Login");
	}
	@Test
	public void LoginAPI() {
		System.out.println("Home : API Login");
	}
	@BeforeSuite
	public void envVariableSetup() {
		System.out.println("I am Before Suite in GroupsExample.java");
	}
	
	@AfterSuite
	public void envVariabledestroy() {
		System.out.println("I am After Suite");
	}
	
	@BeforeMethod
	public void Functionbefore() {
		System.out.println("I am before method");
		System.out.println("GIT changes : plz ignore");
	}
	
	@AfterMethod
	public void Functionafter() {
		System.out.println("I am after method");
	}

}
