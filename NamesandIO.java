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
		String[] names = new String[10];
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		 System.out.print("What is your name ");
		String name = scanner.next();
		String s = null;
		FileWriter fw = new FileWriter(f,true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    int flag = 0;
		for(int x = 0; x < 9; x++) {
			 s = bufferedReader.readLine();
			 name = name.replaceAll("[^a-zA-Z0-9]","");
			 s = s.replaceAll("[^a-zA-Z0-9]","");
			 if(s.contains(name) == true) {
			System.out.print("Your name is here. boi");
			flag = 1;
				 }
			 else {
				 names[x] = s;
			       
			 }
	      
			
		       
		       
		    
		 
	}
		if(flag != 1) {
			bw.newLine();
			names[9] = name;
		       bw.write(name); 
		}
		else {}

System.out.println(Arrays.toString(names));
		bw.close();

}


}
