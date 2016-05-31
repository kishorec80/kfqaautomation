package home;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utility.Utility;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

import common.Commonvariables;
import common.Webelements;
import login.Loginpage;
//import common.Execute;


public class Homemainwindow {
	
	
	
	//Full code works fine for the Testing APP
	//Initiate->Input request->clarification->Input Request->Approval->Reject->Drafts->InputRequest->Approval at the end Approved
	@Test(priority =0,alwaysRun=true)
	public static void initiateapp()throws Exception{
		try{
			
					
			Loginpage.driver.findElement(By.xpath(Webelements.homepath)).click();
			
		/*	WebElement googleSearchBtn = Loginpage.driver.findElement(By.xpath("//*[@id='nav-mobile']/li[1]/a/span"));
			System.out.println("Name of the button is:- " +googleSearchBtn.getAttribute("class"));
			System.out.println("Name of the button is:- " +googleSearchBtn.getAttribute("innerText"));
			
			WebElement googleSearchBtn2 = Loginpage.driver.findElement(By.xpath("//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[1]/li[2]/a/span[1]/span"));
			System.out.println("Name of the button is:- " +googleSearchBtn2.getAttribute("class"));
			System.out.println("Name of the button is:- " +googleSearchBtn2.getAttribute("innerText"));
			
			
			
			WebElement googleSearchBtn4 = Loginpage.driver.findElement(By.xpath("//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[2]/li[4]/a/span[1]/span"));
			System.out.println("Name of the button is:- " +googleSearchBtn4.getAttribute("class"));
			System.out.println("Name of the button is:- " +googleSearchBtn4.getAttribute("innerText"));
			*/
			
			
			
			
			Thread.sleep(1000);
			Loginpage.driver.findElement(By.xpath(Webelements.homemenuexpand)).click();
			
			//Code for checking the 'Testing' app from Home
			Thread.sleep(1000);
			Loginpage.driver.findElement(By.xpath(Webelements.homeiniateicon)).click();
			Thread.sleep(1000);
			Loginpage.driver.findElement(By.xpath(Webelements.homesearchicon)).click();
			Thread.sleep(1000);
			Loginpage.driver.findElement(By.xpath(Webelements.homesearchinput)).sendKeys("Testing");
			Thread.sleep(1000);
			Loginpage.driver.findElement(By.xpath(Webelements.homeinitate)).click();
			Thread.sleep(4000);
			
			//check for the draft count 
			WebElement draftcount = Loginpage.driver.findElement(By.xpath(Webelements.draftcountpath));
			System.out.println("count of the Draft: " +draftcount.getAttribute("innerText"));
			
			String actual=draftcount.getAttribute("innerText");
			System.out.println("Now the count of the Draft is: "+actual);
			Assert.assertEquals(actual,"1","Required the actualto be 1");
			
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	
	@Test(priority =1,alwaysRun=true)
	public static void inputrequest()throws Exception{
		try{
			
			
			Loginpage.driver.findElement(By.xpath(Webelements.testingname)).sendKeys("kishore");
			Thread.sleep(1000);
			Loginpage.driver.findElement(By.xpath(Webelements.testingdepartment)).sendKeys("SoftwareTesting");
			Thread.sleep(2000);
			Loginpage.driver.findElement(By.xpath(Webelements.testingsubmit)).click();
			Thread.sleep(4000);
			Loginpage.driver.findElement(By.xpath(Webelements.testinginputrequest)).click();
			Thread.sleep(4000);
			
			WebElement inputrequest = Loginpage.driver.findElement(By.xpath(Webelements.inputrequestcountpath));
			String actualinputrequest=inputrequest.getAttribute("innerText");
			System.out.println("Now the actual inputrequest count is :"+actualinputrequest);
			Assert.assertEquals(actualinputrequest,"1","Required the actualto be 1");
			
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	@Test(priority =2,alwaysRun=true)
	public static void clarificationcount()throws Exception{
		try{
			
			Loginpage.driver.findElement(By.xpath(Webelements.testingform)).click();
			Thread.sleep(4000);
			Loginpage.driver.findElement(By.id(Webelements.testingcomment)).sendKeys("Need clarification");
			Thread.sleep(4000);
			Loginpage.driver.findElement(By.xpath(Webelements.testinggetclarity)).click();
			Thread.sleep(4000);
			Loginpage.driver.findElement(By.xpath(Webelements.testinggetclarifications)).click();
			Thread.sleep(4000);
			
			WebElement clarificationcount = Loginpage.driver.findElement(By.xpath(Webelements.clarificationcountpath));
			String actualclarificationcount=clarificationcount.getAttribute("innerText");
			System.out.println("Now the actual clarificationcount is :"+actualclarificationcount);
			Assert.assertEquals(actualclarificationcount,"1","Required the actualto be 1");
			
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	@Test(priority =3,alwaysRun=true)
	public static void afterclarifications()throws Exception{
		try{	
			Loginpage.driver.findElement(By.xpath(Webelements.testingform)).click();
			Thread.sleep(4000);
			Loginpage.driver.findElement(By.id(Webelements.testingcomment)).sendKeys("Clarified");
			Thread.sleep(4000);
			Loginpage.driver.findElement(By.xpath(Webelements.testingrespond)).click();
			Thread.sleep(4000);
			Loginpage.driver.findElement(By.xpath(Webelements.testinginputrequest)).click();
			Thread.sleep(4000);
			
			WebElement afterclarifications = Loginpage.driver.findElement(By.xpath(Webelements.afterclarificationspath));
			String afterclarificationscount=afterclarifications.getAttribute("innerText");
			System.out.println("Now the actual afterclarifications count is :"+afterclarificationscount);
			Assert.assertEquals(afterclarificationscount,"1","Required the actualto be 1");
			
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	@Test(priority =4,alwaysRun=true)
	public static void approvals()throws Exception{
		try{
			
			
			Loginpage.driver.findElement(By.xpath(Webelements.testingform)).click();
			Thread.sleep(4000);
			Loginpage.driver.findElement(By.xpath(Webelements.testingdone)).click();
			Thread.sleep(6000);
			Loginpage.driver.findElement(By.xpath(Webelements.homeapprovals)).click();
			Thread.sleep(4000);
			
			WebElement approvals = Loginpage.driver.findElement(By.xpath(Webelements.approvalspath));
			String approvalscount=approvals.getAttribute("innerText");
			System.out.println("Now the actual Approvals count is :"+approvalscount);
			Assert.assertEquals(approvalscount,"1","Required the actualto be 1");
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	@Test(priority =5,alwaysRun=true)
	public static void rejected()throws Exception{
		try{
			
			Loginpage.driver.findElement(By.xpath(Webelements.testingform)).click();
			Thread.sleep(4000);
			Loginpage.driver.findElement(By.id(Webelements.testingcomment)).sendKeys("Rejecting");
			Thread.sleep(4000);
			Loginpage.driver.findElement(By.xpath(Webelements.formreject)).click();
			Thread.sleep(4000);
			Loginpage.driver.findElement(By.xpath(Webelements.homereject)).click();
			Thread.sleep(4000);
			
			WebElement rejected = Loginpage.driver.findElement(By.xpath(Webelements.rejectedpath));
			String rejectedcount=rejected.getAttribute("innerText");
			System.out.println("Now the actual rejectedcount count is :"+rejectedcount);
			Assert.assertEquals(rejectedcount,"1","Required the actualto be 1");
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	
	@Test(priority =6,alwaysRun=true)
	public static void Afterrejectdraftcount()throws Exception{
		try{
			
			Loginpage.driver.findElement(By.xpath(Webelements.testingform)).click();
			Thread.sleep(4000);
			Loginpage.driver.findElement(By.xpath(Webelements.formrestart)).click();
			Thread.sleep(4000);
			WebElement Afterrejectdraftcount = Loginpage.driver.findElement(By.xpath(Webelements.Afterrejectdraftcountpath));
			String Afterrejecteddraftcount=Afterrejectdraftcount.getAttribute("innerText");
			System.out.println("Now the actual Afterrejecteddraftcount  is :"+Afterrejecteddraftcount);
			Assert.assertEquals(Afterrejecteddraftcount,"1","Required the actualto be 1");
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	
	@Test(priority =7,alwaysRun=true)
	public static void secondruntoinputcount()throws Exception{
		try{
			
			
			Loginpage.driver.findElement(By.xpath(Webelements.testingform)).click();
			Thread.sleep(4000);
			Loginpage.driver.findElement(By.xpath(Webelements.formsubmit)).click();
			Thread.sleep(4000);
			Loginpage.driver.findElement(By.xpath(Webelements.homeinputrequest)).click();
			Thread.sleep(4000);
			WebElement secondruntoinputcount = Loginpage.driver.findElement(By.xpath(Webelements.secondruntoinputcountpath));
			String secondruntoinputrequestcount=secondruntoinputcount.getAttribute("innerText");
			System.out.println("Now the actual secondruntoinputrequestcount  is :"+secondruntoinputrequestcount);
			Assert.assertEquals(secondruntoinputrequestcount,"1","Required the actualto be 1");
			
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	
	@Test(priority =8,alwaysRun=true)
	public static void secondruntoapprovals()throws Exception{
		try{
			Loginpage.driver.findElement(By.xpath(Webelements.testingform)).click();
			Thread.sleep(4000);
			Loginpage.driver.findElement(By.xpath(Webelements.testingdone)).click();
			Thread.sleep(6000);
			Loginpage.driver.findElement(By.xpath(Webelements.homeapprovals)).click();
			Thread.sleep(4000);
			WebElement secondruntoapprovals = Loginpage.driver.findElement(By.xpath(Webelements.secondruntoapprovalspath));
			String secondruntoapprovalscount=secondruntoapprovals.getAttribute("innerText");
			System.out.println("Now the actual secondruntoapprovals  is :"+secondruntoapprovalscount);
			Assert.assertEquals(secondruntoapprovalscount,"1","Required the actualto be 1");
			
			
			
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	

	@Test(priority =9,alwaysRun=true)
	public static void approved()throws Exception{
		try{
			
			WebElement approved = Loginpage.driver.findElement(By.xpath(Webelements.approvedpath));
			String approvedcount=approved.getAttribute("innerText");
			int i=Integer.parseInt(approvedcount); 
			int finalapprovedcount=i+1;
			System.out.println("Before the final Approval the count of the Approved:"+approvedcount);
			
			
			Loginpage.driver.findElement(By.xpath(Webelements.testingform)).click();
			Thread.sleep(4000);
			Loginpage.driver.findElement(By.xpath(Webelements.formapprove)).click();
			Thread.sleep(6000);
			WebElement countapproved = Loginpage.driver.findElement(By.xpath(Webelements.countapprovedpath));
			String countofapproved=countapproved.getAttribute("innerText");
			int totalapprovedcount=Integer.parseInt(countofapproved);
							
			System.out.println("Now the finalcount of the Approved  is :"+finalapprovedcount);
			Assert.assertEquals(totalapprovedcount,finalapprovedcount);
			
			
			
			
			
																					
			
			
		}
		catch (Exception e){
			System.out.println( "Exception :: " +e);
		}
	}
	
	
	
	
	
	
	
	

}
