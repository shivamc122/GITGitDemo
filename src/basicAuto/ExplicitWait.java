package basicAuto;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		
				
		
	WebElement TextBox1Click = driver.findElement(By.xpath("//*[text()='Add Textbox1']"));

		TextBox1Click.click();
		
		// Create a WebDriverWait instance
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(6)); // Timeout is 10 seconds

		
		// Specify the condition you want to wait for
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.id("txt1")));
		

		// Interact with the element once the condition is met
		//element1.click();
		element1.sendKeys("Sneha Prabhu");
		
		//System.out.println(EnterTextIntoTextbox1);
		
		
		boolean textboxisDisplayed = element1.isDisplayed();
		System.out.println(textboxisDisplayed);
		
		
		
		System.out.println("====");
		
//	    WebElement EnterTextIntoTextbox1 = driver.findElement(By.id("txt1"));
//		 EnterTextIntoTextbox1.sendKeys("Sneha Prabhu");
//		
		//System.out.println(EnterTextIntoTextbox1);
		
		System.out.println("*****");
		
		boolean textboxisEnabled2 = element1.isEnabled();
		System.out.println(textboxisEnabled2);
		
		System.out.println("====");
		
		

		
		
		
		
		
		WebElement TextBox2Click = driver.findElement(By.xpath("//*[text()='Add Textbox2']"));
		
		TextBox2Click.click();
		
		// Create a WebDriverWait instance
				WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10)); // Timeout is 10 seconds

				
				// Specify the condition you want to wait for
				WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(By.id("txt2")));

				// Interact with the element once the condition is met
				element2.sendKeys("Siddhi Prabhu");
		
		
		System.out.println("====");
		
		
		boolean textboxisEnabled1 = element2.isEnabled();
		System.out.println(textboxisEnabled1);
		
		System.out.println("====");
		
		driver.close();

	}

}
