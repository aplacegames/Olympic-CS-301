/* This program prints out ints from 
 * 1000 to 2000 in lines of 25 
 */

class TwentyFivePerLine{
public static void main(String[] args) {
	//counter for new line
	int count_num = 0;
	
    // need loop to count 
    // for loop 
    for (int idx = 1000; idx <= 2000; idx++){
	
	System.out.print(idx+" ");
	//adds 1 to the counter after printing the index
	count_num++;

	// if the number gets to 25 then make new line 
	if (count_num % 25 == 0){
	System.out.print("\n");
	}

    }
    
    // new line for terminal
    System.out.print(" \n");
}
}
