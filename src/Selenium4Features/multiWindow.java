package Selenium4Features;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://codenboxautomationlab.com/practice/");
    	
    	// open a 2nd new - child tab
    	driver.switchTo().newWindow(WindowType.WINDOW);
    	
    	Set<String> handler = driver.getWindowHandles();
    	
    	Iterator<String> itr = handler.iterator();
    	
    	String parentWindow = itr.next();
    	String childWindow = itr.next();
    	
    	driver.switchTo().window(childWindow);
    	
    	driver.get("https://codenbox.com/");
    	System.out.println("Before "+driver.getTitle());
    	
    	driver.switchTo().window(parentWindow);
    	System.out.println("After "+driver.getTitle());

	}

}
