import java.util.Scanner;
import java.util.Arrays; 

public class DisplayArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int [] displayArray = new int [10]; 

		System.out.print("Enter 10 numbers from 1 to 100: ");
		
		for (int i = 0; i < 10; i++) {
			displayArray[i]=sc.nextInt();
		}
	
		System.out.println("Content of displayArray: " + Arrays.toString(displayArray));	
		
		int maximum = displayArray[0];   
		
		for (int i = 0; i < displayArray.length; i++) {
			if (displayArray[i] > maximum) {
				maximum = displayArray[i];   
			}
		}
     
		System.out.println("The largest value of displayArray is: " + maximum);
    
		sc.close();
	}
}


