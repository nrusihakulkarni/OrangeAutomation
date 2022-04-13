package Com.AmazonFunction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ComOrangeHRMBasaClass.LaunchBrowser;

public class FindAmazonElements extends LaunchBrowser {

	 public static void AmazonElements() {

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("telivision");

		LaunchBrowser.driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		/*
		 * String tvLocator =
		 * "//div[starts-with(@class,'s-result-item ')]/descendant::"; List<WebElement>
		 * tvNames=driver.findElements(By.xpath(tvLocator+"h2/a/span"));
		 * 
		 * List<WebElement> tvPrice=driver.findElements(By.xpath(tvLocator+
		 * "span[@class='a-price']/span[2]/span[2]"));
		 */ 

		List<WebElement> getProductlist = driver.findElements(By.xpath("//h2/a/span[contains(text(),'TV')]"));
		List<WebElement> getPriselist = driver.findElements(By.xpath("//a/span/span/span[@class='a-price-whole' ]"));
		FindHighLowPrise findHighLowPrise = new FindHighLowPrise();
		findHighLowPrise.FindPrise(getProductlist, getPriselist);

	}
}
