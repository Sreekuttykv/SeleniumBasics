package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php"); 
		driver.manage().window().maximize();
		WebElement radioButton=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		radioButton.click();
		boolean checkSelected=radioButton.isSelected();
		System.out.println(checkSelected);

	}

}
