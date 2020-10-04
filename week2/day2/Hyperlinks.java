package week2.day2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Hyperlinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElementByLinkText("Go to Home Page").click();
		driver.get("http://leafground.com/pages/Link.html");
	    String linktext = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
	    System.out.println(linktext);
		driver.findElementByLinkText("Verify am I broken?").click();
		String text = driver.getTitle();
		System.out.println(text);
		if(text.contains("404"))
		{
			System.out.println("The page is broken");
		}else
		{
			System.out.println("Page is not broken");
		}
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElementByLinkText("Go to Home Page").click();
		driver.findElementByLinkText("HyperLink").click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		driver.close();
	
	}		
}