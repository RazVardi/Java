package advance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) { //task 2

		File file = new File("C:\\Users\\Raz Vardi\\OneDrive\\Desktop\\Automation\\gal matalon automatomation college\\homework\\myfile.txt");
		//NOTE - YOU MAY NEED TO CHANGE THE ADDRESS IN YOUR COMPUTER
		String st = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			 try {
				while ((st = br.readLine()) != null) {				 
				        // Print the string
					if(st.contains("Raz Vardi") && !st.contains("\n")) {
						System.out.println(st);
					}
				 }
				 br.close();
				 
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
}