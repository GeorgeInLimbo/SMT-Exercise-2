package exercise2;

/****

<b>Title:</b> Numbers.java<br>
<b>Project:</b> exercise2<br>
<b>Description:</b> <br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author George Clam
@version 1.0
@since Jan 05 2023
@updates: ****/

public class Numbers {
	
	/**
	 * Executes all the methods in the class
	 * @param args
	 */
	public static void main(String[] args) {
		
		Numbers num = new Numbers();
		
		num.countToTen();
		System.out.println("");
		num.countFromTen();
		System.out.println("");
		num.evenNumbers();
	}
	
	/**
	 * Uses a while loop to count to ten.
	 */
	public void countToTen() {
		int counter = 1;
		System.out.println("This method counts to ten using a while loop!");
		while (counter < 11) {
			System.out.println(counter);
			counter++;
		}
	}
	
	/**
	 * Counts down from 10 using a for loop.
	 */
	public void countFromTen() {
		System.out.println("This method counts down from ten using a for loop!");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
	}
	
	/**
	 * Counts to twenty by twos using a for loop and an if statement
	 */
	public void evenNumbers() {
		System.out.println("This method counts to twenty by twos using a for loop and a if statement!");
		for (int i = 1; i < 21; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
