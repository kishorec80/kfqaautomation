package com.kf.login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.kf.common.CommonVariables;
import com.kf.common.Webelements;

/**
 * @author kishore
 *Test case talks about the setting up the enviorment which browser you want to run 
 *[Chrome,IE,FF and Headless browser Phatom JS]
 */

public class LoginPage {

	public static WebDriver driver;

	@Test
	public static void Openbrowser() throws Exception {
		try {

			Capabilities caps = new DesiredCapabilities();
			((DesiredCapabilities) caps).setJavascriptEnabled(true);
			((DesiredCapabilities) caps).setCapability("takesScreenshot", true);
			((DesiredCapabilities) caps).setCapability(
					PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
					//"C:/Program Files/phantomjs-2.1.1-windows/bin/phantomjs.exe"
			
			 "/home/ubuntu/phantomjs-2.1.1-linux-x86_64/bin/phantomjs"
				);
			driver = new PhantomJSDriver(caps);

			 System.setProperty("webdriver.chrome.driver",CommonVariables.chromedriverpath + "chromedriver.exe");
			 //System.setProperty("webdriver.ie.driver", Commonvariables.iedriverpath+"IEDriverServer.exe");

			 //driver = new ChromeDriver();
			// driver = new InternetExplorerDriver();
			// driver=new FirefoxDriver();
			driver.get(CommonVariables.url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println("Exception :: " + e);
		}

	}

	/**
	 * @author kishore,Test case talks about the Login into the KISS flow page .Used the beta Enviorment with 
	 * Respect to that provided the user name and password for Testing
	 *
	 */
	@Test
	public static void login() throws Exception {
		try {

			driver.findElement(By.id(Webelements.kfloginpage_usernameid))
					.sendKeys(CommonVariables.username);
			Thread.sleep(300);
			driver.findElement(By.id(Webelements.kfloginpage_passwordid))
					.sendKeys(CommonVariables.password);
			Thread.sleep(300);
			driver.findElement(By.id(Webelements.kfloginpage_loginxpath))
					.submit();
			Thread.sleep(3000);
			driver.findElement(By.xpath(Webelements.avatar)).click();
			Thread.sleep(300);
			String loggedinuser = driver.findElement(
					By.xpath("/html/body/ng-include[1]/div/div[1]/div/p"))
					.getText();
			System.out.println(loggedinuser);
			Assert.assertEquals(CommonVariables.username, loggedinuser);
			driver.findElement(By.xpath(Webelements.avatar)).click();

			File scrFile10 = ((TakesScreenshot) LoginPage.driver)
					.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile10, new File("./afterloginpage.jpeg"),
					true);
		} catch (Exception e) {
		}
	}

	public static void clickapps() throws Exception {
		try {

			driver.findElement(By.xpath(Webelements.appsxpath));

		} catch (Exception e) {
		}
	}

	public static void clickreports() throws Exception {
		try {

			// driver.findElement(By.xpath(Webelements.reports.reportsxpath)).click();

		} catch (Exception e) {
		}
	}

}
