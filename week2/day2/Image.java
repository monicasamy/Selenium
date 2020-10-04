package week2.day2;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Image {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
	    driver.findElementByXPath("//img[@src='../images/home.png']").click();
	    driver.get("http://leafground.com/pages/Image.html");
	    boolean ans =driver.findElementByXPath("//img[@src='../images/abcd.jpg']").isSelected();
	    System.out.println(ans);
		if(ans!= true)
		{
			System.out.println("The image is broken");
		}else
		{
			System.out.println("Not broken");
		}
		driver.findElementByXPath("//img[@src='../images/keyboard.png']").click();
	    Thread.sleep(2000);
	    driver.close();
	
	}		
}