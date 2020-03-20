package Learn;

import org.testng.annotations.Test;

public class AutoLoan {
	
	@Test
	public void LoginWeb() {
		System.out.println("Auto : Web Login");
	}
	@Test
	public void LoginMobile() {
		System.out.println("Auto : Mobile Login");
	}
	
	//Disadvantage of using dependsOnMethods is LoginMobile will not be executed when you run from testng.xml file
	@Test(dependsOnMethods= {"LoginWeb"})
	public void LoginAPI() {
		System.out.println("Auto : API Login");
	}

}
