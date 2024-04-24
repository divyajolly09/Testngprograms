package testScripts;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButton extends Base {
	@Test
	public void verifyTheFunctionalityOfRadioButtonField()
	{
		
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean isMaleRadioButtonSelected=maleRadioButton.isSelected();
		assertFalse(isMaleRadioButtonSelected,"Male radio button is selected");
		
		maleRadioButton.click();
		boolean isMaleRadioButtonSelected1=maleRadioButton.isSelected();
		assertTrue(isMaleRadioButtonSelected1,"Male radio button is not selected");
		
		WebElement FemaleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean isFemaleRadioButtonSelected=FemaleRadioButton.isSelected();
		assertFalse(isFemaleRadioButtonSelected,"Female radio button is selected");
		
		WebElement showSelectedValueButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValueButton.click();
		WebElement showMessegeText=driver.findElement(By.xpath("//div[@id='message-one']"));
		boolean isshowMessegeTextIsDisplayed=showMessegeText.isDisplayed();
		assertTrue(isshowMessegeTextIsDisplayed,"Show messege text is not displayed");
	}
}
	
	


