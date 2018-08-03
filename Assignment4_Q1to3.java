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
import java.util.Scanner;
import java.util.Map.Entry;

public class Assignment4_Q1to3 {

	public static void main(String[] args) {
	//INITIALIZING HASHMAP "COLORS" FOR QUESTION 1 & 2
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
			
	//CALLING MENU
			printMenu();
			
	//INITIALIZING HASHMAP "cart"
			HashMap<String, Integer> cart = new HashMap<String, Integer>();
			
	//INITIALIZING KEYS & VALUES TO HASHMAP "CART"
			cart.put("Hamburgers", 0);
			cart.put("Hot Dog", 0);
			cart.put("Sandwiches", 0);
			cart.put("Soda" , 0);
			cart.put("Fries", 0);
			System.out.println("--------------------------");
		
	//INSTRUCTIONS FOR USER
			Scanner reader = new Scanner(System.in);
			System.out.println("\r\nWelcome to BurgerDonalds!");
			System.out.println("1. Make a purchase?");
			System.out.println("2. Exit");
			System.out.println("What would you like to do?");
			Integer choice = reader.nextInt();
		
	//PARSE CHOICE FROM USER
			if (choice != 1 && choice != 2) {
				System.out.println("Not sure what you mean?");
				System.out.println("Goodbye, have a nice day!");
				reader.close();
			} else if (choice == 2) {
				System.out.println("Goodbye, have a nice day!");
				reader.close();
			} else if (choice == 1) {
				int counter = 0;
					while(counter == 0) {
						System.out.println("\r\nWhat item would you like to buy/add to cart? "
						+ "(\r\nTell me the number from the menu or press 6 to EXIT/CHECKOUT)");
						Integer buy = reader.nextInt();
				
		//PARSE ITEM CHOICE FROM USER, CONTINUES TO WHILE LOOP FROM ABOVE UNTIL USER IS FINISHED
						switch (buy) {
						case 1: System.out.println("Added Hamburger to your cart");
								String addHamburgers = "Hamburgers";
								int HamburgerCount = cart.getOrDefault(addHamburgers, 0);
								cart.put(addHamburgers, HamburgerCount + 1);
								printCart(cart);
								break;
								
						case 2: System.out.println("Added Hot Dogs to your cart");
								String addHotDog = "Hot Dogs";
								int hotDogCount = cart.getOrDefault(addHotDog, 0);
								cart.put(addHotDog, hotDogCount  + 1);
								printCart(cart);
								break;
								
						case 3: System.out.println("Added Sandwiches to your cart");
								String addSandwiches = "Sandwiches";
								int SandwichesCount = cart.getOrDefault(addSandwiches, 0);
								cart.put(addSandwiches, SandwichesCount  + 1);
								printCart(cart);
								break;
								
						case 4: System.out.println("Added Soda to your cart");
								String addSoda = "Soda";
								int SodaCount = cart.getOrDefault(addSoda, 0);
								cart.put(addSoda, SodaCount  + 1);
								printCart(cart);
								break;
								
						case 5: System.out.println("Added Fries to your cart");
								String addFries = "Fries";
								int FriesCount = cart.getOrDefault(addFries, 0);
								cart.put(addFries, FriesCount  + 1);
								printCart(cart);
								break;
								
						case 6: System.out.println("--------------------------");
								printCart(cart);
								System.out.println("\r\nYour cart details are displayed above");
								System.out.println("You can check pay at the counter.");
								System.out.println("Thank you for shopping!");
								counter = 1;
								break;
						}
					}
			}
	} // main bracket	
	
	//PRINTS CART
	protected static void printCart(HashMap<String, Integer> map) {
		System.out.println("\r\n-------YOUR CART----------");
		for (Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
		    Integer value = entry.getValue();
			System.out.println(key + " = " +value);
		}
	}

	//PRINTS MENU
	static void printMenu() {
		System.out.println("\r\n----BURGERDONALDS MENU----");
		System.out.println("1. Hamburgers");
		System.out.println("2. Hot Dogs");
		System.out.println("3. Sandwiches");
		System.out.println("4. Soda");
		System.out.println("5. Fries");
	}
}
