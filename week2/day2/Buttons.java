package week2.day2;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElementByXPath("//div[@class ='large-6 small-12 columns']/button").click();
		driver.get("http://leafground.com/pages/Button.html");
		Point location = driver.findElementByXPath("(//div[@class ='large-6 small-12 columns'])[2]/button").getLocation();
        System.out.println(location.getX());
        System.out.println(location.getY());
        String color = driver.findElementByXPath("(//div[@class ='large-6 small-12 columns'])[3]/button").getAttribute("style");
        System.out.println(color);
        Dimension size = driver.findElementByXPath("(//div[@class ='large-6 small-12 columns'])[4]/button").getSize();
        System.out.println(size);
        driver.close();
	}

}
