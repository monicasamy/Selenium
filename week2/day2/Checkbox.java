package week2.day2;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Checkbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
        	List<WebElement> languages = driver.findElementsByXPath("//input[@type='checkbox']");
		    int count  = languages.size();
		    System.out.println(count);
		    for (int i = 0 ; i <=4 ; i++)
		    {
		    	languages.get(i).click();
		    	//String Lang = languages.gettext(i);
		    	
		    } 
		    boolean confirm = driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected();
		    if(confirm!=true)
		    {
		    	System.out.println("Not selected");
		    }
		    else
		    {
		    	System.out.println("Selected");
		    }
		   
		 if ((driver.findElementByXPath("(//input[@type='checkbox'])[8]")).isSelected())
		 {
			 driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
		 }
		 else
		 {
			 System.out.println("Not checked");
		 }
		 
		    
		   List<WebElement> options = driver.findElementsByXPath("//input[@type='checkbox']");
		   for (int i = 8 ; i <=13 ; i++)
		   {
		    	options.get(i).click();
		    	
		    	
		    } 
	}
}