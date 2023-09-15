package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement From = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		WebElement Destination = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions dd = new Actions (driver);
		dd.dragAndDrop(From, Destination)
		.build()
		.perform();
        

	}

}
