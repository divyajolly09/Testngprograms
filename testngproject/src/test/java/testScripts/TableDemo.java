package testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TableDemo extends Base{
	@Test
	public void verifyRowHeadersInTable()
	{
		String expectedHeaders= "Name Position Office Age Start date Salary";
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableHeaders=driver.findElement(By.xpath("//tr[@role='row']"));
		String actualHeader=tableHeaders.getText();
		assertEquals(expectedHeaders,actualHeader,"Table header is not in expected seaquence "+expectedHeaders);
	}
	
	@Test
  public void verifyRowsAndColumInTable()
  {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		int expectedRowSize=10;
		int expectedColumSize=6;
		
		//verify   rows size in table		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//child::tr"));
		int rowSize = rows.size();
		assertEquals(expectedRowSize,rowSize,"no of rows in table is not equal to the expected result "+expectedRowSize);
		
		
		//verify colums size in table
		List<WebElement> columnsNumber = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
		int columCount=columnsNumber.size();
		assertEquals(expectedColumSize,columCount,"no of colums in table is not equal to the expected result "+expectedColumSize);
		 	
  }
	@Test
	public void verifyNameInTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String expectedName = "Ashton Cox";
		
		
		boolean checkFlag = false;
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr"));
		int rowCount = row.size();
		for(int i=0;i<rowCount;i++)
		{
			String actualName = row.get(i).getText();
			if(actualName.contains(expectedName))
			{
				checkFlag = true;
				break;
			}
		}
		assertTrue(checkFlag, "Name is not found in the table");
		}
}
