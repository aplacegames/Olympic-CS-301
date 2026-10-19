/* making an alorythm that shifts the 
 * char in a string 13 places 
 * upper or lowercase 
 * gets in a single string command line 
 *
 */

class ROT13 {


    // make a metrhod that takes the string 
    // overload it? 
    // recursion would be good idea 
    // iterate over string 




public static void main(String[] args){


    // get user string here 
    String user_string = args[0];

    for (int idx =0; idx < user_string.length(); idx++){

        char idx_char = user_string.charAt(idx);

        if (idx_char >= 'a' && idx_char <= 'm')
            idx_char += 13; 
        
        else if (idx_char >= 'A' && idx_char <= 'M')
            idx_char += 13; 

        else if (idx_char >= 'n' && idx_char <= 'z')
            idx_char -= 13; 
        
        else if (idx_char >= 'N' && idx_char <= 'Z')
            idx_char -= 13; 
        StdOut.print(idx_char);
    }
    StdOut.println();


 }
}
