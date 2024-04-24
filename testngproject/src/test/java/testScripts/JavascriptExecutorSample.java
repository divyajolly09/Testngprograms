package testScripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavascriptExecutorSample extends Base {
	@Test
	public void javascriptExecutorSample() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		js.executeScript("window.scrollBy(0,-350)", "");
		String name = "Divya Jolly";
		WebElement singleInputField =driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputField.sendKeys(name);
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		js.executeScript("arguments[0].click();", showMessageButton);
		WebElement showMessageText = driver.findElement(By.xpath("//div[@id='message-one']"));
		js.executeScript("arguments[0].scrollIntoView();", showMessageText);
		String yourMessageText = showMessageText.getText();
		String outputMessage = yourMessageText.replace("Your Message : ", "");
		
		assertEquals(outputMessage,name,"Expected name is not same as actual name  "+outputMessage);
	}

}
