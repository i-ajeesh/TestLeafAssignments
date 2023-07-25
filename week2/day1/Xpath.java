package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
//		
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.nykaa.com/");
//		driver.manage().window().maximize();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("username")).sendKeys("demosalesManager");
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		driver.findElement(By.xpath("//input[contains(@name,'PASS')]")).sendKeys("crmsfa");
		
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
			
		
		
	}

}
