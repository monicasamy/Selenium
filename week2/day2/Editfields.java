package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editfields {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		WebElement name = driver.findElementById("email");
		name.sendKeys("monipsgct@gmail.com");
		String text = driver.findElementByXPath("(//div[@class ='large-6 small-12 columns'])[2]/input").getAttribute("value");
		driver.findElementByXPath("(//div[@class ='large-6 small-12 columns'])[2]/input").sendKeys(text ,"SE");   
		driver.findElementByXPath("(//div[@class ='large-6 small-12 columns'])[2]/input").sendKeys(Keys.TAB);
		String text2 = driver.findElementByXPath("(//div[@class ='large-6 small-12 columns'])[3]/input").getAttribute("value");
		driver.findElementByXPath("(//div[@class ='large-6 small-12 columns'])[3]/input").sendKeys(text2);
		driver.findElementByXPath("(//div[@class ='large-6 small-12 columns'])[4]/input").clear();
		Boolean con = driver.findElementByXPath("(//div[@class ='large-6 small-12 columns'])[5]/input").isEnabled();
		if(con == false)
		{
			System.out.println("Field is disabled");
		}
	}

}
