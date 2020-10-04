package week2.day2;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElementById("yes").click();	
		boolean radio =driver.findElementByXPath("//input[@name='news'][@value=1]").isSelected();
		System.out.println(radio);
		if(radio!=false) {
			System.out.println("Checked is selected");
		}
		else {
			System.out.println("Unchecked is selected");
		}	
	
			if ( driver.findElementByXPath("//input[@class='myradio'][@name='age'][@value=0]").isSelected()==true)
			{
				System.out.println("Already checked");
			}
			else if (driver.findElementByXPath("//input[@class='myradio'][@name='age'][@value=1]").isSelected() == true) 
			{
				System.out.println("Already checked");
			}
			else if(driver.findElementByXPath("//input[@class='myradio'][@name='age'][@value=2]").isSelected() == true)
			{
				
				System.out.println("Already checked");
			}
			else
			{
				driver.findElementByXPath("//input[@class='myradio'][@name='age'][@value=1]").click();
			
			}
			driver.close();
	}
		}	
	
	