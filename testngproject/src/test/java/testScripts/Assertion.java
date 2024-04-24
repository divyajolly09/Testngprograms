package testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class Assertion extends Base {
	@Test
	public void verifyBackgroundColourOfGetTotalButton()
	{  
		String expectedBackGroundColour="#007bff";
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean isGetTotatlButtondIsDisplayed=getTotalButton.isDisplayed();
		assertTrue(isGetTotatlButtondIsDisplayed, "GetTotal button is not available");
		String backgroundColorString = getTotalButton.getCssValue("background-color");
		String convertRGBToHEx = Color.fromString(backgroundColorString).asHex();
		assertEquals(expectedBackGroundColour, convertRGBToHEx,"Background colour of GetTotal button is not "+expectedBackGroundColour);
	}
	@Test
	public void verifyborderColourOfGetTotalButton()
	{
		String expectedBoarderColour="#007bff";
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean isGetTotatlButtondIsDisplayed=getTotalButton.isDisplayed();
		assertTrue(isGetTotatlButtondIsDisplayed, "GetTotal button is not available");
		String borderColorString = getTotalButton.getCssValue("border-color");
		String convertRGBToHEx = Color.fromString(borderColorString).asHex();
		assertEquals(expectedBoarderColour, convertRGBToHEx,"Boardercolour of GetTotal button is not "+expectedBoarderColour);	
	}
	@Test
	public void verifyFontSizeOfGetTotalButton()
	{
		String expectedFontColour="16px";
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean isGetTotatlButtondIsDisplayed=getTotalButton.isDisplayed();
		assertTrue(isGetTotatlButtondIsDisplayed, "GetTotal button is not available");
		String fontSizeString = getTotalButton.getCssValue("font-size");
		assertEquals(expectedFontColour, fontSizeString,"Fontsize of GetTotal button is not"+expectedFontColour);
	}
	@Test
	public void assertExample()
	{
		
		int a=5;
		int b=6;
		String c=null;
		String d="Divya";
		assertNotEquals(a,b," A and B are equal");
		assertNull(c,"c is not null");
		assertNotNull(d,"D is null");
		
	}
}
