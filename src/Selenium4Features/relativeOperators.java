package Selenium4Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class relativeOperators {

	public static void main(String[] args) {
		
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://codenboxautomationlab.com/practice/");
    	
    	
    	// above example
    	WebElement checkboxBtn = driver.findElement(By.id("checkBoxOption1"));
    	String switchElement = driver.findElement(with(By.tagName("legend")).above(checkboxBtn)).getText();
    	System.out.println(switchElement);
    	
    	//below 
    	WebElement checkBox2 = driver.findElement(with(By.tagName("input")).below(checkboxBtn));
    	checkBox2.click();
    	
	}

}
