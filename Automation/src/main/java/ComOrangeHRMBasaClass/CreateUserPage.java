package ComOrangeHRMBasaClass;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class CreateUserPage {

	@SuppressWarnings("deprecation")
	public void CreateUser() throws Exception {

		FluientWaitClas.FluientWait(By.xpath("//b[contains(text(),'PIM')]"), 10);
		LaunchBrowser.driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();

		List<String> list = new ArrayList<>();
for(int i = 0 ; i < 10 ; i ++ ) {
		FluientWaitClas.FluientWait(By.xpath("//a[@id='menu_pim_addEmployee']"), 10);
		LaunchBrowser.driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click(); // to click to add user
																								// madule

		String fristName = RandomString.GeneratingRandomString();
		System.out.println(fristName);

		FluientWaitClas.FluientWait(By.xpath("//input[@id='firstName']"), 10);
		LaunchBrowser.driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fristName);

		String lastName = RandomString.GeneratingRandomString();
		System.out.println(fristName);
		
		FluientWaitClas.FluientWait(By.xpath("//input[@id='lastName']"), 10);
		LaunchBrowser.driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastName);

		list.add(fristName + " " + lastName);

		System.out.println("User added successfully" + list.get(i));
		
		FluientWaitClas.FluientWait(By.xpath("//input[@id='btnSave']"), 10);
		LaunchBrowser.driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		
}

for (int i =0 ; i<list.size();i++) {
		

		FluientWaitClas.FluientWait(By.xpath("//b[contains(text(),'PIM')]"), 10);
		LaunchBrowser.driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		System.out.println("1");

		Thread.sleep(2000);
		FluientWaitClas.FluientWait(By.xpath("//input[@id='empsearch_employee_name_empName']"), 10);
		LaunchBrowser.driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']"))
				.sendKeys(list.get(i));
		System.out.println("2");

		//Thread.sleep(2000);

		FluientWaitClas.FluientWait(By.xpath("//input[@id='searchBtn']"), 10);
		LaunchBrowser.driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		System.out.println("3");

		Thread.sleep(2000);

		if (LaunchBrowser.driver.getPageSource().contains(list.get(i))) {
			System.out.println(list.get(0) + "user is present");
		}
}
		// LaunchBrowser.driver.quit();

	}

}
