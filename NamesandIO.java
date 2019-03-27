package projecto;
//import stuff
import java.io.*;
import java.util.*;

public class named {
	//ads an exeption for IO errors.
public static void main (String[] args) throws IOException{
		//defines a scanner
		Scanner scanner = new Scanner(System.in);
		//Defines a file
		File f = new File("src/projecto/list.txt");
		//defines a array to store the names
		String[] names = new String[10];
		//drfines essentails to read files as strings and such
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		System.out.print("What is your name ");
		//takes name input
		String name = scanner.next();
		String s = null;
		//Defines essentials to right to files
		FileWriter fw = new FileWriter(f,true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    //defines a flag for later 
	    int flag = 0;
	    //starts a loop
		for(int x = 0; x < 9; x++) {
			//reads line
			 s = bufferedReader.readLine();
			 //this does nothing just dont want to risk removing it
			 name = name.replaceAll("[^a-zA-Z0-9]","");
			 s = s.replaceAll("[^a-zA-Z0-9]","");
			 //checks if name exists and makes a flag for it
			 if(s.contains(name) == true) {
			System.out.print("Your name is here. boi");
			flag = 1;
				 }
			 //otherwise adds names from file to the array
			 else {
				 names[x] = s;
			       
			 }
	      
			
		       
		       
		    
		 
	}//if the isnt checked then add new name to list and array
		if(flag != 1) {
			bw.newLine();
			names[9] = name;
		       bw.write(name); 
		}
		//otherwise do nothing
		else {}
//print array
System.out.println(Arrays.toString(names));
//close IO
		bw.close();

}


}
