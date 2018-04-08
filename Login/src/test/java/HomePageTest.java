import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.Loginpages;
import com.crm.qa.util.utilities;

public class HomePageTest extends TestBase{

	Loginpages lp;
	HomePage homepage;
	utilities u;
	
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initilization();
		lp=new Loginpages();
		u=new utilities();
		homepage=lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	@Test(priority=1)
	public void validateusertest(){
		u.frame();
		Assert.assertTrue(homepage.validateuser());
	}
	
	
	
	
}
