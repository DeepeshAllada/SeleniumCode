package Learn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
	@Parameters({"URL"})
	@Test
	//note : the URL in parameters is copied to String urlname in below test
	public void LoginAPI(String urlname) {
		System.out.println("Home : API Login");
		System.out.println("Value of the URL from parameters defined in testng_globalparameterization.xml is :"+ urlname);
	}
	
	@Test
	public void LoginWeb() {
		System.out.println("Home : Web Login");
	}
	

}
