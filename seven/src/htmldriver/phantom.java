package htmldriver; 

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;   
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;






 
public class phantom {   
	public static WebDriver driver;
	@Test
        public static void browser() {
	
        	
        	try{
                  
                    
                    Capabilities caps = new DesiredCapabilities();
                    ((DesiredCapabilities) caps).setJavascriptEnabled(true);                
                    ((DesiredCapabilities) caps).setCapability("takesScreenshot", true);  
                    ((DesiredCapabilities) caps).setCapability(
                            PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                           "C:/Program Files/phantomjs-2.1.1-windows/bin/phantomjs.exe"
                           // "/home/ubuntu/phantomjs-2.1.1-linux-x86_64/bin/phantomjs"
                        );
        driver = new  PhantomJSDriver(caps);
        
        		
                    //WebDriver driver = new HtmlUnitDriver(true);
                    
                    
                 
                    
                    
                    driver.get("https://beta.kissflow.com");
                    driver.manage().window().maximize();
                    System.out.println("Page title is: "+ driver.getTitle());
                    
                    
                    File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                    FileUtils.copyFile(scrFile2, new File("c:\\kissflow.jpeg"),true);                      
                  //FileUtils.copyFile(scrFile2, new File("/home/ubuntu/kissflow.jpeg"),true);     
                    driver.findElement(By.id("emailId")).sendKeys("kishorec261980@gmail.com");
                    File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                    FileUtils.copyFile(scrFile5, new File("c:\\crossedidkissflow.jpeg"),true);
                    //FileUtils.copyFile(scrFile2, new File("/home/ubuntu/crossedidkissflow.jpeg"),true);
                    
                    driver.findElement(By.id("passwd")).sendKeys("Passw0rd@2010");
                    File scrFile6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                    FileUtils.copyFile(scrFile6, new File("c:\\crossedpasswordkissflow.jpeg"),true);
                    //FileUtils.copyFile(scrFile2, new File("/home/ubuntu/crossedpasswordkissflow.jpeg"),true);
                   
                    
                    driver.findElement(By.id("submitButton")).click();
                    
                    
                    File scrFile8 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                    FileUtils.copyFile(scrFile8, new File("c:\\submitkissflow.jpeg"),true);
                    //FileUtils.copyFile(scrFile2, new File("/home/ubuntu/submitkissflow.jpeg"),true);
                    System.out.println("Page title is: "+ driver.getTitle());
                    
                    
                 //now code for counting 
                    driver.findElement(By.xpath("//*[@id='nav-mobile']/li[1]/a/span")).click();
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("//*[@id='inbox-container']/ng-include[1]/div/div/section[1]/div[1]/i")).click();
                    Thread.sleep(1000);
                    
                    File scrFile9 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                    FileUtils.copyFile(scrFile9, new File("c:\\homeexpand.jpeg"),true);
                    //FileUtils.copyFile(scrFile2, new File("/home/ubuntu/homeexpand.jpeg"),true);
                    driver.findElement(By.xpath("//*[@id='inbox-container']/div[3]/div/div[3]/a/i")).click();
        			Thread.sleep(1000);
        			driver.findElement(By.xpath("//*[@id='initRequest']/div/div[1]/div[1]/div[1]/i")).click();
        			Thread.sleep(1000);
        			driver.findElement(By.xpath("//*[@id='initRequest']/div/div[1]/div[1]/div[1]/input")).sendKeys("Testing");
        			Thread.sleep(1000);
        			driver.findElement(By.xpath("//*[@id='initRequest']/div/div[2]/ul/li/div[2]/button/span")).click();
        			Thread.sleep(4000);
        			
        			  File scrFile10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                      FileUtils.copyFile(scrFile10, new File("c:\\afterinitiate.jpeg"),true);
                      FileUtils.copyFile(scrFile10, new File("./afterinitiate1.jpeg"),true);
        			  //FileUtils.copyFile(scrFile2, new File("/home/ubuntu/afterinitiate1.jpeg"),true);
                      WebElement draftcount = driver.findElement(By.xpath("//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[2]/li[2]/a/span[2]"));
          			System.out.println("count of the Draft: " +draftcount.getAttribute("innerText"));
                    
                    
                    
                    
                    driver.quit();   
        	}catch(Exception e){
        		System.out.println( "Exception :: " +e);
        	}
           }        
}