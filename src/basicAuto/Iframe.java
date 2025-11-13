package basicAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {

       WebDriver driver=new ChromeDriver();
		
       driver.manage().window().maximize();
		
		//driver.get("https://the-internet.herokuapp.com/iframe");
		
       driver.get("https://demo.automationtesting.in/Frames.html");
       
       
       
       WebElement iframewithFrame = driver.findElement(By.xpath("(//*[@class='analystic'])[1]"));
       iframewithFrame.click();
       
       
       
       
       //driver.switchTo().frame(nestedIframe);
       
       Thread.sleep(2000);
       
       System.out.println("Nested I frame");
       
       
		
		
		//driver.switchTo().frame(2);
		
		//driver.switchTo().frame("(//*[@type='text'])[1]");
		
		
		
	
		
		// WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
		 //driver.switchTo().frame(iframe);
		 
		 
		 //WebElement buttonClick = driver.findElement(By.xpath("(//*[@type='button'])[16]"));
		 //buttonClick.click();
		 
		
			
		 driver.quit();
		
		
		

	}

}
