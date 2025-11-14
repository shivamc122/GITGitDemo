package basicAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTest12 {

public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();   //To maximize Window
		
		driver.get("https://www.facebook.com/?_rdr");   
}


public void Test2() {
	
	
	//System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
	
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();   //To maximize Window
			
			driver.get("https://www.facebook.com/?_rdr");   
	}


}
