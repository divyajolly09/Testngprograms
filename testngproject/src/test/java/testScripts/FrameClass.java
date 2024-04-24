
package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FrameClass extends Base {
	@Test
	public void frameSample()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e");
		WebElement frameImage=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		frameImage.click();
		
	}

}
