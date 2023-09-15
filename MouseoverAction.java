package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		
		Thread.sleep(4000);
		WebElement TextEmail = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		
		Thread.sleep(4000);
		WebElement TextPassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		
		Thread.sleep(4000);
		WebElement Signin = driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button"));
		
		Thread.sleep(4000);
		Actions bh = new Actions (driver);
		Actions seriesOfActions = bh;
		
		
		Thread.sleep(4000);
		bh.moveToElement(TextEmail);
		bh.click();
        bh.sendKeys("barathkesavan001@gmail.com");
		
		
		Thread.sleep(4000);
		bh.moveToElement(TextPassword);
		bh.click();
		bh.sendKeys("Barath@23!");
		
		
		Thread.sleep(4000);
		
		bh.click();
		bh.build();
		bh.perform();
		
		
		}
	}
	


