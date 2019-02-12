package testing;

import java.util.*;

public class fib {
	//Sets some varibles to 0 for use later
	int x = 0;
	int y = 0;
	int z = 0;
	//String that contains the alphabet

	
	void fibby(){
		System.out.println("Number!");
        Scanner console = new Scanner(System.in);
		//prombts user for text
        int input = console.nextInt();
		//converts it into lowercase
       
		for (int y=0; y <= input; y++) {
			x = x+y;
			System.out.println(x);
	
			}
		}
//this just runs the script
	public static void main(String[] args) {
		
		fib run = new fib();
	    run.fibby();
		
		
	}	
	
}
