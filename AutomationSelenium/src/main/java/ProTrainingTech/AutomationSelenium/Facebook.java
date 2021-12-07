package ProTrainingTech.AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rabiya's Windows PC\\eclipse-workspace\\AutomationSelenium\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://facebook.com"); // How to open the web page
		
		WebElement create=driver.findElement(By.linkText("Create new account"));// Create new account
		create.click();
		Thread.sleep(6000);
		WebElement field=driver.findElement(By.name("firstname")); // How to automate the first name
		field.click();
		field.sendKeys("Rabiya");
		
		WebElement last=driver.findElement(By.name("lastname")); // How to automate the last name
		last.click();
		last.sendKeys("Habib");
		
		WebElement phone=driver.findElement(By.name("reg_email__")); // How to automate the phone
		phone.click();
		phone.sendKeys("7165871052");
		
		WebElement newpass=driver.findElement(By.name("reg_passwd__")); // How to automate the new password element
		newpass.click();
		newpass.sendKeys("Florida09");
		
		WebElement birthofmonth=driver.findElement(By.name("birthday_month")); // How to automate the drop down birthday month
		Select ob=new Select(birthofmonth);
		ob.selectByIndex(7);
		
		WebElement birthofday=driver.findElement(By.name("birthday_day")); // How to automate the drop down birthday
		Select obj=new Select(birthofday);
		obj.selectByVisibleText("25");
		
		WebElement year=driver.findElement(By.name("birthday_year")); // How to automate the drop down for year
		Select obje=new Select(year);
		obje.selectByVisibleText("2002");
		
		WebElement gend=driver.findElement(By.xpath("(//*[@name='sex'])[1]")); // How to automate the gender part
        gend.click();
		
		Thread.sleep(6000);
		driver.navigate().back(); // How to automate back
		
		driver.navigate().forward(); //How to automate forward
		Thread.sleep(6000);
		WebElement search=driver.findElement(By.name("email"));// Automate the email
		search.sendKeys("rabiyamirza@gmail.com");
		
		WebElement passw=driver.findElement(By.name("pass")); // Automate password
		passw.sendKeys("Michigan001");
		Thread.sleep(6000);

		
		
	}

}
