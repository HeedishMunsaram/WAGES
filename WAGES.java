import java.util.Scanner;
  
 

/**
 * @author Andish
 *
 */
public class WAGES {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner myKeyboard = new Scanner(System.in);	
    
    final double RATE = 10.0;
    final int STANDARD = 40;
    double pay = 0;
    System.out.println("Number of hours worked: ");
    int hours = myKeyboard.nextInt();
    
    if (hours > STANDARD){
    	pay = STANDARD*RATE + (hours-STANDARD) * (RATE*1.5);
    }	
    else {				
    	pay = hours * RATE;
    }	
    System.out.println("Pay: " + pay);
    

	}

}
