package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deletelead {

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
		driver.findElementByXPath("//span[contains(text(),'Phone')]").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("934");
		driver.findElementByXPath("//button[contains(text(),'Find')]").click();
		Thread.sleep(2000);
		String LeadID = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		System.out.println(LeadID);
		driver.findElementByXPath("(//a[text()='Moni'])[1]").click();
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(LeadID);
		driver.findElementByXPath("//button[contains(text(),'Find')]").click();
        String message = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		System.out.println(message);
		if(message.equals("No records to display"))
		{
			System.out.println("The message is confirmed");
		}
		else
		{
			System.out.println("There are still nore records");
		}
	}

}
