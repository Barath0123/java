package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	    
		TakesScreenshot bh =(TakesScreenshot)driver;
		File screenshotFile = bh.getScreenshotAs(OutputType.FILE);
		String screenshotPath ="D:\\Screenshot\\bh.png";
		FileUtils.moveFile(screenshotFile, new File(screenshotPath));
		
		//TakesScreenshot ts = (TakesScreenshot)driver;
		//File source = ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(source, new File("C:\\ScreenShot"));
		System.out.println();
		driver.quit();
		
	}

}
