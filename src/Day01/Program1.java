package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		WebDriver driver;        //webdriver for selenium
		driver = new ChromeDriver();     //browser launch command
		
		driver.get("https://demo.automationtesting.in/Register.html");      //application launch
		//driver.manage().window().maximize();         //browser maximize
		//driver.manage().window().minimize();         //browser minimize
		driver.manage().window().fullscreen();         //browser full screen
		System.out.println(driver.getTitle());         //browser title card
		System.out.println(driver.getCurrentUrl());     //to get the url
		
		driver.navigate().refresh();
		
		driver.navigate().back();                   //to go backward
		
		driver.navigate().forward();                // to go forward
		//driver.close();                            //to close browser
		driver.quit();                               // to completely close the browser

	}

}
