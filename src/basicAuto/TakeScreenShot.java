package basicAuto;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		
			
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.facebook.com/"); 
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			//File src = ((TakeScreenShot)driver).getScreenshotAs(OutputType.FILE);
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			String path = "D:\\ScreenShot\\FirstScreenShot.png";
			
			File Destination=new File(path);
			
			FileHandler.copy(screenshot, Destination);
			
			
			WebElement ForgotButtonclick = driver.findElement(By.xpath("//*[text()='Forgotten password?']"));
			ForgotButtonclick.click();
			Thread.sleep(2000);
			
            File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);  //.FILE IS EXTENSION
			
            //File This  is Class which is acts as NON PRIMITIVE DATATYPE
            
			String path1 = "D:\\ScreenShot\\SeconedScreenShot.png";
			
			File Destination1=new File(path1);
			
			FileHandler.copy(screenshot1, Destination1);

	}

}
