package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login"); 
		driver.manage().window().maximize();
		WebElement userNameField=driver.findElement(By.xpath("//input[@id='loginform-username']"));
		userNameField.sendKeys("ABCD");
		WebElement passwordField=driver.findElement(By.xpath("//input[@id='loginform-password']"));
		passwordField.sendKeys("1234");
		WebElement loginButton=driver.findElement(By.xpath("//button[text()='Login']"));
		loginButton.click();
		
		String fontSize=loginButton.getCssValue("font-size");
		System.out.println(fontSize);
		
		String attributeValue=loginButton.getAttribute("class");
		System.out.println(attributeValue);
		
		String tagName=loginButton.getTagName();
		System.out.println(tagName);
		
		String elementText=loginButton.getText();
		System.out.println(elementText);
		boolean loginEnable=loginButton.isEnabled();
		System.out.println(loginEnable);
		boolean loginDisplayed=loginButton.isDisplayed();
		System.out.println(loginDisplayed);
		
		//driver.quit();
		

	}

}
