/* this program finds a number in
 * a sorted array and returns true or false 
 * no loops 
 *
*/



public class RecursiveBinarySearch {


    public static void main (String[] args){
    // making a sorted array to test 
    int [] sorted_array = {3,8,12,17,21,35,48};

    // number from user to check if its in the array 
    int target_num = Integer.parseInt(args[0]);

    int low_num = 0; 
    int high_num = sorted_array.length -1; 

    // pass user number to recursion method to search array
    boolean in_array = binarySearch(sorted_array, target_num, low_num, high_num);
    
    // printing out the results 
    System.out.println(in_array);




    }

    public static boolean binarySearch (int[] sorted_array, int target_num, 
						int low_num, int high_num){

	if(low_num > high_num){
	    return false; 
    
	}


	// valeus to help the binary search 
	int mid_pos = (low_num+high_num)/2;
	int mid_num = sorted_array[mid_pos];



	// if it matches the middle number then return true 
	if (target_num == mid_num){
	    return true; 
	}

	// if it is smaller then check the left  
	if (target_num < mid_num){
	
	    return binarySearch(sorted_array, target_num, low_num, mid_pos-1);

	}else{

	    // if it is bigger hthen check the right 
	    return binarySearch(sorted_array, target_num, mid_pos+1, high_num);

	}


    }
}


