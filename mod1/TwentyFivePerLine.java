/* This program prints out ints from 
 * 1000 to 2000 in lines of 25 
 */

class TwentyFivePerLine{
public static void main(String[] args) {
	
    // need loop to count 
    // for loop 
    for (int idx = 1000; idx <= 2000; idx++){


	
	System.out.print(idx+" ");

	// if the number gets to 25 then make new line 
	if (idx % 25 == 0){
	System.out.print("\n");
	}

    }
    
    
    
    // prints out results 
    System.out.print(" \n");
}
}
