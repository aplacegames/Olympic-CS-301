/* This program takes in a string and 
 * then picks if there is a single 
 * char in the string that does not repeat
 *
 */


class Once{




    public static char singleLetter(String user_string){


        return singleLetter(user_string, 0);
            
    }


    public static char singleLetter(String user_string, int idx){

        if (idx > user_string.length()){

            return '0';

    
        }


           
        char single_char = user_string.charAt(idx);



            // check if the single char is == to the index of the last time it was used 
            // if it matches then that means its the only char and returns it 
            if (user_string.indexOf(single_char) == user_string.lastIndexOf(single_char)){

                return single_char; 
                 
            }

            
            return singleLetter(user_string, idx+1);

    }



    public static void main(String[] args){
    

        // get user string input 
        String user_string = args[0];


        System.out.println(singleLetter(user_string));

    }


}
