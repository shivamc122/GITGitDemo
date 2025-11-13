package basicAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewUserCreationFB extends UserData{
	
public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(StartingURL);
		
	    WebElement CreateButtonClick = driver.findElement(By.xpath(createButtonPath));
	    CreateButtonClick.click();
	    
	    driver.findElement(By.xpath(FirstNamePath)).sendKeys(FirstName);
	    
	    driver.findElement(By.xpath(SurnamePath)).sendKeys(Surname);
	    
	    driver.findElement(By.xpath(GenderSelection)).click();
	    
	    
	    
	

}
}
