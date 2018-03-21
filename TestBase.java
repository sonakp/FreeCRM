package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
//	final static Properties prop;

	public static void main(String[] args) {

		/*
		public TestBase(){
		try{
			prop=new Properties();
			FileInputStream fis=new FileInputStream("D:\\Mypersonalworkspace\\FreeCRMTest\\src\\main\\java\\com\\crm"
					+ "\\qa\\config\\config");
			prop.load(fis);
		}catch(FileNotFoundException e)
		{
		e.getStackTrace();
		}
		
		}
		
	}
	*/
		
//	public static initilization(){
		//String browsername=prop.getProperty("browsername");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
	//}
}
}
	