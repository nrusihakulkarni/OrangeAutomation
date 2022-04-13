package Rrandom;

import ComOrangeHRMBasaClass.LaunchBrowser;

public class ValidateUser {

	public static void main(String[] args) {

		LaunchBrowser.lunchBrowser("Chrome", "https://www.facebook.com/", null);
		
		System.out.println(LaunchBrowser.driver.getPageSource().contains("connect"));
		
		if ( LaunchBrowser.driver.getPageSource().contains("connect"))
		{
			System.out.println("name is present");
		}
		
		
		
	}

}
