package pomPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddData {
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		Thread.sleep(5000);
		
		PomClass pc=new PomClass(driver);
		
		pc.SetUserame();
		pc.SetPassword();
		pc.SetLogin();
		
	}
	
	
	

}
