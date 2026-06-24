package basicTest.BasicUIOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class advLocators{
	public static void main(String[] args) {
		
		WebDriver d2 = new ChromeDriver();
		
		// d2.get("https://www.google.com/");
		d2.get("https://codenboxautomationlab.com/practice/");
		// d2.manage().window().maximize();
		
		// 1.text() method
		// d2.findElement(By.xpath("//a[text() = 'Images']")).click();
		
		// 2. contains() method
		//  d2.findElement(By.xpath("//a[contains(@href, 'https://codenboxautomationlab.com/wp-login.php')]")).click();
		
		
		// 3. Parent - child relationship
		// d2.findElement(By.xpath("//*[@id='meta-4']//ul/li[2]/a")).click();
		
		// d2.get("https://toolsqa.com/selenium-webdriver/selenium-tutorial/");
		// d2.findElement(By.xpath("//a[@href='https://www.facebook.com/tools.qa']")).click();
		
		// Calculating sum of table rows
		int count = 0;
		WebElement table = d2.findElement(By.xpath("//table[@id='product']"));
		int rows = table.findElements(By.xpath(".//tbody//tr")).size();
		// System.out.print(rows);
		for(int i=1;i<rows-2;i++) {
			String num = table.findElements(By.xpath(".//tbody//tr//td[3]")).get(i).getText();
			int price = Integer.parseInt(num);
			count += price; 
		}
		System.out.print(count);
	
	
	}
	
}