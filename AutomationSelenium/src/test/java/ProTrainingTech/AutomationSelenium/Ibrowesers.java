package ProTrainingTech.AutomationSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowesers {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rabiya's Windows PC\\eclipse-workspace\\AutomationSelenium\\src\\test\\java\\ProTrainingTech\\AutomationSelenium\\Ibrowesers.java");
 driver=new ChromeDriver();
 driver.navigate().to("https://www.amazon.com");
		
		

	}

}
