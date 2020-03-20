package Learn;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTestNG {
	
	/*@Test : is treated as Test case in TestNG
	 	best practise is to have test case name in the function name in TestNG as we write test cases under @Test Annotation
		Now when you click on Run As : you will see "TestNG Test" and not "Java Application" as the main method is not there 
	
	Advantages of TestNG over java class is we can create multiple test cases in TestNG but in java we can have just one main method
	
	To create TestNG xml file for the first Time in the project:
	Right click on project >> TestNG >> Convert to Test NG
	
	------ Understanding TestNG xml structure -------
	<suite> : there will be one start and end suite. You can provide your own suite name based on project
	<test> : there can be multiple test tags. Usually each module is treated as test
	you can provide any test name. By detault the name is test.
	Ex: <test name="Test">
	But you can change it to any name and it is not dependent on project stucture:  <test name="Personal Loan">
	<class> : all the test cases under that <test> or module is placed under the <test>
	
	Advantage of having thix xml file is:
	Now when we right click on TestNG.xml file, we can see Run as >> TestNG Suite
	insted of right clicking on individual test cases and doing right click >> Run as TestNG Test
	-------------------------------------------------
	
	---------------- To exclude some tests from running in suite----------
	mention methods tab under the class file from which the particular method/test you do not want to execute
	Ex: here LoginMobile test will not be executed
	 <class name="Learn.AutoLoan">
      <methods>
      <exclude name="LoginMobile"/>

      </methods>
      </class>
	
	----------------------------------------------------------------------
	
	---------------- To include some tests from running in suite----------
	mention methods tab under the class file from which the particular method/test you do not want to include. All the remaining methods of this class will not be executed only the include ones will be executed
	Ex: here LoginMobile test will not be executed
	 <class name="Learn.AutoLoan">
      <methods>
      <include name="LoginMobile"/>

      </methods>
      </class>
      
      NOte : you can also put the name as Regex. Ex: <include name="Login.*"/>
      Now all login methods will be included
	
	----------------------------------------------------------------------
	
	---------------- Running tests by package level --------------------
	
	You can also run the testNG suite by providing the package name under which all tests are present.
	Ex:testng_package.xml has the setting
	--------------------------------------------------------------------
	
	----------------------- Questions------------------------------------
	Difference between @BeforeMethod and @BeforeTest and @BeforeClass
	Answer-	@BeforeMethod and @BeforeClass are class level and @BeforeTest are testng.xml level
	 		@BeforeMethod will be executed before every method the class in which it is defined
			Ex: if @BeforeMethod is present in Newtestcase.java so before evert @Test methods in this class the @BeforeMethod will be executed
			@BeforeTest will be executed before the test defined in testng.xml file Ex: <test name="Personal Loan">
			so @BeforeTest will be executed only once for all the classes present under <test name="Personal Loan">
			@BeforClass: will be executed once at class level
	---------------------------------------------------------------------
	Question : How to make certain test cases to execute
	Answer : create groups. Ex: @Test(groups={"smoke"})
	---------------------------------------------------------------------
	Question : TestNG Annotations
	Answer : @BeforeSuite/@AfterSuite and @BeforeTest/@AfterTest apply on testng.xml level
			 @BeforeClass/@AfterClass and @BeforeMethd/@AfterMethod apply on class level
	---------------------------------------------------------------------
	Question : TestNG Helper attributes
	Answer : 1) Groups Ex: @Test(groups={"smoke"})
			 2) enabled Ex:@Test(enabled=false)    // this particular test will not be executed when enabled=fasle
			 3) timeout Ex:@Test(timeout=4000)		// for this particular test block it will wait for 4 seconds before throwing error. 
	---------------------------------------------------------------------
	
	*/
	@Test
	public void TestCase1() {
		System.out.println("Code for 1st Test Case");
	}
	
	@Test
	public void TestCase2() {
		System.out.println("Code for 2nd Test Case");
	}
	//this code will be executed before every <test> tag mentioned in testng.xml file. Multiple <class> can be present under the <test> tag
	@BeforeTest
	public void cleanup() {
		System.out.println("I'm BeforeTest");
	}

}
