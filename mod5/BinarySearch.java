/*
 *
 *
 *
 */
import java.util.Arrays;


public class BinarySearch {

    public static int binarySearch (int [] sorted_array, int target_idx){

        int low_idx = 0;
        int high_idx = sorted_array.length - 1;


        if(low_idx < high_idx) return -1; 
        

        while (low_idx <= high_idx){

            int mid_idx = low_idx + (low_idx + high_idx)/2;

            if (sorted_array[mid_idx] < target_idx)
                high_idx = mid_idx -1;

            else if (sorted_array[mid_idx] > target_idx)

                low_idx = mid_idx + 1;

            else

                return mid_idx;


        }

        return -1;

    }






    public static void main(String[] args) {
        
        int [] sorted_array = {-20, -4, -1, 0, 3, 9, 30};



        int target_idx = Integer.parseInt(args[0]);

        int array_length = sorted_array.length; 



        if(target_idx > array_length || target_idx < 0){
            System.out.print("This index does not exist");
        }else{

            System.out.println("This index is in the array");
        }



    }
    
}
