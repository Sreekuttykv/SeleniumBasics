package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php"); 
		driver.manage().window().maximize();
		
		WebElement clickme=driver.findElement(By.xpath("//button [@class='btn btn-success']"));
		clickme.click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		
		WebElement clickMeWarning=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickMeWarning.click();
		driver.switchTo().alert().dismiss();
		
		WebElement clickMeDanger=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickMeDanger.click();
		driver.switchTo().alert().sendKeys("abc");
		driver.switchTo().alert().dismiss();
		
	}

}
