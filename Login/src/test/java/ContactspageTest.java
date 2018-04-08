import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.Loginpages;
import com.crm.qa.pages.contactspage;
import com.crm.qa.util.utilities;

public class ContactspageTest extends TestBase {
	Loginpages lp;
	HomePage homepage;
	utilities u;
	contactspage cp;
	String sheetname="contacts";
	
	public ContactspageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initilization();
		lp=new Loginpages();
		u=new utilities();
		cp=new contactspage();
		homepage=lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getCRMTestData(){
		 Object data[][]=u.getTestData(sheetname);
		return data;
	}
	
	@Test(dataProvider="getCRMTestData")
	public void validatenewcreatecontact(String title,String name,String fname,String category){
		
	}
	@Test()
	public void DetailsTest(){
		//homepage.Homepagecon();
		u.frame();
		homepage.newcontact();
		cp.details();
		//Assert.assertEquals(arg0, arg1);
	}
}
