/* this progam takes in a string and then reverses it 
 * by using recursion 
 *  
 */


public class ReverseString{


    public static String revString(String user_string){

	// if that goes through the string 
	// cuts off the 1st char and then adds it to the end 
	// reversing the string by each char till it gets to 
	// the end then returns the user string 
	if ((null == user_string) || (user_string.length() <= 1)){
		return user_string; 
	}
	return revString(user_string.substring(1)) + user_string.charAt(0);

    }

    public static void main (String[] args){

     
	//get user input here 
	String user_string = args[0]; 
	
	//prints out the reversed string 
	System.out.println(revString(user_string));


    }
}
