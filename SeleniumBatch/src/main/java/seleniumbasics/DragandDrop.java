package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/drag-drop.php"); 
		driver.manage().window().maximize();
		
		WebElement sourceDraggableElement1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement targetElement=driver.findElement(By.id("mydropzone"));
		Actions actionobj=new Actions(driver);
		actionobj.dragAndDrop(sourceDraggableElement1, targetElement).perform();  
		
		WebElement sourceDraggableElement2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		actionobj.dragAndDrop(sourceDraggableElement2, targetElement).perform();
		
		WebElement sourceDraggableElement3=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		actionobj.dragAndDrop(sourceDraggableElement3, targetElement).perform();
		
		WebElement sourceDraggableElement4=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		actionobj.dragAndDrop(sourceDraggableElement4, targetElement).perform();
		
		

	}

}
