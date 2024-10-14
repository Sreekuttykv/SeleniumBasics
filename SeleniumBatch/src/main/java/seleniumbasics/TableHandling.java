package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		List<WebElement> heading=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));
		System.out.println();
		for(int i=0;i<heading.size();i++)
		{
			System.out.print(heading.get(i).getText()+"  ");
		}
		
		List<WebElement> row1=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
		System.out.println();
		for(int i=0;i<row1.size();i++)
		{
			System.out.print(row1.get(i).getText()+"  ");
		}
		
		List<WebElement> col1=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
		System.out.println();
		for(int i=0;i<col1.size();i++)
		{
			System.out.println(col1.get(i).getText()+"  ");
		}
		WebElement element=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(element.getText());
	
	}

}
