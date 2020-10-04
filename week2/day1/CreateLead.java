package week2.day1;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {	
	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement name = driver.findElementById("username");
		name.sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Test Leaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Monica");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ramasamy");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText("Employee");
		WebElement MC = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown1 = new Select(MC);
		dropdown1.selectByValue("9001");
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown2 = new Select(industry);
		List<WebElement> options = dropdown1.getOptions();
		int size = options.size();
		dropdown2.selectByIndex(size-1);
		WebElement owner = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropdown3 = new Select(owner);
		dropdown3.selectByIndex(5);
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropdown4 = new Select(country);
		dropdown4.selectByVisibleText("India");
		driver.findElementByName("submitButton").click();
		String Title = driver.getTitle();		
		System.out.println(Title);
		//driver.close();		
	}
}
