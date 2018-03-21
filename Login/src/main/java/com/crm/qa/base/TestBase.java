package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	//public static void main(String[] args) {

		
		public TestBase() {
		try{
			prop=new Properties();
			FileInputStream fis=new FileInputStream("D:\\Mypersonalworkspace\\FreeCRMTest\\src\\main\\java\\com\\crm"
					+ "\\qa\\config\\config");
			prop.load(fis);
		}catch(FileNotFoundException e)
		{
		e.getStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		}
		
	

		
	public static void initilization(){
		String browsername=prop.getProperty("browsername");
		if(browsername.equalsIgnoreCase("chrome"))
				{
			System.setProperty("webdriver.chrome.driver","D:/Drivers/chromedriver_win32 (1)/chromedriver.exe");
			driver=new ChromeDriver();
				}
		else if(browsername.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.firefox.driver","D:/Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	//}
}
}
	