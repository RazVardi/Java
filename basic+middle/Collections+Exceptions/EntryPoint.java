package middle;

import java.util.HashMap;

public class Entry_Point { //task 1

	public static void main(String[] args) {
		
		HashMap <String, String> hmap = new HashMap <String, String>();
		 hmap.put("Israel", "Jerusalem");
		 hmap.put("France", "Paris");
		 hmap.put("Germany", "Berlin");
		 hmap.put("Japan", "Tokyo");
		 hmap.put("USA", "Washington, D.C.");
		 System.out.println(hmap.get("Israel"));
	}

}
