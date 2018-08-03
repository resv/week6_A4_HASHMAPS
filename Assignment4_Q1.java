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
	
	2.	PRINTING OUT ONE-BY-ONE AGAIN
	Using the HashMap from part 1, print out each key,value pair one by one.
	Try it with an iterator and then with a For-Each loop.
	
//	3.	SIMPLE MENU
	Write a simple Restaurant Ordering Menu & Cart.
	The menu will contain 5 different items (Hamburgers, Hot Dogs, Sandwiches, Soda, and Fries).
	You should be able to add items to your cart.
	Your cart should be handled by a HashMap, consisting of the item as a key and the quantity as a value.
	Create a view order method that will display the items and quantities in your cart.
*/


//		---------------------------------------------------------------------------------------------------


package week6_A4_HASHMAPS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment4_Q1 {

	public static void main(String[] args) {

		HashMap<Integer, String> colors = new HashMap<Integer, String>();
	//1.KEY,VALUE PAIRS	
		System.out.println("----------------QUESTION 1. KEY,VALUE PAIRS----------------\r\n");
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
			System.out.println("RESPONSE: Yes, the new value for that key in question has "
						+ "\r\nbeen overridden. This is because there can only be one key, "
						+ "\r\nno duplicates but on the other hand, there can be many keys "
						+ "\r\nof the same value, this is how hashmaps work.");
		
	//2.PRINTING OUT ONE-BY-ONE AGAIN
			System.out.println("\r\n--------QUESTION 2. PRINTING OUT ONE-BY-ONE AGAIN---------");
			System.out.println("\r\nLOOPING USING AN ITERATOR : ");
			
			//INITIALIZING ITERATOR
			Iterator<Map.Entry<Integer, String>> iterator = colors.entrySet().iterator();
	        
			//WHILE LOOP TO ITERATE ITERATOR
	        while(iterator.hasNext()) {
	             Map.Entry<Integer, String> entry = iterator.next();
	             System.out.println("Key = " + entry.getKey() + 
	                                 ", Value = " + entry.getValue());
	        }
			
			
			System.out.println("\r\nLOOPING USING FOR EACH : ");
			for (Entry<Integer, String> entry : colors.entrySet()) {
				Integer key = entry.getKey();
			    String value = entry.getValue();
				
				System.out.println(key + " = " +value);
			}
			
	//3.SIMPLE MENU	
			System.out.println("\r\n----------------QUESTION 3.SIMPLE MENU--------------------");
			
			
			
	}
}
