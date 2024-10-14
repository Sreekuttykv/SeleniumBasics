package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php"); 
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		element.click();
		boolean checkSelected=element.isSelected();
		System.out.println(checkSelected);
		

	}

}
