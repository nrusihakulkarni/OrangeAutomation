package Com.AmazonFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.WebElement;

class sortSalary implements Comparator<FindHighLowPrise> {

	@Override
	public int compare(FindHighLowPrise o1, FindHighLowPrise o2) {
		// TODO Auto-generated method stub
		return o1.prise - o1.prise;
	}
}

public class FindHighLowPrise {

	int prise;
	String productName;

	public FindHighLowPrise() {

	}

	public FindHighLowPrise(int prise, String productName) {
		super();
		this.prise = prise;
		this.productName = productName;
	}

	public void FindPrise(List<WebElement> getProductlist, List<WebElement> getPriselist) {

		List<FindHighLowPrise> list = new ArrayList<FindHighLowPrise>();

		
		System.out.println(String.format("%54s", "\n Name OF Product ")+String.format("%130s", "Prise ") + 
				"\n *************************************************************************************************************************************************************\n"); // for UI
		
		for (int i = 0; i < getProductlist.size(); i++) {

			list.add(new FindHighLowPrise(Integer.parseInt(getPriselist.get(i).getText().replace(",", "")),
					getProductlist.get(i).getText()));

			System.out.println(String.format(" %-140s", getProductlist.get(i).getText())+"|"
					+ String.format("%-20s", getPriselist.get(i).getText()));

		}

		Collections.sort(list, new sortSalary());

		System.out.println("************************************************************");
		System.out.println("\n lowest prise television    ::  " + list.get(0));
		System.out.println("\n Highest  prise television  ::  " + list.get((list.size() - 1)));

	}

	@Override
	public String toString() {
		return "FindHighLowPrise [prise =   " + prise + ", productName =   " + productName + "]";
	}

}