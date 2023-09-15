package selenium;

//public class Practice {
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.remote.DesiredCapabilities;

	public class Practice {
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		WebElement txtUsername =driver.findElement(By.id("email"));
		Thread.sleep(3000);
		
		WebElement txtpassword =driver.findElement(By.id("pass"));
		Thread.sleep(3000);
		
		WebElement txtlogin =driver.findElement(By.name("login"));
		
	             

	                Actions builder = new Actions(driver);
	                Actions seriesOfactions = builder;
	                 

	                builder.moveToElement(txtUsername)
	                 .click()
	            
	                 .sendKeys("Kamali")

	                   .moveToElement(txtpassword)
	                 .click()
	                 
	                 .sendKeys("Kam@123")
	                
	                 .click(txtlogin)
	                 .build()
	                 .perform();
	                System.out.println(txtUsername);
	                System.out.println(txtpassword);
	}
	}
	//MouseHoverAction (1).txt
	//Displaying MouseHoverAction (1).txt.


