package Com.AmazonFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import ComOrangeHRMBasaClass.LaunchBrowser;

public class SelectClass extends LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		try {
			LaunchBrowser.lunchBrowser("Chrome", "https://www.amazon.in/", null);

			Thread.sleep(100);

			Select select = new Select(LaunchBrowser.driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));

			select.selectByVisibleText("Electronics");
			
			FindAmazonElements.AmazonElements();

			
		} catch (Exception e) {
			System.err.println();
			LaunchBrowser.driver.close();
		} finally {
			LaunchBrowser.driver.close();
		}
	}

}
