package OrangeHRMTestCase;

// Trying to automate project  

import org.openqa.selenium.By;

import ComOrangeHRMBasaClass.CreateUserPage;
import ComOrangeHRMBasaClass.FluientWaitClas;
import ComOrangeHRMBasaClass.LaunchBrowser;
import ComOrangeHRMBasaClass.LoginPage;

public class OrangeHRMBaseClass {

	public static void main(String[] args) throws InterruptedException {

		try {
			LaunchBrowser.lunchBrowser("Chrome", "https://opensource-demo.orangehrmlive.com/", "null");

			FluientWaitClas.FluientWait(By.xpath("//input[@id='btnLogin']"), 10);

			LoginPage.PageSignin(By.xpath("//input[@id='txtUsername']"), "admin",

					By.xpath("//input[@id='txtPassword']"), "admin123", By.xpath("//input[@id='btnLogin']"));

			// Thread.sleep(1000);
			FluientWaitClas.FluientWait(By.id("welcome"), 10); // Validation Link X path

			CreateUserPage caCreateUserPage = new CreateUserPage();

			caCreateUserPage.CreateUser();

			/*
			 * LogoutPage.pageLogOut(By.id("welcome"),
			 * By.xpath("//a[contains(text(),'Logout')]")); LaunchBrowser.driver.quit();
			 */

		} catch (Exception e) {

			System.err.println("TestCase Get Fail");
			LaunchBrowser.driver.close();

		}

	}
}

//usr name : admin123 pass : @Manager123