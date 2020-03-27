/*
 * @uthor - Abhishek Chohan
 * 
 * Algorithm to print Different Patterns of triangles.
 
 output :--> 
 
   *        *
   **      **
   ***    ***
   ****  ****
   **********
   ****  ****
   ***    ***
   **      **
   *        *
   
           
     *
    ***
   *****
  *******
 *********
***********



***********
 *********
  *******
   *****
    ***
     *   
 
*/

import java.util.Scanner;


public class Print_Algo_Pattern {
	
public static void Print_Right_Triangle(int SIZE, boolean invert) {
		
	for(int row = 1; row <= SIZE ; row++) {
		for(int j = row; j >= 1; j--) {
			System.out.print("*");
		}
		if(invert) {
			for(int loop=0; loop<=(2*SIZE - 1) - 2*row; loop++) {
			    System.out.print(" ");
			}
			for(int j = 1; j <= SIZE; j++) {
			    System.out.print((j <= row) ? "*" : "");
			}
		}
		System.out.println();
	}
}

public static void Print_Right_UpsideDown_Triangle(int SIZE, boolean invert) {
	
	for(int row = SIZE-1; row >= 1; row--) {
	    for(int j = row; j >= 1; j--) {
	        System.out.print("*");
	    }
	    if(invert) {
	    	
	    	for(int loop= (2*SIZE - 1) - 2*row; loop>=0; loop--) {
		        System.out.print(" ");
		    }
		    for(int j = row+1; j > 1; j--) {
		        System.out.print("*");
		    }
	    }
	    System.out.println();
	}
	
}

public static void Middle_Triangle(int SIZE, boolean INVERTED) {
	
	
	// if inverted true then use 1 as row else (SIZE+1)/2 same with other but
	// increment statement is not working with this method so do it inside the loop
	for(int row = (INVERTED) ? 1 : (SIZE+1)/2; (INVERTED) ? row <= (SIZE+1)/2 : row >= 1;) {
		for(int col = row; col >= 2; col--) {
				System.out.print(" ");
		}
		for(int col = 1; col <= ((SIZE+2)-(2*row)); col++) {
			System.out.print("*");
		}
		System.out.println();
		// here is increment with if statement
		if(INVERTED)
			row++;
		else 
			row--;
	}
}


public static void main(String[] args) {
		
		try (var scan = new Scanner(System.in)) {
			
			System.out.print("Enter the traingle base size value more than 3: ");
			final int SIZE = Integer.parseInt(scan.nextLine());
			Middle_Triangle(SIZE,false);
			System.out.print("\n\nWould you like to see this in inverted view ? y = yes or n = close : ");
			final boolean INVERTED = scan.nextLine().trim().startsWith("y");
			System.out.println("\n");
			if(INVERTED)
				Middle_Triangle(SIZE,INVERTED);
			
			/*System.out.print("Would you like to see an inverted triangle too (y or n): ");
			final boolean INVERT = scan.nextLine().trim().startsWith("y");
			
			Print_Right_Triangle(SIZE,INVERT);
			Print_Right_UpsideDown_Triangle(SIZE,INVERT); */
			
		}
	}

}
