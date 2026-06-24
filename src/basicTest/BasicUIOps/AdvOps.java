package basicTest.BasicUIOps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvOps {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://codenboxautomationlab.com/practice/");
    	
    	/* int count = driver.findElements(By.tagName("iframe")).size();
    	System.out.println(count);
    	
    	// Switch to first iframe
    	driver.switchTo().frame(0);

    	String features = driver.findElement(
    	        By.xpath("//span[normalize-space()='Awesome features']"))
    	        .getText();

    	System.out.println(features);

    	String title = driver.getTitle();
    	System.out.println("Title : " + title);

    	// Go back to the main page
    	driver.switchTo().defaultContent();

    	// Switch to second iframe
    	driver.switchTo().frame(1);

    	System.out.println(driver.getTitle());  */
    	
    	// Parent child windows
    	
    	String parentWindow = driver.getWindowHandle();
    	
    	System.out.println("Parent window" + parentWindow + " title "+ driver.getTitle());
    	
    	//open two child windows
    	driver.findElement(By.id("openwindow")).click();
    	driver.findElement(By.linkText("Open Tab")).click();
    	Thread.sleep(30001);
    	
    	Set <String>multiWindowIds=driver.getWindowHandles();
    	//driver.switchTo().window (multiWindowIds)
    	for (String ids: multiWindowIds) {
    	driver.switchTo().window(ids);
    	System.out.println(driver.getTitle());
    	}
    	
    	//Switch back to main window
    	driver.switchTo().window (parentWindow);
    	
   
	}

}
