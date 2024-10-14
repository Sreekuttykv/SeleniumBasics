package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleForm {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message.sendKeys("Welcome");
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessage.click();
		WebElement outputMessage=driver.findElement(By.xpath("//div[text()='Your Message : Welcome']"));
		String output=outputMessage.getText();
		System.out.println(output);
		
		WebElement valueA=driver.findElement(By.xpath("//input[@id='value-a']"));
		valueA.sendKeys("25");
		WebElement valueB=driver.findElement(By.xpath("//input[@id='value-b']"));
		valueB.sendKeys("13");
		WebElement getTotal=driver.findElement(By.xpath("//button[text()='Get Total']"));
		getTotal.click();
		WebElement resultMessage=driver.findElement(By.xpath("//div[@id='message-two']"));
		String result=resultMessage.getText();
		System.out.println(result);
		
	
		
		
	}

}
