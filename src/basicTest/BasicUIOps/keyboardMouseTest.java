package basicTest.BasicUIOps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardMouseTest {

	public static void main(String[] args) {
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://codenboxautomationlab.com/practice/");
    	
    	Actions a = new Actions(driver);
    	// Hover mouse to courses
    	WebElement course = driver.findElement(By.xpath("//a[@class='sf-with-ul']"));
    	// course.click();  ---> by using this , only click is performed 
    	//a.moveToElement(course).build().perform(); -----> by using this , the click operation continues until we interrupt
    	
    	// Click on search and type selenium(holding shift key) & double click on it
    	WebElement search = driver.findElement(By.cssSelector("div[id='search-2'] input[placeholder='Search...']"));
    	// a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("seleNium").doubleClick().build().perform();
    	
    	//Right click on link and open in new tab
    	WebElement yt = driver.findElement(By.linkText("Free courses on YouTube"));
    	a.moveToElement(yt).contextClick().keyDown(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();


	}

}
