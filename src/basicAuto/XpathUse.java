package basicAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUse {
	
	static String errorMessage="Please enter a valid email address";

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://courses.ultimateqa.com/users/sign_in");
		
		WebElement emailTextBox = driver.findElement(By.xpath("//input[@type='email']"));

		emailTextBox.sendKeys("sai@gmail.com");
		
		Thread.sleep(2000);
		
//		WebElement passwordTextBox = driver.findElement(By.xpath("(//input[@spellcheck='false'])[2]"));
//		passwordTextBox.sendKeys("123456789");
		
		
		WebElement passwordTextBox =driver.findElement(By.xpath("(//*[contains(@spellcheck,'false')])[2]"));
		
		passwordTextBox.sendKeys("12345566");
		
		
//		try {
//            // Try to find the error element
//          WebElement error1 = driver.findElement(By.xpath("//*[@id='user[email]-error']"));
//          //error1.click(); // Optional: Only needed if the error is clickable
//
//          String errorMessage = error1.getText();
//
//          // Compare the actual error message
//          if (errorMessage.equals("Please enter a valid email address")) {
//              System.out.println("Please Enter Valid Email Address");
//          } else {
//              System.out.println("Go on Next Page");
//          }
//
//      } catch (Exception e) {
//          // Handle any unexpected errors
//          System.out.println("An exception occurred: " + e.getMessage());
//      } finally {
//          // Close the browser
//          //driver.quit();
//      	driver.close();
//      }
		
		
  }
	
	}


