
package School;

import java.util.Scanner;

public class Colors
{
	public static void otherdata() {
		String[] Colors = {"White", "Black", "Red", "Green", "Blue", "Cyan", "Yellow", "Pink", "Grey", "Orange"};
	      
		  int arrayLength = Colors.length;
		  int max = arrayLength - 1; 
	      int min = 1; 
	      int range = max - min + 1; 
		  int rand = (int) ((Math.random() * range) + min); 
		
		  
		String rancolor = Colors[rand];
	  
		  
		boolean correct = false;
		boolean flag = false;
		Scanner scan = new Scanner(System.in);
		
		while(correct == false) {
			
			System.out.print("Guess a color ");
	 		
			String usercolor = scan.next();
	 		
	 		if(usercolor.equals(rancolor)) {
	 			System.out.print("you win!!!");
	 			correct = true;
	 		}else {
	 		for(int x = 0; x <= arrayLength-2;x++) {
	 			
	 			if(flag == false) {
	 			
	 			if(Colors[x].equals(usercolor)) {	
	 		System.out.println("Color is an option in the list.");
	 		flag = true;
	 		}else {
	 			flag = false;
	 		}
			 
			
	 		}
	 		}
	 		
	 		}
	 		} 
		  
	     
	      
		
	}
	
	
  public static void main(String[] args)
  {
	  
	  otherdata();
	  
/*
 Create a array of colors.  

Pick a random color from the array.  

Have user guess a color. 

1st verify if the input is a color from the list.  

2nd check to see if it is the random color picked.  

Run until user picks correct color.  */
    
   }
  }

