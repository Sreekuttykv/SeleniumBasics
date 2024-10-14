package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php"); 
		driver.manage().window().maximize();
		
		WebElement singleDropDown=driver.findElement(By.id("single-input-field"));
		Select obj=new Select(singleDropDown);
		obj.selectByIndex(3);   //select by using index number
		obj.selectByValue("Yellow");
		obj.selectByVisibleText("Green");
		
		//for printing selected options
		WebElement element=obj.getFirstSelectedOption();
		System.out.println(element.getText());
		
		WebElement multiSeleted=driver.findElement(By.id("multi-select-field"));
		Select multiObj=new Select(multiSeleted);
		for(int i=0;i<3;i++)
		{
			multiObj.selectByIndex(i);
			
			
		}
		
		List<WebElement> selectedElementList=multiObj.getAllSelectedOptions();
		for(int i=0;i<selectedElementList.size();i++)
		{
			System.out.println(selectedElementList.get(i).getText());
		}
		
		
	}

}
