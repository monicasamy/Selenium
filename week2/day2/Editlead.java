package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {

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
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Monica");
		driver.findElementByXPath("//button[contains(text(),'Find')]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[text()='Monica'])[1]").click();
		System.out.println(driver.getTitle());
		driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Test Leaf part 4");
		driver.findElementByXPath("//input[@name='submitButton'][@value='Update']").click();	
		String newname = driver.findElementById("viewLead_companyName_sp").getText();
		if(newname.equals("Test Leaf part 4 (10000)") )
		{
			System.out.println("Confirmed");
		}
		else
		{
			System.out.println("error in editing");
		}
driver.close();
	}

}
