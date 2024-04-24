package testScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PopupHandling extends Base {
	@Test
	public void handlingPopup()
	{
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement likeUsOnFacebook = driver.findElement(By.xpath("//a[contains(@class,'windowSingle')]"));
		likeUsOnFacebook.click();
		String mainWindow=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		Iterator<String> i1=allWindows.iterator();	
		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!mainWindow.equalsIgnoreCase(ChildWindow))			
            {                 
              // Switching to Child window
                driver.switchTo().window(ChildWindow);
                WebElement login = driver.findElement(By.xpath("//form[@id='login_popup_cta_form']//div[@aria-label='Accessible login button']"));
            	login.click();
            	driver.close();
            }
        }
        driver.switchTo().window(mainWindow);        
	}

}
