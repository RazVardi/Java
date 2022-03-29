package new_classes_middle;

import java.util.Scanner;

public class Entry_Point { //task2

	public static void main(String[] args) {
		
			String browserColor;
			System.out.print("please enter a browser name: ");
			Scanner scanner = new Scanner(System.in);
			String input1 = scanner.next();
			input1 = input1.toLowerCase();
			
			if (input1.equals("firefox")) {
				browserColor = "blue";
			}
			else if (input1.equals("chrome")) {
				browserColor = "red";
			}
			else if (input1.equals("edge")) {
				browserColor = "yellow";
			}
			else {
				browserColor = "green";
			}
			
			Browser browser = new Browser(input1,browserColor);
			printBrowserData(browser);
			scanner.close();
		}

    private static void printBrowserData(Browser browser) {
    	System.out.println("The browser name is: " + browser.getName());
    	System.out.println("The browser color is: " + browser.getColor());
    }
}
