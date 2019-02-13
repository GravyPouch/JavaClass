package testing;

import java.util.*;

public class fib {
	//Sets some varibles to 0 for use later
	int x = 1;
	int y = 0;
	int z = 0;
	int sum = 0;
	//String that contains the alphabet

	
	void fibby(){
		System.out.println("Number!");
        Scanner console = new Scanner(System.in);

        int input = console.nextInt();

        int[] sequence = new int[input];
        
		for (int y=0; y < input; y++) {
			sum = x + z;
			sequence [y] = x;
			z = x;
			x = sum;
	
			}
		System.out.println("Bingo Bango you have a:");
		System.out.println(sequence[input-1]);
		}
//this just runs the script
	public static void main(String[] args) {
		
		fib run = new fib();
	    run.fibby();
	   
		
		
	}	
	
}
