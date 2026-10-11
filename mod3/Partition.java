/* prints out all of the 
 * int partitions from the 
 * number the user put in the 
 * command line 
 *
*/


public class Partition{


    public static void parition (int par_num){
	// getting the method and then overloading it to a new method 
	parition(par_num, par_num, "");

    }

    public static void parition (int par_num, int max_num, String prefix_string){

	// if its 0 then retirn and end the methopd 
	if (par_num ==0){
	    StdOut.println(prefix_string);
	    return; 
	}


	// recursive for loop that takes in the numbers we passed aboiove 
	// and then using idx we go down step by step making 
	// sure the first number is the biggerr one and then 
	// printing out the smaller ones after 
	for (int idx = Math.min(max_num, par_num); idx >= 1; idx--){

	    parition(par_num - idx, idx, prefix_string + " " + idx);


	}

    }


    public static void main (String[] args){


	// getting the number ffrom the user 
	// and passing it to the 1st method 
	int par_num = Integer.parseInt(args[0]);
	parition(par_num);


    }
}
