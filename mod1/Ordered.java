/* command line and then prints out the 
* distance between the points and the origin
*
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
