package week2.day1;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {	
	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("//input[@class = 'inputLogin'][@type = 'text']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@class = 'inputLogin'][@type = 'password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class = 'decorativeSubmit']").click();
	}
}

