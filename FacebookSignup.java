package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	    Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@role='button']/parent::div[@class='_6ltg']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("firstname")).sendKeys("Barath");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("Kesavan");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("6379866188");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Barath@34@");
		//To select date
		 WebElement Day = driver.findElement(By.id("day"));
		Select date = new Select(Day);
		date.selectByValue("12");
		//To select month
		WebElement Date=driver.findElement(By.id("month"));
		Select month=new Select(Date);
		month.selectByVisibleText("Jan");
		//To select year
		WebElement Year=driver.findElement(By.id("year"));
		Select year=new Select(Year);
		year.selectByValue("2000");
		//Gender
		WebElement male=driver.findElement(By.id("u_3_5_uW"));
		if(!male.isSelected()) {
			male.click();
		}
		driver.findElement(By.className("fbIndex UIPage_LoggedOut _-kb _605a b_c3pyn-ahh chrome webkit win x1 Locale_en_GB cores-lt4 _19_u")).click();
		
		
		
		
		
		

	}

}
