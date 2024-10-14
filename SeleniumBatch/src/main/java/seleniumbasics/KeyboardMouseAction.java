package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		driver.manage().window().maximize();
		
		Actions obj=new Actions(driver);
		WebElement doubleClickMe=driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		obj.doubleClick(doubleClickMe).perform();
		
		//rightclick
		WebElement rightClickMe=driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		obj.contextClick(rightClickMe).perform();
		
		//Mousehover
		WebElement clickMe=driver.findElement(By.xpath("//button[text()='Click Me']"));
		obj.moveToElement(clickMe).perform();
		
		obj.sendKeys(Keys.ARROW_DOWN).perform();        //arrowdown
		
		WebElement textMe=driver.findElement(By.xpath("//ul[@id='navMenus']//li[1]//a"));
		obj.moveToElement(textMe).perform();
		obj.sendKeys(Keys.ARROW_DOWN).perform();
		
		
		
		
		
		
	}

}
