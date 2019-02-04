package projecto;

import java.util.*; 

public class order {
	//Sets some varibles to 0 for use later
	int x = 0;
	int y = 0;
	int z = 0;
	int best = 0;
	int best2 = 0;
	int best3 = 0;
	int best4 = 0;
	int best5 = 0;
	
	
	void code()  {
		int[] numbers = new int[5];
		 Scanner console = new Scanner(System.in);
		for (int x=0; x <= 4; x++) {
			System.out.println("Give me some numbers");
			 int number = console.nextInt();
			 numbers [x] = number;
			
		}
		System.out.println("These are all your numbers: ");
		System.out.println(Arrays.toString(numbers));
		for(int z=0; z <= 4; z++) {
		for (int y=0; y <= 4; y++) {
			System.out.println("-----------------");
			System.out.println(y);
			System.out.println(numbers[y]);
			
			if (numbers[y] > best5 && numbers[y] < best4){
				best5 = numbers[y];
		
				
			}		
			
			else if (numbers[y] > best4 && numbers[y] < best3 ){
				best4 = numbers[y];
				
				
			}		
			
			else if (numbers[y] > best3 && numbers[y] < best2 ){
				 best3 = numbers[y];
				
			}		
			
			else if (numbers[y] > best2 && numbers[y] < best){
				best2 = numbers[y];
					
				}	
			
			else if (numbers[y] > best){
				best = numbers[y];
	
				
					
				}	
			else {
				System.out.println("ERROR");
			}
		}
		}
		System.out.println("-----------------");
		System.out.println(best);
		System.out.println(best2);
		System.out.println(best3);
		System.out.println(best4);
		System.out.println(best5);
			
			
			//if (numbers[y] > numbers[z]) {
				//System.out.print(numbers[y] + "   " + numbers[z]);
				//System.out.println("");
			
				
				
				
				
				
			}
				 
				
			
				
			
		
	

		
	
	
	public static void main(String[] args) {
		
		order run = new order();
	    run.code();
		
		
	}	
	
}
































































//0100100100100000010100110111010001101111011011000110010100100000011101000110100001101001011100110010000001100011011011110110010001100101001000000110011001110010011011110110110100100000010001110110100101110100011010000111010101100010001011100110001101101111011011010010111101000111011100100110000101110110011110010101000001101111011101010110001101101000
