package middle;

import java.util.ArrayList;
import java.util.Arrays;

public class NewEP {

	public static void main(String[] args) { //task 2
		
		ArrayList <Integer> listNumbers = new ArrayList <Integer>();
		listNumbers.addAll(Arrays.asList(3, 2, 1, 5, 4, 6));
		System.out.println("the order list is: " + orderListNumber(listNumbers));

	}

	private static ArrayList <Integer> orderListNumber(ArrayList <Integer> listNumbers) {
		for (int i = 0;i < listNumbers.size()-1;i++) {
			for(int j = 1;j < (listNumbers.size()-i);j++) {
				if(listNumbers.get(j-1) >= listNumbers.get(j)) {
					Integer tempi,tempi1;
					tempi = listNumbers.get(j-1);
					tempi1 = listNumbers.get(j);
					listNumbers.set(j-1, tempi1);
					listNumbers.set(j,tempi);
				}
			}
		}
		return listNumbers;
	}

}
