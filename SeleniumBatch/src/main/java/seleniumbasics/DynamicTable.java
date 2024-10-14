package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		List<WebElement> tableColumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		WebElement element;
		for(int i=0;i<tableColumn.size();i++)
		{
			if(tableColumn.get(i).getText().equals("Garrett Winters"))
			{
				String path="//table[@id='dtBasicExample']//tbody//tr["+(i+1)+"]//td[2]";
				System.out.println(path);
				element=driver.findElement(By.xpath(path));
				System.out.println(element.getText());
				break;
				
			}
		}
	}

}
