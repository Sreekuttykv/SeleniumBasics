package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload/");
		driver.manage().window().maximize();
		
		WebElement fileUpload=driver.findElement(By.id("uploadfile_0"));
		//fileUpload.sendKeys("C:\\Users\\SREEKUTTY K V\\Desktop\\Bank.xlsx");
		Actions obj=new Actions(driver);
		obj.moveToElement(fileUpload).click().perform();
		StringSelection ss = new StringSelection("C:\\Users\\SREEKUTTY K V\\Desktop\\Bank.xlsx");
  	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
  	   Robot robot = new Robot();
	     robot.delay(500);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.delay(500);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.delay(500);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     

  	     
  	     
  	     
		
		
		
		
	}

}
