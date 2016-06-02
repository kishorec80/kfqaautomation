package common;

import login.Loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utility.Utility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Execute extends Loginpage {
	
	static ExtentReports report;
	static ExtentTest logger;
	
	
	@Test(priority = 0)
	public static void login1() throws Exception {
		try {
			report =new ExtentReports(Commonvariables.automationreportpath);
			logger = report.startTest("Launch KF login page");
			Loginpage.Openbrowser();
			logger.log(LogStatus.INFO,"Browser Started");
			String actual =driver.getTitle();
			System.out.println(actual);
			Assert.assertEquals(actual, "Welcome to KiSSFLOW");
			logger.log(LogStatus.PASS, "Successfully lunched the browser");
		} catch (Exception e) {
			//logger.log(LogStatus.PASS, "Exception :: " +e);
			//System.out.println( "Exception :: " +e);
		}
	}
	@Test(priority =1)
	public static void login2()throws Exception
	{
		try{
			logger = report.startTest("Check for KF Login page");
		Loginpage.login();
		logger.log(LogStatus.INFO,"user logged in");
		String actual =driver.getTitle();
		Assert.assertEquals(actual, "google");
		logger.log(LogStatus.PASS, "Able to login");
		
		
	
		}catch (Exception e){}
	}
	/*//Script works fine
	@Test(priority=2)
	public static void checkforapp()throws Exception
	{
		try{
			logger = report.startTest("Check for KF Apps");
		Loginpage.clickapps();
		logger.log(LogStatus.INFO,"User able to click");
		String actual =driver.getTitle();
		Assert.assertEquals(actual, "apps");
		logger.log(LogStatus.PASS, "Able to click the Apps");
		
		
	
		}catch (Exception e){}
	}*/
	
/*	@Test(priority=3)
	public static void checkforreports()throws Exception
	{
		try{
			logger = report.startTest("Check for KF reports");
		Loginpage.clickreports();
		logger.log(LogStatus.INFO,"User able to click the reports");
		String actual =driver.getTitle();
		Assert.assertEquals(actual, "KiSSFLOW");
		logger.log(LogStatus.PASS, "Able to click the reports");
		
		
	
		}catch (Exception e){}
	}
	
	@Test(priority=3)
	public static void createapp()throws Exception
	{
		try{
			logger = report.startTest("Check for create App ");
		apps.Appsmainwindow.createapps();
		logger.log(LogStatus.INFO,"User able to Open the App");
		String actual =driver.getTitle();
		Assert.assertEquals(actual, "apps");
		logger.log(LogStatus.PASS, "Able to click the reports");
		
		
	
		}catch (Exception e){
			
		}
	}
	
	//Script Works fine
	@Test(priority=2)
	public static void installapp()throws Exception
	{
		try{
			logger = report.startTest("Check for install App ");
		apps.Appsmainwindow.installapps();
		
	
		}catch (Exception e){
			
		}
	}
	//Script Works fine
	@Test(priority=3)
	public static void editapps()throws Exception
	{
		try{
			logger = report.startTest("Check for edit App ");
		apps.Appsmainwindow.editapp();
		
	
		}catch (Exception e){
			
		}
	}
	*/
	@Test(priority=4)
	public static void home()throws Exception
	{
		try{
			logger = report.startTest("Check for home initiate the App ");
		home.Homemainwindow.initiateapp();
		
	
		}catch (Exception e){
			
		}
	}
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void getstatus(ITestResult result)throws Exception{
	try{
		
		if(result.getStatus() == ITestResult.FAILURE)
		{
			
			/*Utility.captureScreenshot(driver, result.getMethod().getMethodName());
			String image=logger.addScreenCapture("./Screenshots/"+ result.getMethod().getMethodName());
			logger.log(LogStatus.FAIL,image,result.getStatus()+result.getMethod().getMethodName());*/
		
			String screenshot_path=Utility.captureScreenshot(driver, result.getMethod().getMethodName());
			String image= logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.FAIL,+result.getStatus()+result.getMethod().getMethodName()+image);
			logger.log(LogStatus.FAIL, "" + result.getThrowable().getMessage() + "");
					
								
		}
		report.endTest(logger);
		report.flush();
		
	}
	catch (Exception e){}
	}
	
	
	
	
	
	
	

}
