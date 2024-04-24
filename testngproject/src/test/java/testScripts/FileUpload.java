package testScripts;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class FileUpload extends Base{
	@Test	
	public void fileUploadSample()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile=driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		chooseFile.sendKeys("C:\\Divya\\gitlink.pdf");
	}
    @Test
    public void pdfToWord() throws AWTException
    {
    	driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
    	WebElement selectPdfButton=driver.findElement(By.xpath("//a[@id='pickfiles']"));
    	selectPdfButton.click();
    	StringSelection stringSelection = new StringSelection("C:\\Divya\\gitlink.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	    robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
    }
}
