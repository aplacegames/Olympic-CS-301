/*Given an array of N elements, not necessarily in ascending order,
 * devise an algorithm to find the kth largest one.
 * It should run in O(N) time on random inputs.
 * Name this program FindKthLargest.java.
 *
 * get user input 
 * check for the biggest target idx they choose 
 * example 2nd largest 
 * go through array 
 * 
 *
 */
import java.util.Arrays;
import java.util.LinkedList;


public class FindKthLargest{



    public static int sortingArray(int [] mixed_array, int low_num, int high_num){



        // go through array on a pivot point 
        // find middle of array
        int mid_idx = (low_num+high_num)/2;
        

        int pivot_num = mixed_array[mid_idx];

        int swap_val = mixed_array[mid_idx];
        mixed_array[mid_idx] = mixed_array[high_num];
        mixed_array[high_num] = swap_val; 



        int holder_idx = low_num;


        // loop through the array 
        // biggest on left, other on right 
        for (int idx = low_num; idx < high_num; idx++){

            if(mixed_array[idx] > pivot_num){
                int temp_idx = mixed_array[idx];
                mixed_array[idx] = mixed_array[holder_idx];
                mixed_array[holder_idx] = temp_idx;

                holder_idx++;
            }

        }


        int temp_hold = mixed_array[holder_idx];
        mixed_array[holder_idx] = mixed_array[high_num];
        mixed_array[high_num] = temp_hold; 

        System.out.println(Arrays.toString(mixed_array));
        return holder_idx;



 }
    public static int findKth(int[] mixed_array, int target_idx){
        int low_pos = 0;
        int high_pos = mixed_array.length-1;

        while(low_pos <= high_pos){
            int pivot_point = sortingArray(mixed_array, low_pos, high_pos);

            if (pivot_point == target_idx) return mixed_array[pivot_point];
            else if (pivot_point > target_idx) high_pos = pivot_point - 1;
            else low_pos = pivot_point + 1;

        }
        return -1;



    }



    public static void main(String[] args) {

        int [] mixed_array = {-20, 4, -3, 33, 12, 9, 30};

        int target_idx = Integer.parseInt(args[0]);
        
        // pass array thorgh a method 
        // with user input
        //
        target_idx = target_idx -1;


        if(target_idx >= mixed_array.length || target_idx < 0){
            System.out.println("This index does not exist");
        }else{



        System.out.println("the "+(target_idx +1)+" largest is "+ findKth(mixed_array, target_idx));

        }
    }

}






