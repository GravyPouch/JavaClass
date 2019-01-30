package projecto;

import java.util.*;

public class Inporto {
    //Sets some varibles to 0 for use later
    int x = 0;
    int y = 0;
    int z = 0;
    
    void code()  {
        double[] grades = new double[5];
         Scanner console = new Scanner(System.in);
        for (int x=0; x <= 4; x++) {
            System.out.println("Give me a Grade");
             double grade = console.nextDouble();
             grades [x] = grade;
            
            
            
            
        }
        System.out.println("These are all your grades: ");
        System.out.println(Arrays.toString(grades));
        double total = 0;
        for (int y=0; y <= 4; y++) {
            
        total = (total + grades[y]);
            
        }
        double diftotal = total;
        double shinytotal = (diftotal/5);
        System.out.println("You average grade is: ");
        System.out.println(shinytotal);
        
    }
    
    public static void main(String[] args) {
        
        Inporto run = new Inporto();
        run.code();
        
        
    }    
    
}
