package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		driver.findElement(By.xpath("//input[contains(@name,'PASS')]")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("5000000");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select ind = new Select(industry);
		ind.selectByIndex(3);
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select own = new Select(ownership);
		own.selectByVisibleText("S-Corporation");
			
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select src = new Select(source);
		src.selectByValue("LEAD_EMPLOYEE");		
	
		WebElement mcampaign = driver.findElement(By.id("marketingCampaignId"));
		Select mc = new Select(mcampaign);
		mc.selectByIndex(6);
		
	    WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select st = new Select(state);
		st.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
				
		
	}

}
