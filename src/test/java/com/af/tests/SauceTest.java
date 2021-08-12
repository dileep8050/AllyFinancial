package com.af.tests;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.af.constants.FrameworkConstants;
import com.af.pages.SauceHomePage;
import com.af.pages.SauceLoginPage;
import com.af.reports.ExtentLogger;
import com.af.utils.ExcelUtils;

public final class SauceTest extends BaseTest{
	private SauceTest() {}
	
	@Test(groups= {"reg","sanity"},description = "Verify login functionality with valid credentials and validating cart icon in home page")
	public void loginLogoutSaucePortal() throws InterruptedException {
		ExtentLogger.info("Logs printing started");
		SauceLoginPage slp=new SauceLoginPage();
		slp.enterUsername("standard_user").enterPassword("secret_sauce").clickLogin();
		SauceHomePage shp=new SauceHomePage();
		shp.getcart().isDisplayed();	
		System.out.println(shp.getTitle());
		ExtentLogger.info("MyTest case is ended");
	}
	@Test(groups= {"abc"},description = "second Test case trying to see how it look in the logs")
	public void loginLogoutSaucePortal1() throws InterruptedException {
		ExtentLogger.info("Logs printing started1");
		SauceLoginPage slp=new SauceLoginPage();
		slp.enterUsername("standard_user").enterPassword("secret_sauce").clickLogin();
		SauceHomePage shp=new SauceHomePage();
		shp.getcart().isDisplayed();	
		System.out.println(shp.getTitle());
		ExtentLogger.info("MyTest case is ended1");
	}
	@Test(groups= {"abc"})
	public void loginLogoutSaucePortal2() throws InterruptedException {
		ExtentLogger.info("Logs printing started2");
		SauceLoginPage slp=new SauceLoginPage();
		slp.enterUsername("standard_user").enterPassword("secret_sauce").clickLogin();
		SauceHomePage shp=new SauceHomePage();
		shp.getcart().isDisplayed();	
		System.out.println(shp.getTitle());
		ExtentLogger.info("MyTest case is ended2");
	}
	@Test(groups= {"def"})
	public void loginLogoutSaucePortal3() throws InterruptedException {
		ExtentLogger.info("Logs printing started3");
		SauceLoginPage slp=new SauceLoginPage();
		slp.enterUsername("standard_user").enterPassword("secret_sauce").clickLogin();
		SauceHomePage shp=new SauceHomePage();
		shp.getcart().isDisplayed();	
		System.out.println(shp.getTitle());
		ExtentLogger.info("MyTest case is ended3");
	}
	@Test(groups= {"abc"})
	public void loginLogoutSaucePortal4() throws InterruptedException {
		ExtentLogger.info("Logs printing started4");
		SauceLoginPage slp=new SauceLoginPage();
		slp.enterUsername("standard_user").enterPassword("secret_sauce").clickLogin();
		SauceHomePage shp=new SauceHomePage();
		shp.getcart().isDisplayed();	
		System.out.println(shp.getTitle());
		ExtentLogger.info("MyTest case is ended4");
	}
	@Test(groups= {"xyz"})
	public void loginLogoutSaucePortal5() throws InterruptedException {
		ExtentLogger.info("Logs printing started5");
		SauceLoginPage slp=new SauceLoginPage();
		slp.enterUsername("standard_user").enterPassword("secret_sauce").clickLogin();
		SauceHomePage shp=new SauceHomePage();
		shp.getcart().isDisplayed();	
		System.out.println(shp.getTitle());
		ExtentLogger.info("MyTest case is ended5");
	}
	@Test(groups= {"xyz"})
	public void loginLogoutSaucePortal6() throws InterruptedException {
		ExtentLogger.info("Logs printing started6");
		SauceLoginPage slp=new SauceLoginPage();
		slp.enterUsername("standard_user11").enterPassword("secret_sauce33").clickLogin();
		SauceHomePage shp=new SauceHomePage();
		shp.getcart().isDisplayed();	
		System.out.println(shp.getTitle());
		ExtentLogger.info("MyTest case is ended6");
	}
	@Test(groups= {"xyz"})
	public void loginLogoutSaucePortal7() throws InterruptedException {
		ExtentLogger.info("Logs printing started7");
		SauceLoginPage slp=new SauceLoginPage();
		slp.enterUsername("standard_user").enterPassword("secret_sauce").clickLogin();
		SauceHomePage shp=new SauceHomePage();
		shp.getcart().isDisplayed();	
		System.out.println(shp.getTitle());
		ExtentLogger.info("MyTest case is ended7");
	}
	@Test(groups= {"xyz"})
	public void loginLogoutSaucePortal8() throws InterruptedException {
		ExtentLogger.info("Logs printing started8");
		SauceLoginPage slp=new SauceLoginPage();
		slp.enterUsername("standard_user44").enterPassword("secret_sauce66").clickLogin();
		SauceHomePage shp=new SauceHomePage();
		shp.getcart().isDisplayed();	
		System.out.println(shp.getTitle());
		ExtentLogger.info("MyTest case is ended8");
	}
	
	@Test
	public void getDataFromExcel() {
		ExtentLogger.info("Test case for excel data");
		List<Map<String, String>> list=ExcelUtils.getTestDetails(FrameworkConstants.getTestDataSheet());
		int i=1;
		for(Map<String, String> a:list) {
			System.out.println("#### Test data set "+i+" ####");
			System.out.println("key  |   value");
			for(Map.Entry set: a.entrySet()) {
				System.out.println(set.getKey()+" = "+set.getValue());
			}
			i++;
			System.out.println();
		}
	}
}
