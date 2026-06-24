package basicTest.BasicUIOps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {
	public static void main(String[] args) {
		
		WebDriver d4 = new ChromeDriver();
		d4.get("https://www.letskodeit.com/practice");
		d4.manage().window().maximize();
		
		// WebElement dropdown = d4.findElement(By.xpath("//select[@id='carselect']"));
		// Select s1 = new Select(dropdown);
		
		// s1.selectByValue("honda");
		
		// s1.selectByIndex(1);
		
		
		/* WebElement checkBoxDiv = d4.findElement(By.xpath("//div[@id = 'checkbox-example-div']"));
		
		List<WebElement> checkBoxes = checkBoxDiv.findElements(By.xpath("//input[@type = 'checkbox']"));
		
		for(WebElement e1 : checkBoxes) {
			String val = e1.getAttribute("value");
			
			if(val.equals("benz") || val.equals("honda")) {
				e1.click(); 
			}else {
				continue;
			}
		}   */
		
		
		
		
		
		
	} 

}
