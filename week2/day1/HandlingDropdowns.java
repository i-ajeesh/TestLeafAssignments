package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajeesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select ind = new Select(industry);
		ind.selectByIndex(5);
		
		WebElement OwnerShip = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select own = new Select(OwnerShip);
		own.selectByValue("OWN_SCORP");
		
		WebElement Currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select curr = new Select(Currency);
		curr.selectByVisibleText("AED - United Arab Emirates Dirham");
		

	}

}
