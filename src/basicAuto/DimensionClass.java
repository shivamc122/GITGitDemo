package basicAuto;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionClass {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/"); 

	Dimension d=new Dimension(400,500);//Width and Height
	driver.manage().window().setSize(d);
		
		//driver.manage().window().maximize();
		
//	Dimension size=driver.manage().window().getSize();
//	System.out.println(size.getHeight());
//	System.out.println(size.getWidth());
//		
	
	Point p=new Point(200,60);  //X and Y
	driver.manage().window().setPosition(p);
	
	//driver.manage().window().maximize();
	
	Point position=driver.manage().window().getPosition();
	System.out.println(position.getX());
	System.out.println(position.getY());
	
	
	
	}
	
	

}
