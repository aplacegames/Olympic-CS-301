/* this program takes in numbers from the user in the command line 
 * and then calculates the average value along with the deviation
 * with 2 decimal places 
 */


class Stats{
public static void main(String[] args){

    // get user input here of how big the array is going to be  
    int user_nums = Integer.parseInt(args[0]);

    // sum of hte numbers to calculate average 
    double num_sum = 0.0; 

    // mean value 
    double num_mean = 0.0;

    // sum of squared differences 
    double sqr_diff_sum = 0.0; 
    
    //standard deviation value 
    double stnd_devi = 0.0;


    // array to store numbers from the user after args 
    double[] nums_array = new double[user_nums];
    
    // loop for storing the numbers 
    // will see the num the user put then add the numbers into the 
    // nums array 
    for (int idx = 0; idx < user_nums; idx++){
	
	nums_array[idx] = StdIn.readDouble(); 
    
    }

    // calculating the mean 
    
    // loop to get the sum of the nubmers in the array
    for (int idx = 0; idx <user_nums; idx++){

	num_sum += nums_array[idx];
    }
    // calculating the mean or average here 
    num_mean= num_sum/user_nums;



    // calculatuing the sum of sqr differences here 
    // for standard deviation 
    for (int idx = 0; idx < user_nums; idx++){

	double sqr_diff = nums_array[idx] - num_mean;
	sqr_diff_sum += sqr_diff * sqr_diff;
    }
    // calculating standard deviation here 
    stnd_devi = Math.sqrt(sqr_diff_sum/ (user_nums -1));


    // printing out the mean or average here tp the user 
    System.out.printf("The Mean or Average is %.2f\n", num_mean);

    System.out.printf("The Standard Deviation is %.2f\n", stnd_devi);

    }
}
