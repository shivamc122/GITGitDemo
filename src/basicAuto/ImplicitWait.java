package basicAuto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ImplicitWait {

	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(16,TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		WebElement TextBox1Click = driver.findElement(By.xpath("//*[text()='Add Textbox1']"));

		TextBox1Click.click();
		
		
		boolean textboxisDisplayed = TextBox1Click.isDisplayed();
		System.out.println(textboxisDisplayed);
		
		
		
		System.out.println("====");
		
		WebElement EnterTextIntoTextbox1 = driver.findElement(By.id("txt1"));
		 EnterTextIntoTextbox1.sendKeys("Sneha Prabhu");
		
		System.out.println(EnterTextIntoTextbox1);
		
		System.out.println("*****");
		
		boolean textboxisEnabled2 = EnterTextIntoTextbox1.isEnabled();
		System.out.println(textboxisEnabled2);
		
		System.out.println("====");
		
		
		
		
		
		
		WebElement TextBox2Click = driver.findElement(By.xpath("//*[text()='Add Textbox2']"));
		
		TextBox2Click.click();
		
		WebElement EnterTextIntoTextbox2 = driver.findElement(By.id("txt2"));
		EnterTextIntoTextbox2.sendKeys("Siddhi Prabhu");
		
		System.out.println("====");
		
		
		boolean textboxisEnabled1 = EnterTextIntoTextbox2.isEnabled();
		System.out.println(textboxisEnabled1);
		
		System.out.println("====");
		
		driver.close();
	}

}
