package Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Priya@123");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Priya");

		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Priya@456");

		driver.findElement(By.xpath("//button[@name='login']")).click();


	}

}
