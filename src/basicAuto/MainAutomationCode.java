package basicAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainAutomationCode  extends Locators1{

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.navigate().to("https://www.facebook.com/");
		//driver.get("https://www.instagram.com/");
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(3000);
		
		WebElement enterUsername = driver.findElement(By.id("user-name"));
		enterUsername.sendKeys(Username);
		
		WebElement enterPassword = driver.findElement(By.id("password"));
		enterPassword.sendKeys(Password);
		
		Thread.sleep(2000);
		
		WebElement loginButtonClick = driver.findElement(By.id("login-button"));
		loginButtonClick.click();
		
		
		try {
              // Try to find the error element
            WebElement error1 = driver.findElement(By.xpath("//*[@data-test='error']"));
            error1.click(); // Optional: Only needed if the error is clickable

            String errorMessage = error1.getText();

            // Compare the actual error message
            if (errorMessage.equals("Epic sadface: Username and password do not match any user in this service")) {
                System.out.println("Wrong Username or Password Entered");
            } else {
                System.out.println("Go on Next Page");
            }

        } catch (Exception e) {
            // Handle any unexpected errors
            System.out.println("An exception occurred: " + e.getMessage());
        } finally {
            // Close the browser
            //driver.quit();
        	driver.close();
        }
    }
		
		
//		WebElement error1 = driver.findElement(By.xpath("//*[@data-test='error']"));
//		error1.click();
//		
//		Thread.sleep(1000);
//		
//		if(errorMessage=="Epic sadface: Username and password do not match any user in this service")
//		{
//			System.out.println("Wrong Username or Password Entered");
//			
//		}
//		
//		else
//		{
//			System.out.println("Go on Next Page");	
//		}
		
	
		
		
		
		
		
		
		
		
		//driver.findElement(By.className("email")).sendKeys(Username);
		
		//driver.findElement(By.id("ai_input")).sendKeys(Username);
		
		
		//driver.findElement(By.linkText("लॉग इन करें")).click();
		
		//driver.findElement(By.className("ColoredButton_blueButton__IeoF4 buttons_sdsButton__57EIz")).click();
		
		//driver.close();

	
}
