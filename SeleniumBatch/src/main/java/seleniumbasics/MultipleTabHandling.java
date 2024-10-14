package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		driver.manage().window().maximize();
		
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		WebElement newTab=driver.findElement(By.xpath("//button[text()='New Tab']"));
		newTab.click();
		Set<String> allWindows=driver.getWindowHandles();
		for(String childWindow:allWindows)
		{
			if(!parentWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				String newHandle=driver.getWindowHandle();
				System.out.println(newHandle);
				WebElement tabText=driver.findElement(By.xpath("//div[@class='row d-flex justify-content-center logindiv bg-white rounded']"));
				System.out.println(tabText.getText());	
			}	
		}
		//driver.switchTo().window(parentWindow); 
			

	}

}
