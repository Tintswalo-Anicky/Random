package random;
/**
 *
 * @author Tintswalo Anicky Makhubele
 * This program generate and print 5 random numbers between 1 and 100.
 */
public class Random {

    public static void main(String[] args) {
        //numbers range
        int max = 100, min = 1;
      
        System.out.println("Random Numbers between 1 and 100 "); 
        
        //Below code would generate and print 5 random numbers  between 1 and 100.
     
        for (int counter = 0; counter < 5; counter++) {
            
            System.out.println(min + (int)(Math.random()*((max - min)+ 1)));
          }
    }
    
}
