package Learn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertiesGlobalVariables {
	
	@Test
	public void LoginApplication() throws IOException {
		
		// this is used to read the values from .properties file. In this file you can store all global variables
		Properties prop = new Properties();
		
		//we have to tell prop where the properties file is
		//FileInputStram is java is used to read the file
		FileInputStream fis=new FileInputStream("C:\\SeleniumWorkspaceNew\\TestNGLearning\\src\\Learn\\datadriving.properties");
		//now integrate prop object with fis object
		prop.load(fis);
		
		System.out.println("Value of username from Properties file :"+ prop.getProperty("username"));
	}
	
	

}
