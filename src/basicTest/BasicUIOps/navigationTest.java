package basicTest.BasicUIOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class navigationText{
	public static void main(String[] args) throws InterruptedException {
		WebDriver d3 = new ChromeDriver();
		
		// 1st visit
		d3.get("https://www.google.com");
		System.out.println("Title after first visit : "+d3.getTitle());
		
		// 2nd visit
		d3.get("https://www.youtube.com/");
		System.out.println("Title after second visit : "+d3.getTitle());
		
		//navigate
		d3.navigate().back();
		Thread.sleep(3000l);
		
		//3rd Visit
		System.out.println("Title after third visit : "+d3.getTitle());
		
		//navigate forward
		d3.navigate().forward();
		Thread.sleep(3000l);
		
		// 4th visit
		System.out.println("Title after fourth visit : "+d3.getTitle());
	}
}