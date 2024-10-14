package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSeleniumClass {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\SREEKUTTY K V\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.javatpoint.com/selenium-tutorial"); // it wait until the page load,not keeping the history
		// driver.navigate().to("https://www.javatpoint.com/selenium-tutorial"); //it doesn't wait until the page load but keep the history
		driver.manage().window().minimize();
		driver.manage().window().maximize();

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);

		String pageUrl = driver.getCurrentUrl();
		System.out.println(pageUrl);

		String src = driver.getPageSource();
		System.out.println(src);

		// driver.close(); //to close the current tab
		driver.quit(); // to close the entire window    */

		driver = new FirefoxDriver();
		driver.get("https://www.google.com/search?client=firefox-b-d&q=google");
		driver.manage().window().minimize();
		driver.manage().window().maximize();

		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();

		String pagetitle1 = driver.getTitle();
		System.out.println(pagetitle1);

		String pageUrl1 = driver.getCurrentUrl();
		System.out.println(pageUrl1);

		String src1 = driver.getPageSource();
		System.out.println(src1);
		
		driver.close();
		
		
		
		driver =new EdgeDriver();
		driver.get("https://chatgpt.com/");
		driver.navigate().to("https://chatgpt.com/");
		
		driver.manage().window().maximize();
		
		
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String pagetitle2=driver.getTitle();
		System.out.println(pagetitle2);
		
		String pageurl2=driver.getCurrentUrl();
		System.out.println(pageurl2);
		
		String src2=driver.getPageSource();
		System.out.println(src2);
		
		driver.close();
		

	}

}
