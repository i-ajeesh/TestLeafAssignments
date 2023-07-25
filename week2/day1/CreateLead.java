package week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		driver.findElement(By.xpath("//input[contains(@name,'PASS')]")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajeesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select src = new Select(source);
		src.selectByVisibleText("Employee");
		
		WebElement Marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mkc = new Select(Marketing);
		mkc.selectByValue("9001");
		
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select ind = new Select(industry);
		ind.selectByIndex(15);
		
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select own = new Select(owner);
		own.selectByIndex(5);
		
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select cy = new Select(country);
		cy.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		
	
	
	}

}
