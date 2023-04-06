package Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Priya");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("pius");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Abc Street");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Priya@123");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		
	}

}
