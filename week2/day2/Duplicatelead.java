package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Duplicatelead {

	public static void main(String[] args) throws InterruptedException {
	
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
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[contains(text(),'Email')]").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("monipsgct@gmail.com");
		driver.findElementByXPath("//button[contains(text(),'Find')]").click();
		Thread.sleep(2000);
		String Leadname = driver.findElementByXPath("(//a[@class='linktext'])[6]").getText();
		System.out.println(Leadname);
		driver.findElementByLinkText("Monika").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		System.out.println(driver.getTitle());
		driver.findElementByName("submitButton").click();
		String dupname = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(dupname);
		if(dupname.equals(Leadname))
		{
			System.out.println("Confirmed it is same");
		}
		
		
	}

}
