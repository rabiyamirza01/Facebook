package ProTrainingTech.AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Papajohns {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rabiya's Windows PC\\eclipse-workspace\\AutomationSelenium\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.papajohns.com/");
		
		WebElement papa=driver.findElement(By.linkText("START YOUR ORDER")); // How to automate the order part
		papa.click();
		Thread.sleep(6000);
		
		WebElement johns=driver.findElement(By.id("locations-country")); // How to automate the location
		Select obj = new Select(johns);
		obj.selectByVisibleText("CANADA");
		
		WebElement johny=driver.findElement(By.id("locations-addresstype")); // How to automate the resident
		Select obg=new Select(johny);
		obg.selectByVisibleText("Business");
		Thread.sleep(6000);
		
		WebElement papas=driver.findElement(By.xpath("//*[@placeholder='Example: 123 Main St.']")); // How to automate the primary address.
        papas.click();
		papas.sendKeys("43965 Bidwell Ct ashburn Va 20147");
		
		WebElement loc=driver.findElement(By.name("aptstefloor")); // How to automate the building element
		Select objy=new Select(loc);
		objy.selectByVisibleText("Floor");
		
		WebElement loce=driver.findElement(By.name("postalcode")); // How to automate the postal code
		loce.click();
		loce.sendKeys("20147");
		
		
		
		}

}
