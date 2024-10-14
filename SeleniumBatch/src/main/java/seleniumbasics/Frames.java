package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		//step1 : switch to frame
		//driver.switchTo().frame("frame1");  //switch to frame1 using name or id
		WebElement iframeElement=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(iframeElement);  //switch to frame using webelement
		
		
		//step 2 :action
		WebElement frameHeading=driver.findElement(By.id("sampleHeading")); 
		System.out.println(frameHeading.getText());
		
		//step 3: back to main frame
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent(); 

	}   

}
