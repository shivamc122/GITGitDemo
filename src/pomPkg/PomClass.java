package pomPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PomClass {
	
	//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//	WebElement usernamePath = driver.findElement(By.name("username"));
//	usernamePath.sendKeys(Username);
//
//	WebElement passwordPath = driver.findElement(By.name("password"));
//	passwordPath.sendKeys(Password);
//
//	WebElement loginBtnPath = driver.findElement(By.xpath("//button[@type='submit']"));
//	loginBtnPath.click();
	
	
	
	
	//Declartion
	
	private WebElement username;
	private WebElement password;
	private WebElement login;
	WebDriver driver;
	
	
	//Initiazation
	
	public PomClass(WebDriver driver) {
		this.driver=driver;
		
	
	
	
	username=driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[1]"));
	password=driver.findElement(By.name("password"));
	login=driver.findElement(By.xpath("//button[@type='submit']"));
	
	}
	
	//Usage
	
	public void SetUserame() throws InterruptedException {
		
		Thread.sleep(2000);
		
		
		username.sendKeys("Admin");
		
		Thread.sleep(2000);
		
		
		System.out.println("========");
		
		
		
		
	}
	
	
	public void SetPassword() {
		password.sendKeys("admin123");
		
		
		
	}
	
	
	public void SetLogin() {
		login.click();
		
		
		
	}
	

	
}
