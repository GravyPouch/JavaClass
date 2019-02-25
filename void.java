
package testing;

import java.util.*;

public class test2 {
	
	   void countdownFrom(int one, int two, int three, int four, int five, int range)
	    {
		   int[] numbers = new int[6];
		   numbers[1] = one;
		   numbers[2] = two;
		   numbers[3] = three;
		   numbers[4] = four;
		   numbers[5] = five;
		   
		   for (int x=0; x <= range-1; x++) {
			   try {
				   System.out.println(numbers[x]);
			   
			   
		   }
			  catch (ArrayIndexOutOfBoundsException e) {
				  System.out.println("You out of range.");
			  }
		   }
		
			

	    
	    }

	public static void main(String[] args) {
		
		test2 run = new test2();
		Scanner console = new Scanner(System.in);
		 System.out.println("whats your number");
		int range = console.nextInt();
		 System.out.println(range);
	    run.countdownFrom(1,2,3,4,5,range);
	    
	}
}
