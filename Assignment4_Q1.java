/*	WEEK 6 ASSIGNMENT 4 - HASHMAPS
	1.	KEY,VALUE PAIRS
	Create a new HashMap consisting of an Integer Key and String value.
	Add 5 colors to the HashMap as values. The Keys should be numbers from 1-5.
	
	Print out all Keys in the HashMap.
	Print out all Values in the HashMap.
	
	Try setting the value of one of the keys to something new.
	Print out all keys again.
	Print out all values again.
	
	Did anything change? Why?
*/


//		---------------------------------------------------------------------------------------------------


package week6_A4_HASHMAPS;

import java.util.HashMap;

public class Assignment4_Q1 {

	public static void main(String[] args) {

		HashMap<Integer, String> colors = new HashMap<Integer, String>();
		
		//ADDING KEYS & VALUES TO HASHMAP "COLORS"
		colors.put(1,"Red");
		colors.put(2, "Green");
		colors.put(3,"Blue");
		colors.put(4, "White");
		colors.put(5, "Black");
		
		//PRINTING OUT KEYS OF COLORS' HASHMAP
		System.out.println("Key set : " + colors.keySet());
		//PRINTING OUT VALUES OF COLORS' HASHMAP
		System.out.println("Value set : " + colors.values());
		//PRINTING OUT KEYS & VALUES OF COLORS' HASHMAP
		System.out.println("Entry set : " + colors.entrySet());
		
		System.out.println("\r\nTRY SETTING THE VALUE OF ONE OF THE KEYS TO SOMETHING NEW");
		System.out.println("Assigning key 5 to \"Yellow\"");
		colors.put(5, "Yellow");
		
			System.out.println("\r\nPRINTING OUT NEW KEYS & VALUES OF COLORS' HASHMAP");
			System.out.println("Entry set : " + colors.entrySet());
		
			System.out.println("\r\nDID ANYTHING CHANGE? WHY?");
			System.out.println("\r\nResponse: Yes, the new value for that key in question has "
						+ "\r\nbeen overridden. This is because there can only be one key, "
						+ "\r\nno duplicates but on the other hand, there can be many keys "
						+ "\r\nof the same value, this is how hashmaps work.");
		
		
	}
}
