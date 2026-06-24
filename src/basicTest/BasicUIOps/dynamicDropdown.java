package basicTest.BasicUIOps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown{
    public static void main(String []args) throws InterruptedException {
	
	
    	WebDriver d5 = new ChromeDriver();
    	d5.manage().window().maximize();
    	d5.get("https://codenboxautomationlab.com/practice/");
    	// Get the dynamic dropdown
    	d5.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India");
    	Thread.sleep(4000l);
    	// get the dropdown suggestions
    	List<WebElement> l1 = d5.findElements(By.xpath("//li[@class='ui-menu-item']"));
    	int s = l1.size();
    	
    	for(int i=0;i<s;i++) {
    		String name = l1.get(i).getText();
    		if(name.equalsIgnoreCase("india")) {
    			l1.get(i).click();
    			break;
    		}
    	}
    }
}