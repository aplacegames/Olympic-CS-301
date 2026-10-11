/* this program takes in sat scores and 
 * estimates the lowest score thaw will be 
 * accepted ti a university 
 *
 */


public class SAT{

    public static void main(String [] args){

	// values tha the program wil use
	int num_of_student = 20000;
	int num_of_accepted= 5000; 
	double mean_score = 1200.0;
	double stnd_devi = 100.0;
	double high_score = 1600.0;
	double low_score = 400.0; 
	double score_percision = 0.00001; 
	double target_pop = 1.0 - ((double)num_of_accepted/num_of_student);
	


	// using code from the book ch 2.2 Gaussian.java 
	// this gives us the percentage of people who will 
	// get less then this score

	// using binary search to go through all the scoers to find 
	// the best lowest score from the info we have 
	while (high_score - low_score > score_percision){
	    
	    double mid_score = low_score +(high_score - low_score)/2.0;

	    double target_percent = Gaussian.cdf((mid_score - mean_score)/stnd_devi);


	    if (target_percent < target_pop){
		
		low_score = mid_score;

	    }else{

		high_score = mid_score;
	    }

	}

	// prints out the lowest score that will be accepted 
	double lowest_score = low_score;
	
	StdOut.printf("Lowest score to be admitted is %.2f%n", lowest_score);

    }
}
