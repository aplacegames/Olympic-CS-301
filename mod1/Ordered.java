/* This program takes in 3 command line args  
*  and then checks if its orderd or not 
*  will print out true or false 
*/


class Ordered{
public static void main(String[] args) {
	
    // get user input from args 
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    int z = Integer.parseInt(args[2]);
    
    // boolean to check if its increasing or decreasing
    boolean b = (x <= y && y <= z) ||( x >= y && y >= z);
    
    // prints out results 
    System.out.print("Are the numbers ordered? \n" + b + "\n");
}
}
