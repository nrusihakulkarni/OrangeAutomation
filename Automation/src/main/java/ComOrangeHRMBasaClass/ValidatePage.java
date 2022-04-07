package ComOrangeHRMBasaClass;

public class ValidatePage {

	public static void ContaintsOf(String actual, String excepated) {
		try {
			if (actual.contains(excepated)) {
				System.out.println(excepated + " page successfully launched ");
			} else {
				throw new Exception("invalid  page or url ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			LaunchBrowser.driver.close();
		} finally {
			LaunchBrowser.driver.close();
		}

	}
	
	public static void Equalsof (String actual, String excepated) {
		try {
			if (actual.equalsIgnoreCase(excepated)) {
				System.out.println(excepated + " page successfully launched ");
			} else {
				throw new Exception("invalid  page or url ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			LaunchBrowser.driver.close();
		} finally {
			LaunchBrowser.driver.close();
		}

	}

}
