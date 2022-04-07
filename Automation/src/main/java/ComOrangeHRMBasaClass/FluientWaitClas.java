package ComOrangeHRMBasaClass;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluientWaitClas {

	@SuppressWarnings("unchecked")
	public static void FluientWait( final By by) {

		@SuppressWarnings("rawtypes")
		Wait wait = new FluentWait<WebDriver>(LaunchBrowser.driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);

		wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver input) {
				System.out.println("Appling fluent wait ...");

				return LaunchBrowser.driver.findElement(by);

			}
		});

	}

}
