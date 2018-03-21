import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.Loginpages;

public class LoginPageTest extends TestBase{
	Loginpages lp;
	HomePage homepage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initilization();
		lp =new Loginpages();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test(priority=1)
	public void loginpagetitletest()
	{
		String logintitle=lp.validateloginpagetitle();
		assertEquals(logintitle,"#1 Free CRM for Any Business: Online Customer Relationship Software");
		
/*		if(logintitle.contentEquals("www.freecrm.com")){
			System.out.println("Title validated");
		}
		else{
			System.out.println("Wrong Title");
		}
	*/
	}
	
	@Test(priority=2)
	public void loginpagelogotest()
	{
		boolean flag=lp.validatecrmimage();
		assertTrue(flag);
		//	assertEquals(flag, true);
	/*	if(lp.validatecrmimage()==true){
			System.out.println("Logo validated");
		}else
		{
			System.out.println("Logo mismatch");
		}
		*/
	}
	
	@Test(priority=3)
	public void logintest()
	{
		homepage=lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
}
