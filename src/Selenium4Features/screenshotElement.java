package Selenium4Features;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://codenboxautomationlab.com/practice/");
    	
    	WebElement myName = driver.findElement(By.id("name"));
    	myName.sendKeys("Alkesh");
    	
    	File srcFile = myName.getScreenshotAs(OutputType.FILE);
    	
    	

	}

}
