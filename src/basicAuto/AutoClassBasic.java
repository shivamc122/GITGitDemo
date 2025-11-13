package basicAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoClassBasic {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();   //To maximize Window
		
		driver.get("https://www.facebook.com/?_rdr");   //to get or redirect to particular page URL
		
		//getTitle
		
		Thread.sleep(3000);
		
		//driver.navigate().forward();  //Forward by one page from existing Webpage
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
//		String Title = driver.getTitle();
//		
//		System.out.println(Title);
//		
//		Thread.sleep(3000);
//		
//		//driver.close();  //to close the current broweser window
//		
//		//driver.quit();
//		
//		//Thread.sleep(3000);
//		
//		
//		//To get Current Page source
//		
//		String pagesource = driver.getPageSource();
//		
//		System.out.println(pagesource);
//		
//		
//		System.out.println("=============");
//		
//		
//		//To get Current Page URL
//		
//		String currentPageURL = driver.getCurrentUrl();
//		
//		System.out.println(currentPageURL);
//		
//		
//		
//		
//		
//		//driver.get("https://www.facebook.com/?_rdr");
//		
//		
//		//driver.quit();  //to quit the page
//		

	}

}
