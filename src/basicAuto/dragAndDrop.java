package basicAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("scrollBy(0,200)");
	    
	    driver.switchTo().frame(0);  //Move to Frame
	    
	    WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
	   
	    WebElement target = driver.findElement(By.xpath("//*[@id='droppable']"));
	    
	    //Drag and Drop 
	    
	    Actions  a=new Actions(driver);
	    
	   // a.clickAndHold(source).moveToElement(target).release().build().perform();
	    
	    a.dragAndDrop(source, target).perform();
	    
	    
	    driver.switchTo().defaultContent();  // it is used to get back from Frame to original screen
	    
	    
	    WebElement clickOnAccept = driver.findElement(By.xpath("//*[text()='Accept']"));
	    
	    //clickOnAccept.click();
	    
	   // a.doubleClick(clickOnAccept).perform(); //Double click
	    
	    a.contextClick(clickOnAccept).perform();  //Right Click 
	    
	    	
		
	}

}
