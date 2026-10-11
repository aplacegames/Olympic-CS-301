/* this program is checking if the values input by the
 * user is a triangle or not 
 * it is taking in angles and checking them if they 
 * add up to 180 and have checks and will return 
 * true or false 
 * it will use a static method to do so 
 */

class Triangle{

// split up into 2 methods 
// piblic static main takes in input and prints out output 
// areTriangular does all the calculations 



// static method here that takes doubles 
public static boolean areTriangular(double a_side, double b_side,double c_side){
    // do triangle calculations here  

    //2 smallest sides must be bigger then the largest side 
    //order the sides from smallest to biggest
    // if statement to check if its triangle 
    if(a_side < (b_side + c_side) &&
       b_side < (a_side + c_side)&&
       c_side < (b_side + a_side)){

	return true; 

    }else{
    
	return false;
    }

}


public static void main(String[] args){

    
    //getting the user numbers here 
    double a_side = Double.parseDouble(args[0]);
    double b_side = Double.parseDouble(args[1]);
    double c_side = Double.parseDouble(args[2]);

    // passing the args to the new method 
    boolean is_Triangle = areTriangular(a_side, b_side, c_side);

    // printing results true if yes false if not 
    System.out.println(is_Triangle);

 }
}
