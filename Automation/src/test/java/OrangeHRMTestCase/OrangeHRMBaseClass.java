package OrangeHRMTestCase;

// Trying to automate project  


import org.openqa.selenium.By;

import ComOrangeHRMBasaClass.FluientWaitClas;
import ComOrangeHRMBasaClass.LaunchBrowser;
import ComOrangeHRMBasaClass.LoginPage;
import ComOrangeHRMBasaClass.LogoutPage;

public class OrangeHRMBaseClass {

	public static void main(String[] args) throws InterruptedException {

		LaunchBrowser.lunchBrowser("Chrome", "https://opensource-demo.orangehrmlive.com/", "null");
		FluientWaitClas.FluientWait(By.xpath("//input[@id='btnLogin']"));

		LoginPage.PageSignin(By.xpath("//input[@id='txtUsername']"), "admin123",

				By.xpath("//input[@id='txtPassword']"), "@Manager123", By.xpath("//input[@id='btnLogin']"));

		FluientWaitClas.FluientWait(By.id("welcome")); // Validation Link X path

		LogoutPage.pageLogOut(By.id("welcome"), By.xpath("//a[contains(text(),'Logout')]"));

		FluientWaitClas.FluientWait(By.xpath("//input[@id='btnLogin']"));
		LaunchBrowser.driver.quit();

	}
}
