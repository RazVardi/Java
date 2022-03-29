package basic;

import java.util.ArrayList;
import java.util.Arrays;

public class NewApp {

	public static void main(String[] args) { //task 2
		
		ArrayList <Integer> listNumbers = new ArrayList <Integer>();
		listNumbers.addAll(Arrays.asList(3, 2, 1, 5, 4));
		System.out.println(findMaxNumber(listNumbers));
		System.out.println(findMinNumber(listNumbers));
	}

	private static Integer findMaxNumber(ArrayList <Integer> listNumbers) {
		
		Integer maxNumber = listNumbers.get(0);
		
		for (Integer integer : listNumbers) {
			if(maxNumber < integer) {
				maxNumber = integer;
			}
		}
		return maxNumber;
	}

	private static Integer findMinNumber(ArrayList <Integer> listNumbers) {
		
		Integer minNumber = listNumbers.get(0);
		
		for (Integer integer : listNumbers) {
			if(minNumber > integer) {
				minNumber = integer;
			}
		}
		return minNumber;
	}

}
