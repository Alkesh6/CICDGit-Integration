package basicTest.BasicUIOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class myFirstTest{
	public static void main(String[] args) {
		
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com/");
		d1.manage().window().maximize();
		System.out.println(d1.getTitle());
		// System.out.println(d1.getCurrentUrl());
		// d1.close();
		// d1.quit();
		
		// d1.findElement(By.name("search_query")).sendKeys("Virat Batting");
		// d1.findElement(By.className("yt-icon-shape ytSpecIconShapeHost")).click();
		
		// d1.findElement(By.linkText("Gmail")).click();
		 d1.findElement(By.className("gLFyf")).sendKeys("ipl");
		 d1.findElement(By.className("gLFyf")).submit();
		
		// Using tag name
		// System.out.println(d1.findElements(By.tagName("a")).size());
		
		// Using xpath
		// d1.findElement(By.xpath("//a[@class = 'gb_4']")).click();
		
		// d1.findElement(By.xpath("//textarea[@title = 'Search']")).sendKeys("mi vs csk");
		// d1.findElement(By.xpath("//input[@class = 'gNO89b']")).click();
		
		//Using CSS Selectors
		//d1.findElement(By.cssSelector("a[data-pid = '2']")).click();
		
		d1.quit();
	}
	
}