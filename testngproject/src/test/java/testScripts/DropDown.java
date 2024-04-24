package testScripts;

import static org.testng.Assert.assertTrue;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends Base  {
	
	@Test
	public void varifySelectInputDemo() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selectsingledropdownlist=new Select(dropDown);
		selectsingledropdownlist.selectByValue("Red");
		selectsingledropdownlist.selectByVisibleText("Yellow");
		selectsingledropdownlist.selectByIndex(3);
		
		WebElement selectMultiple=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select selectForMultiple=new Select(selectMultiple);
		List <WebElement> options=selectForMultiple.getOptions();
		int size=options.size();
		boolean isMultipleSelectionpossible=selectForMultiple.isMultiple();
		selectForMultiple.selectByValue("Red");
		selectForMultiple.selectByValue("Yellow");
		
		}
	@Test
	public void findElementsSample()
	{
		driver.navigate().to("https://www.selenium.dev");
		WebElement languageDropdown=driver.findElement(By.xpath("//div[@class='dropdown']//a[contains(@class,'dropdown-toggle')]"));
		languageDropdown.click();
		List<WebElement> dropdownOption=driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//child::a"));
		for(WebElement option:dropdownOption)
		{
			String textOfOption=option.getText();
			if(textOfOption.equals("Other"))
			{
				option.click();
				break;
			}
		}
	}	
	
}
