package basic;

import java.util.ArrayList;
import java.util.Arrays;

public class App { //task 1

	public static void main(String[] args) {
		
		ArrayList <String> listOfContries = new ArrayList<String>();
		ArrayList <String> listOfContriesSorted = new ArrayList<String>();
		listOfContries.addAll(Arrays.asList("israel", "usa", "japan", "mexico", "australia"));
		for (String country : listOfContries) {
			System.out.println(country);
		}
		System.out.println("\n");
		listOfContriesSorted = (ArrayList <String> )sortArrayList(listOfContries);

		for (String country : listOfContriesSorted) {
			System.out.println(country);
		}
	}

	private static ArrayList <String>  sortArrayList(ArrayList <String> listOfContries) { //a i j m u
		
		ArrayList <String> sortedArrayList;
		sortedArrayList = (ArrayList <String> ) listOfContries.clone();
		for (int i = 0;i < listOfContries.size()-1;i++) {
			for(int j = 1;j <(listOfContries.size()-i);j++) {
				if(sortedArrayList.get(j-1).charAt(0) >= sortedArrayList.get(j).charAt(0)) {
					String tempi,tempi1;
					tempi = sortedArrayList.get(j-1);
					tempi1 = sortedArrayList.get(j);
					sortedArrayList.set(j-1, tempi1);
					sortedArrayList.set(j,tempi);
				}
			}
		}
		return sortedArrayList;
	}

}
