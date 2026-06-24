package basicTest.BasicUIOps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		/* driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		// Implicit wait
		driver.findElement(By.name("q")).sendKeys("codenbox"+Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//h3[contains(text(),'Codenbox')]")).click(); */
		
		// Explicit wait
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium official website"+Keys.ENTER);
		
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement firstResult = w1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h3)[1]")));
		
		System.out.println("First result is : " + firstResult.getText());
		
		firstResult.click();
		
		
		
	}

}
