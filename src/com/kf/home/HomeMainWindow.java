package com.kf.home;




import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;





import com.kf.common.Webelements;
import com.kf.login.LoginPage;
import com.kf.utility.Utility;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

//import common.Commonvariables;


/**
 * @author kishore
 * Entire class executes the full flow of the Process initiated and End
 * Flow of the Execution Initiate->Input request->clarification->Input Request->Approval->Reject->Drafts->InputRequest->
 * Approval at the end Approved,Used the Testing APP to execute the scripts
 */

public class HomeMainWindow {
	/**
	 * @author kishore
	 *Test case talks about the Initiate the process the get the count of the draft and validate it 
	 */
	@Test(priority =0,alwaysRun=true)
	public static void initiateapp()throws Exception{
		try{
			
					
			LoginPage.driver.findElement(By.xpath(Webelements.homepath)).click();
			Thread.sleep(1000);
			LoginPage.driver.findElement(By.xpath(Webelements.homemenuexpand)).click();
			
			//Code for checking the 'Testing' app from Home
			Thread.sleep(1000);
			LoginPage.driver.findElement(By.xpath(Webelements.homeiniateicon)).click();
			Thread.sleep(1000);
			LoginPage.driver.findElement(By.xpath(Webelements.homesearchicon)).click();
			Thread.sleep(1000);
			LoginPage.driver.findElement(By.xpath(Webelements.homesearchinput)).sendKeys("Testing");
			Thread.sleep(1000);
			LoginPage.driver.findElement(By.xpath(Webelements.homeinitate)).click();
			Thread.sleep(4000);
			
			//check for the draft count 
			WebElement draftcount = LoginPage.driver.findElement(By.xpath(Webelements.draftcountpath));
			System.out.println("count of the Draft: " +draftcount.getAttribute("innerText"));
			
			String actual=draftcount.getAttribute("innerText");
			System.out.println("Now the count of the Draft is: "+actual);
			Assert.assertEquals(actual,"1","Required the actualto be 1");
			
			
			/*File scrFile9=((TakesScreenshot)Loginpage.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile9, new File("./draftcount.jpeg"),true);
			*/
			
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	
	/**
	 * @author kishore
	 *Test case talks about giving the parameter to the Form and submit, it goes to the Input Request and check the count to 
	 *validate it
	 */
	@Test(priority =1,alwaysRun=true)
	public static void inputrequest()throws Exception{
		try{
			
			
			LoginPage.driver.findElement(By.xpath(Webelements.testingname)).sendKeys("kishore");
			Thread.sleep(1000);
			LoginPage.driver.findElement(By.xpath(Webelements.testingdepartment)).sendKeys("SoftwareTesting");
			Thread.sleep(2000);
			LoginPage.driver.findElement(By.xpath(Webelements.testingsubmit)).click();
			Thread.sleep(4000);
			LoginPage.driver.findElement(By.xpath(Webelements.testinginputrequest)).click();
			Thread.sleep(4000);
			
			WebElement inputrequest = LoginPage.driver.findElement(By.xpath(Webelements.inputrequestcountpath));
			String actualinputrequest=inputrequest.getAttribute("innerText");
			System.out.println("Now the actual inputrequest count is :"+actualinputrequest);
			Assert.assertEquals(actualinputrequest,"1","Required the actualto be 1");
			
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	
	
	/**
	 * @author kishore
	 *Test case talks  about the process from INPUT REQUEST to CLARIFICATIONS ,From the Input Request the form
	 *will send to Clarification
	 */
	@Test(priority =2,alwaysRun=true)
	public static void clarificationcount()throws Exception{
		try{
			
			LoginPage.driver.findElement(By.xpath(Webelements.testingform)).click();
			Thread.sleep(4000);
			LoginPage.driver.findElement(By.id(Webelements.testingcomment)).sendKeys("Need clarification");
			Thread.sleep(4000);
			LoginPage.driver.findElement(By.xpath(Webelements.testinggetclarity)).click();
			Thread.sleep(4000);
			LoginPage.driver.findElement(By.xpath(Webelements.testinggetclarifications)).click();
			Thread.sleep(4000);
			
			WebElement clarificationcount = LoginPage.driver.findElement(By.xpath(Webelements.clarificationcountpath));
			String actualclarificationcount=clarificationcount.getAttribute("innerText");
			System.out.println("Now the actual clarificationcount is :"+actualclarificationcount);
			Assert.assertEquals(actualclarificationcount,"1","Required the actualto be 1");
			
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	
	/**
	 * @author kishore
	 *Test case talks  about the process from CLARIFICATIONS to INPUT REQUEST ,Once it is clarified
	 *it will move to approval
	 */
	@Test(priority =3,alwaysRun=true)
	public static void afterclarifications()throws Exception{
		try{	
			LoginPage.driver.findElement(By.xpath(Webelements.testingform)).click();
			Thread.sleep(4000);
			LoginPage.driver.findElement(By.id(Webelements.testingcomment)).sendKeys("Clarified");
			Thread.sleep(4000);
			LoginPage.driver.findElement(By.xpath(Webelements.testingrespond)).click();
			Thread.sleep(4000);
			LoginPage.driver.findElement(By.xpath(Webelements.testinginputrequest)).click();
			Thread.sleep(4000);
			
			WebElement afterclarifications = LoginPage.driver.findElement(By.xpath(Webelements.afterclarificationspath));
			String afterclarificationscount=afterclarifications.getAttribute("innerText");
			System.out.println("Now the actual afterclarifications count is :"+afterclarificationscount);
			Assert.assertEquals(afterclarificationscount,"1","Required the actualto be 1");
			
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	
	/**
	 * @author kishore
	 *Test case talks  about the process from INPUT REQUEST TO APPROVALS ,From the Input Request the form
	 *will send to APPROVALS
	 */
	@Test(priority =4,alwaysRun=true)
	public static void approvals()throws Exception{
		try{
			
			
			LoginPage.driver.findElement(By.xpath(Webelements.testingform)).click();
			Thread.sleep(4000);
			LoginPage.driver.findElement(By.xpath(Webelements.testingdone)).click();
			Thread.sleep(6000);
			LoginPage.driver.findElement(By.xpath(Webelements.homeapprovals)).click();
			Thread.sleep(4000);
			
			WebElement approvals = LoginPage.driver.findElement(By.xpath(Webelements.approvalspath));
			String approvalscount=approvals.getAttribute("innerText");
			System.out.println("Now the actual Approvals count is :"+approvalscount);
			Assert.assertEquals(approvalscount,"1","Required the actualto be 1");
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	
	/**
	 * @author kishore
	 *Test case talks  about the process from APPROVALS TO REJECTED ,here the form will be rejected from the approvals
	 *to rejected
	 */
	@Test(priority =5,alwaysRun=true)
	public static void rejected()throws Exception{
		try{
			
			LoginPage.driver.findElement(By.xpath(Webelements.testingform)).click();
			Thread.sleep(4000);
			LoginPage.driver.findElement(By.id(Webelements.testingcomment)).sendKeys("Rejecting");
			Thread.sleep(4000);
			LoginPage.driver.findElement(By.xpath(Webelements.formreject)).click();
			Thread.sleep(4000);
			LoginPage.driver.findElement(By.xpath(Webelements.homereject)).click();
			Thread.sleep(4000);
			
			WebElement rejected = LoginPage.driver.findElement(By.xpath(Webelements.rejectedpath));
			String rejectedcount=rejected.getAttribute("innerText");
			System.out.println("Now the actual rejectedcount count is :"+rejectedcount);
			Assert.assertEquals(rejectedcount,"1","Required the actualto be 1");
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	
	
	/**
	 * @author kishore
	 *Test case talks  about the process from  REJECTED to APPROVALS ,here the form will be restarted from the REJECTED
	 */
	@Test(priority =6,alwaysRun=true)
	public static void Afterrejectdraftcount()throws Exception{
		try{
			
			LoginPage.driver.findElement(By.xpath(Webelements.testingform)).click();
			Thread.sleep(4000);
			LoginPage.driver.findElement(By.xpath(Webelements.formrestart)).click();
			Thread.sleep(4000);
			WebElement Afterrejectdraftcount = LoginPage.driver.findElement(By.xpath(Webelements.Afterrejectdraftcountpath));
			String Afterrejecteddraftcount=Afterrejectdraftcount.getAttribute("innerText");
			System.out.println("Now the actual Afterrejecteddraftcount  is :"+Afterrejecteddraftcount);
			Assert.assertEquals(Afterrejecteddraftcount,"1","Required the actualto be 1");
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	
	
	/**
	 * @author kishore
	 *Test case talks  about the process from  second time INPUTREQUEST to APPROVALS.
	 */
	@Test(priority =7,alwaysRun=true)
	public static void secondruntoinputcount()throws Exception{
		try{
			
			
			LoginPage.driver.findElement(By.xpath(Webelements.testingform)).click();
			Thread.sleep(4000);
			LoginPage.driver.findElement(By.xpath(Webelements.formsubmit)).click();
			Thread.sleep(4000);
			LoginPage.driver.findElement(By.xpath(Webelements.homeinputrequest)).click();
			Thread.sleep(4000);
			WebElement secondruntoinputcount = LoginPage.driver.findElement(By.xpath(Webelements.secondruntoinputcountpath));
			String secondruntoinputrequestcount=secondruntoinputcount.getAttribute("innerText");
			System.out.println("Now the actual secondruntoinputrequestcount  is :"+secondruntoinputrequestcount);
			Assert.assertEquals(secondruntoinputrequestcount,"1","Required the actualto be 1");
			
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	/**
	 * @author kishore
	 *Test case talks  about the process from  second time INPUTREQUEST to APPROVALS.
	 */
	
	@Test(priority =8,alwaysRun=true)
	public static void secondruntoapprovals()throws Exception{
		try{
			LoginPage.driver.findElement(By.xpath(Webelements.testingform)).click();
			Thread.sleep(4000);
			LoginPage.driver.findElement(By.xpath(Webelements.testingdone)).click();
			Thread.sleep(6000);
			LoginPage.driver.findElement(By.xpath(Webelements.homeapprovals)).click();
			Thread.sleep(4000);
			WebElement secondruntoapprovals = LoginPage.driver.findElement(By.xpath(Webelements.secondruntoapprovalspath));
			String secondruntoapprovalscount=secondruntoapprovals.getAttribute("innerText");
			System.out.println("Now the actual secondruntoapprovals  is :"+secondruntoapprovalscount);
			Assert.assertEquals(secondruntoapprovalscount,"1","Required the actualto be 1");
			
			
			
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	/**
	 * @author kishore
	 *Test case talks  about the process FROM  APPROVALS to APPROVED
	 *final count is measured for the validation
	 */

	@Test(priority =9,alwaysRun=true)
	public static void approved()throws Exception{
		try{
			
			WebElement approved = LoginPage.driver.findElement(By.xpath(Webelements.approvedpath));
			String approvedcount=approved.getAttribute("innerText");
			int i=Integer.parseInt(approvedcount); 
			int finalapprovedcount=i+1;
			System.out.println("Before the final Approval the count of the Approved:"+approvedcount);
			
			
			LoginPage.driver.findElement(By.xpath(Webelements.testingform)).click();
			Thread.sleep(4000);
			LoginPage.driver.findElement(By.xpath(Webelements.formapprove)).click();
			Thread.sleep(6000);
			WebElement countapproved = LoginPage.driver.findElement(By.xpath(Webelements.countapprovedpath));
			String countofapproved=countapproved.getAttribute("innerText");
			int totalapprovedcount=Integer.parseInt(countofapproved);
							
			System.out.println("Now the finalcount of the Approved  is :"+finalapprovedcount);
			Assert.assertEquals(totalapprovedcount,finalapprovedcount);
			
			
			
			
			
																					
			
			
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	
	@AfterMethod
	public void getstatus(ITestResult result)throws Exception{
	try{
		if(result.getStatus() == ITestResult.SUCCESS)
		{
			//System.out.println("Test case Passed " + result.getStatus()  +result.getMethod().getMethodName());
			System.out.println("Test case Passed "   + ":"+result.getMethod().getMethodName());
		}
		
		if(result.getStatus() == ITestResult.FAILURE)
		{
			//System.out.println("Test case Failed " + result.getStatus()  +result.getMethod().getMethodName());
			System.out.println("Test case Failed "   +":"+result.getMethod().getMethodName());
			Utility.captureScreenshot(LoginPage.driver, result.getMethod().getMethodName());
			
			
			
		}
		
	}
	catch (Exception e){}
	}
	
	
	
	
	
	
	

}
