package Learn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	//provide the dataprovider function name under @Test
	@Test(dataProvider="getdata")
	//Since getdata has 2 combinations of data for username and password so put the 2 value type of data i.e username and password which are String's in the function
	public void LoginWeb(String username, String pwd) {
		System.out.println("Home : Web Login");
		System.out.println("Username Value :"+username);
		System.out.println("Password Value :"+pwd);
	}
	//now when you run this test individually by right click >> Run as TestNg test then you can see all the combinations of data used in this function
	
	@DataProvider
	//since we are returning data so the return type of getdata() is Object[][]
	public Object[][] getdata() {
		/*Suppose we want to test the below 3 combinations
		 * 1st combination : valid username and password - successful login
		 * 2nd combination : invaild username , valid password - unsuccessful login
		 * 3rd combination : valid username, invalid password - unsuccessful login
		 * So we have to create 2 dimensional array of 3*2 depicting 3 combinations with 2 values(username and password)
		 */
		Object[][] data= new Object[3][2];
		//data for 1st combination
		data[0][0]="validusername";
		data[0][1]="validpassword";
		
		//data for 2nd combination
		data[1][0]="invalidusername";
		data[1][1]="validpassword";
		
		//data for 3rd combination
		data[2][0]="validusername";
		data[2][1]="invalidpassword";
		
		//this will retuen the data to the test which uses it
		return data;
	}
	

}
