package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Program3 {

	public static void main(String[] args) {
		WebDriver driver;
		
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
 driver.manage().window().maximize();
 
 System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	driver.navigate().refresh();
	driver.close();
	}
	

}
