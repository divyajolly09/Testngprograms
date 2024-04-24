package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends Base{
	@Test
	public void actionsClassSample()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement dragOption1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dotbox=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(dragOption1).build().perform();
		actions.contextClick(dragOption1).perform();
		actions.doubleClick(dragOption1).perform();
		actions.dragAndDrop(dragOption1, dotbox).perform();
		
	}

}
