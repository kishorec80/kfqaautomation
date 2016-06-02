package com.kf.apps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kf.common.*;
import com.kf.login.LoginPage;

public class AppsMainWindow {

	@BeforeClass
	public static void closevideo() throws InterruptedException {
		try {
			LoginPage.driver.findElement(By.xpath(Webelements.appsxpath))
					.click();
			Thread.sleep(5000);
			LoginPage.driver.findElement(
					By.xpath("//*[@id='introVideo']/div/div[1]/a")).click();
		} catch (Exception e) {
		}
	}

	// it is half done
	@Test
	public static void createapps() throws InterruptedException {
		try {
			LoginPage.driver.findElement(By.xpath(Webelements.appsxpath))
					.click();
			Thread.sleep(5000);
			LoginPage.driver.findElement(
					By.xpath("//*[@id='introVideo']/div/div[1]/a")).click();
			Thread.sleep(5000);
			LoginPage.driver.findElement(By.xpath(Webelements.createappspath))
					.click();
			Thread.sleep(5000);
			LoginPage.driver.switchTo().frame("wizard");
			Thread.sleep(5000);
			LoginPage.driver.findElement(By.xpath("//*[@id='sectionheading']"))
					.sendKeys("one");
			Thread.sleep(1000);
			LoginPage.driver.findElement(By.id("shortDesc")).sendKeys(
					"for testing the app");
			Thread.sleep(1000);
			LoginPage.driver.findElement(
					By.xpath("//*[@id='form']/div[3]/div[3]/a")).click();
			Thread.sleep(1000);
			WebElement webElement1 = LoginPage.driver.findElement(By
					.id("sectionheading"));
			// Loginpage.driver.findElement(By.id("sectionheading")).clear();
			// Loginpage.driver.findElement(By.id("sectionheading")).sendKeys("Emp Register");
			webElement1.findElement(By.id("sectionheading")).clear();
			Actions action = new Actions(LoginPage.driver);
			action.moveToElement(
					LoginPage.driver.findElement(By.id("sectionheading")))
					.doubleClick().perform();
			webElement1.findElement(By.id("sectionheading")).sendKeys(
					"Emp Register");

			action.moveToElement(
					LoginPage.driver.findElement(By
							.className("resizeMaterialInput"))).doubleClick()
					.perform();

		} catch (Exception e) {
			System.out.print("Exception caught: ");
			System.out.println(e.getMessage());
		}

	}

	// Working fine for install app need to handle the xpath
	@Test
	public static void installapps() throws InterruptedException {
		try {
			LoginPage.driver.findElement(By.xpath(Webelements.appsxpath))
					.click();
			Thread.sleep(5000);
			LoginPage.driver.findElement(
					By.xpath("//*[@id='introVideo']/div/div[1]/a")).click();
			Thread.sleep(3000);
			Actions builder = new Actions(LoginPage.driver);
			builder.moveToElement(
					LoginPage.driver.findElement(By
							.xpath("/html/body/div[3]/div[2]/div[1]/div/div/div[1]/div[1]/div/div[2]/div[2]/span")))
					.perform();
			Thread.sleep(5000);
			LoginPage.driver
					.findElement(
							By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/div[1]/div[1]/div/div[2]/div[3]/button"))
					.click();
			Thread.sleep(50000);
		} catch (Exception e) {
			System.out.print("Exception caught: ");
			System.out.println(e.getMessage());
		}

	}

	// Edit APP scripts works fine ,need to handle the ID dynamically for then
	// proceed
	@Test
	public static void editapp() {
		try {

			LoginPage.driver.findElement(By.xpath(Webelements.appsxpath))
					.click();

			Thread.sleep(2000);
			LoginPage.driver.findElement(
					By.xpath("//*[@id='app-search']/input")).sendKeys(
					"Purchase Order 20");
			Thread.sleep(3000);

			Actions builder = new Actions(LoginPage.driver);
			builder.moveToElement(
					LoginPage.driver.findElement(By
							.id("Foca94bd50_182e_11e6_a50a_22000ae43382")))
					.perform();
			Thread.sleep(5000);
			LoginPage.driver
					.findElement(
							By.xpath("//*[@id='Foca94bd50_182e_11e6_a50a_22000ae43382']/div[2]/div[2]/div/div[2]"))
					.click();
			Thread.sleep(5000);
			LoginPage.driver
					.findElement(
							By.xpath("//*[@id='Foca94bd50_182e_11e6_a50a_22000ae43382']/div[2]/div[2]/div/ul/li[3]/span[2]"))
					.click();
			Thread.sleep(3000);
			LoginPage.driver
					.findElement(
							By.xpath("//*[@id='liveApps']/div[1]/div/div[1]/div[2]/div[2]"))
					.click();
			Thread.sleep(1000);
			LoginPage.driver.findElement(
					By.xpath("//*[@id='app-search']/input")).clear();

			// Working code for search and edit and delete
			/*
			 * Actions builder = new Actions(Loginpage.driver);
			 * builder.moveToElement(Loginpage.driver.findElement(By.id(
			 * "Foc51cfc3e_1829_11e6_a50a_22000ae43382"))).perform();
			 * Thread.sleep(5000); Loginpage.driver.findElement(By.xpath(
			 * "//*[@id='Foc51cfc3e_1829_11e6_a50a_22000ae43382']/div[2]/div[2]/div/div[2]"
			 * )).click(); Thread.sleep(5000);
			 * Loginpage.driver.findElement(By.xpath(
			 * "//*[@id='Foc51cfc3e_1829_11e6_a50a_22000ae43382']/div[2]/div[2]/div/ul/li[3]/span[2]"
			 * )).click(); Thread.sleep(3000);
			 * Loginpage.driver.findElement(By.xpath
			 * ("//*[@id='liveApps']/div[1]/div/div[1]/div[2]/div[2]")).click();
			 */
		} catch (Exception e) {
			System.out.print("Exception caught: ");
			System.out.println(e.getMessage());
		}
	}

}
