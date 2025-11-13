package basicAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) {
		//
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://www.hyrtutorials.com/p/frames-practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
  
		js.executeScript("scrollBy(200,1850)");
		
		//
		WebElement frame2rdirection = driver.findElement(By.xpath("//*[@id='frm2']"));
		
		driver.switchTo().frame(frame2rdirection);
		
		WebElement Firstname = driver.findElement(By.xpath("(//*[@placeholder='Enter First Name'])[1]"));
		Firstname.sendKeys("SaiRam1233");
		
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("Shirdi");
		
		
		WebElement stclick = driver.findElement(By.id("englishchbx"));
		stclick.click();
	}
	

}
