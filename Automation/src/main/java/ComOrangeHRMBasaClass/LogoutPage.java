package ComOrangeHRMBasaClass;

import org.openqa.selenium.By;

public class LogoutPage {

	public static void pageLogOut(By validate, By ougOutXpath) throws InterruptedException {

		LaunchBrowser.driver.findElement(validate).click();
		FluientWaitClas.FluientWait(ougOutXpath);
		LaunchBrowser.driver.findElement(ougOutXpath).click();
	}

}
