/* This program takes in 2 input from the 
 * command line and then prints out the 
 * distance between the points and the origin
 *
*/


class DistanceSquared{
public static void main(String[] args) {
	
    // get user input from args 
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);

    // distance calculation
    int distance_sqr = x*x + y*y;
    
    // prints out results 
    System.out.print("The Distance is " + distance_sqr+"\n");
}
}
