/*
 */
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class MatchPhoneNumber{


    public static void main(String[] args) {
       
        //pattern for ()
        String phone_area = "^\\((\\d{3})\\)[-. ]?(\\d{3})[-. ]?(\\d{4})$";


        //pattern without the ()
        String phone_no_area = "^(\\d{3})[-. ]?(\\d{4})$";


        //to hold user input to make it look better 
        Scanner user_input = new Scanner(System.in);



        //telling the user what to do 
        System.out.println("Enter a phone number with or without area code");

        //grabbing the user input 
        String user_number = user_input.nextLine();


        // if statement to check if the user input matches the patterns 
        if (user_number.matches(phone_area)||(user_number.matches(phone_no_area)))

            System.out.println("Valid");
        else 

            System.out.println("Not valid");







    }



}
