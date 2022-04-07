package ComOrangeHRMBasaClass;

import org.openqa.selenium.By;

public class LoginPage {

	public static void PageSignin(By userNameUXpath, String userName, By passwordXpath, String  password,
			By loginButtonXpath) throws InterruptedException   {
		
		//FluientWaitClas.FluientWait(By.xpath(loginButtonXpath));
	
		LaunchBrowser.driver.findElement(userNameUXpath).sendKeys(userName);
		LaunchBrowser.driver.findElement(passwordXpath).sendKeys(password);
	//Thread.sleep(1000);
		LaunchBrowser.driver.findElement(loginButtonXpath).click();
		
	
	}
}
