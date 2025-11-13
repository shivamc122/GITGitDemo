package basicAuto;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//Simple Aleart Popup`
		
		WebElement clickSimplePopUp = driver.findElement(By.xpath("//*[@class='btn btn-danger']"));
		
		clickSimplePopUp.click();
		
		//to Getting text of Pop Up
		
		String getTextOfSimplePopup = driver.switchTo().alert().getText();
		
		System.out.println(getTextOfSimplePopup);
		
		
		Thread.sleep(3000);
		
		//to click Popup it is work like Cancel button
		//driver.switchTo().alert().dismiss();
		
		//to accept the Simple Popup 
		
		driver.switchTo().alert().accept();
		
		
		System.out.println("=====");
		
		//Confirmation popup
		
		WebElement clickonConfirmationPopUp = driver.findElement(By.xpath("(//*[@class='analystic'])[2]"));
		clickonConfirmationPopUp.click();
		
		
		WebElement confirmationPopupOpen = driver.findElement(By.xpath("//*[text()='click the button to display a confirm box ']"));
		confirmationPopupOpen.click();
		
	
		String afterClickAcceptBuutonText = driver.switchTo().alert().getText();
		System.out.println(afterClickAcceptBuutonText);
		
		
        //driver.switchTo().alert().accept();
		
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		WebElement afterAcceptPopUpText = driver.findElement(By.xpath("//*[text()='You Pressed Cancel']"));
		
		String PrintOutput = afterAcceptPopUpText.getText();
		System.out.println(PrintOutput);
		
		if(PrintOutput.equals("You pressed Ok")) {
			System.out.println("User Click on Accept Button using ConfirmationPopup");
		}
//		
		else {
			System.out.println("User Click on Cancel Button using ConfirmationPopup");
		}
      
		
		//3.prompt Aleart Popup
		
		WebElement clickOnPromptAlaert = driver.findElement(By.xpath("(//*[@class='analystic'])[3]"));
		clickOnPromptAlaert.click();
		
		
	driver.findElement(By.xpath("//*[text()='click the button to demonstrate the prompt box ']")).click();
	
	//driver.switchTo().alert().wait();
	
	driver.switchTo().alert().sendKeys("I am Handling PromptAleart");
	
	Thread.sleep(2000);
	
	driver.switchTo().alert().accept();
	
	Thread.sleep(2000);
	
		driver.close();
		
		
//		
//		
//		
//		

	}

}
