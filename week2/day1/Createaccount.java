package week2.day1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Createaccount {	
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
		driver.findElementByLinkText("Create Account").click();
		driver.findElementByXPath("//input[@id='accountName']").sendKeys("Debit Limited Account-Moni");
		driver.findElementByXPath("(//textarea[@class='inputBox'])[1]").sendKeys("Selenium Automation Tester");
		driver.findElementByXPath("//input[@id='groupNameLocal']").sendKeys("Selenium");
		driver.findElementByXPath("//input[@id='officeSiteName']").sendKeys("Chennai");
		driver.findElementByXPath("//input[@class='inputBox'][@name='annualRevenue']").sendKeys("5,00,000");
		WebElement industry = driver.findElementByName("industryEnumId");
		Select dropDown = new Select(industry);
		dropDown.selectByIndex(3);
		WebElement ownership = driver.findElementByName("ownershipEnumId");
		Select dropDown1 = new Select(ownership);
		dropDown1.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElementById("dataSourceId");
		Select dropDown2 = new Select(source);
		dropDown2.selectByValue("LEAD_EMPLOYEE");
		WebElement MC = driver.findElementById("marketingCampaignId");
		Select dropDown3 = new Select(MC);
		dropDown3.selectByIndex(6);
		WebElement state = driver.findElementById("generalStateProvinceGeoId");
		Select dropDown4 = new Select(state);
		dropDown4.selectByValue("TX");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		//driver.close();		
	}
}
