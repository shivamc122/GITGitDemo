package basicAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorText {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String StartingURL = "https://www.facebook.com/";
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement ForgotButtonclick = driver.findElement(By.xpath("//*[text()='Forgotten password?']"));
		ForgotButtonclick.click();
		
		Thread.sleep(2000);
		
		
        WebElement AnotherForgotButtonClick = driver.findElement(By.xpath("//*[contains(text(),'Forgotten account?')]"));
        AnotherForgotButtonClick.click();
        
		//WebElement ForgotButtonclick = driver.findElement(By.linkText("Forgotten password?"));
		//ForgotButtonclick.click();
		
		//WebElement ForgotButtonclick =driver.findElement(By.partialLinkText("gotten passw"));
		//ForgotButtonclick.click();
		
		String currentURL = driver.getCurrentUrl();
		
		System.out.println(currentURL);
		
		
		
		
		Thread.sleep(2000);
		
		driver.navigate().to(StartingURL);
		
		
	}

}
