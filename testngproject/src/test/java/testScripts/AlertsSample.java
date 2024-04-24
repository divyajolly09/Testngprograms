package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertsSample extends Base {
	@Test
	public void  handlingaAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMeAlert=driver.findElement(By.xpath("//button[contains(@class,'btn-success')]"));
		clickMeAlert.click();
		String alertText=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		WebElement clickConfirmAlert=driver.findElement(By.xpath("//button[contains(@class,'btn-warning')]"));
		clickConfirmAlert.click();
		driver.switchTo().alert().dismiss();
		WebElement clickPromptAlert=driver.findElement(By.xpath("//button[contains(@class,'btn-danger')]"));
		clickPromptAlert.click();
		driver.switchTo().alert().sendKeys("Divya");
		driver.switchTo().alert().accept();
		
	}

}
