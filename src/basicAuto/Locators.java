package basicAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	static String username="sree@12334";
	static String password="pgddhdh@1233";

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();    //To maximize Browser Window
		
		//driver.get("https://www.facebook.com/");  //To redirect particular Webpage
		
		driver.navigate().to("https://www.facebook.com/");  //To redirect to particualr webpafe
		
//		WebElement click = driver.findElement(By.id("email"));
//		  click.click();
//		  
		//  System.out.println("Weblement Click is clicked");
		
		WebElement passingemailid = driver.findElement(By.name("email"));
		  
		passingemailid.sendKeys(username);
		
		System.out.println("Weblement Sendkeys are entered ");
		
		Thread.sleep(2000);   //ask to weblement to stop or hold for particular time without performing next action
		
//		passingemailid.clear();
//		
//		System.out.println("Weblement Sendkeys are entered are REMOVED OR CLEAR ");
		
		//driver.quit();  //to close Browser
		
		WebElement passingPassword = driver.findElement(By.id("pass"));
		passingPassword.sendKeys(password);
		
        System.out.println("Weblement Password is entered ");
		
		Thread.sleep(2000);
		WebElement loginButtonClick = driver.findElement(By.name("login"));
		
		//WebElement loginButtonClick = driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
		loginButtonClick.click();
		
		 System.out.println("Login Button Click");	
		 
		 Thread.sleep(2000);
		
		
		//driver.findElement(By.tagName("a")).click();
		
		 System.out.println("Click on forget password");
		 
		// driver.close();
		 
		 Thread.sleep(6000);
		 
		 
		 driver.navigate().back();
		
		
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("90807060");
		
		

	}

}
