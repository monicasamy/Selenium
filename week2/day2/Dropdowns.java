package week2.day2;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
	    WebElement program = driver.findElementById("dropdown1");
	    Select dropDown = new Select(program);
	    dropDown.selectByIndex(2);
	    WebElement program2 = driver.findElementByName("dropdown2");
	    Select dropDown2 = new Select(program2);
	    dropDown2.selectByVisibleText("Selenium");
	    WebElement program3 = driver.findElementById("dropdown3");
	    Select dropDown3 = new Select(program3);
	    dropDown3.selectByValue("3");
	    WebElement program4 = driver.findElementByClassName("dropdown");
	    Select dropdown4 = new Select(program4);
	    List<WebElement> options = dropdown4.getOptions();
	    int size = options.size();
	    System.out.println(size);
	    driver.findElementByXPath("(//div[@class='example'])[5]/select").sendKeys("Loadrunner");
	    WebElement multiple = driver.findElementByXPath("(//div[@class='example'])[6]/select");
	    Select dropdown5 =  new Select (multiple);
	    List<WebElement> multiselect = dropdown5.getOptions();
	    int count  = multiselect.size();
	    System.out.println(count);
	    for (int i = 1 ; i <=count ; i++)
	    {
	    	multiselect.get(i).click();
	    	
	    }   
	    
	}
	
}