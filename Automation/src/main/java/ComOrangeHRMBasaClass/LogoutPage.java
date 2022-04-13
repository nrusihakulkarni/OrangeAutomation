package ComOrangeHRMBasaClass;

import org.openqa.selenium.By;

public class LogoutPage {

	public static void pageLogOut(By validate, By ougOutXpath) throws InterruptedException {

		//FluientWaitClas.FluientWait(validate , 15);
		LaunchBrowser.driver.findElement(validate).click();
		
		FluientWaitClas.FluientWait(ougOutXpath , 15);
		LaunchBrowser.driver.findElement(ougOutXpath).click();
	}

}
