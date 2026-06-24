package basicTest.BasicUIOps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://codenboxautomationlab.com/practice/");
    	
    	/* List<WebElement> l1 = driver.findElements(By.cssSelector(".radioButton"));
    	int s = l1.size();
    	
    	for(int i=0;i<s;i++) {
    		String str = l1.get(i).getAttribute("value");
    		System.out.println(str);
    		if(str.equals("radio3")) {
    			l1.get(i).click();
    			break;
    		}
    	}  */
    	
    	
    	// Checkbox Logic
    	
    	/* List<WebElement> l2 = driver.findElements(By.xpath("//input[@type='checkbox']"));
    	
    	for(int i=0;i<l2.size();i++) {
			String str = l2.get(i).getAttribute("value");
			System.out.println(str);
			if(str.equals("option1") || str.equals("option3")) {
				l2.get(i).click();
			}
		}  */
    	
    	// Javascript Alerts
    	
    	driver.findElement(By.xpath("//input[@name = 'enter-name']")).sendKeys("Alkesh");
    	driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
    	Thread.sleep(3000l);
    	System.out.println(driver.switchTo().alert().getText());
    	driver.switchTo().alert().accept();
    	
    	
	}

}
