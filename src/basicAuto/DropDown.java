package basicAuto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		//
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();   //To maximize Window
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");   //to get or redirect to particular page URL
		
		//getTitle
		
		Thread.sleep(3000);
		
		WebElement selectday = driver.findElement(By.id("day"));
		
		
		
		Select s=new Select(selectday);
		s.selectByIndex(13);
		
		//getOptions : to get opetions under the DropDown
		
		List<WebElement> optionUnderDropdown = s.getOptions();
		
		int optionCount = optionUnderDropdown.size();
		
		System.out.println(optionCount);
		
		System.out.println("===============");
		
		for(int i=0;i<optionCount;i++) {
			
			String printvalueunderDropdown = optionUnderDropdown.get(i).getText();
			System.out.println(printvalueunderDropdown);
			
			
			
		}
		
		
		
		WebElement selectmonth = driver.findElement(By.id("month"));
		
		Select s1=new Select(selectmonth);
		s1.selectByValue("4");
		
		
    List<WebElement> optionUnderMonthDropdown = s1.getOptions();
		
		int optionMonthCount = optionUnderMonthDropdown.size();
		
		System.out.println(optionMonthCount);
		
		System.out.println("===============");
		
		for(int i=0;i<optionMonthCount;i++) {
			
			String printvalueunderMonthDropdown = optionUnderMonthDropdown.get(i).getText();
			System.out.println(printvalueunderMonthDropdown);
			
			
			
		}
		
		
		
		WebElement selectYear = driver.findElement(By.id("year"));
		
		Select s2=new Select(selectYear);
		
		s2.selectByVisibleText("2004");
		
		
		 List<WebElement> optionUnderYearDropdown = s2.getOptions();
			
			int optionYearCount = optionUnderYearDropdown.size();
			
			System.out.println("===============");
			
			System.out.println(optionYearCount);
			
			System.out.println("===============");
			
			for(int i=0;i<optionYearCount;i++) {
				
				String printvalueunderYearDropdown = optionUnderYearDropdown.get(i).getText();
				System.out.println(printvalueunderYearDropdown);
				
				
				
			}
		
		
		
		
		driver.close();
		
		
		
		

	}

}
