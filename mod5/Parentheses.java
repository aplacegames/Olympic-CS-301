/*
 *
 *
 *
 *
 */

import java.awt.SystemTray;
import java.util.Scanner;
import java.util.Stack;

public class Parentheses{

    private static final char l_paren = '(';

    private static final char r_paren = ')';

    private static final char l_brace = '{';
    
    private static final char r_brace = '}';

    private static final char l_brak = '[';

    private static final char r_brak = ']';


    public static boolean isBalance(String user_string){

        Stack<Character> stack = new Stack<Character>();

        for (int idx = 0; idx < user_string.length(); idx++){

            if (user_string.charAt(idx) == l_paren)
                stack.push(l_paren);

            else if (user_string.charAt(idx) == l_brace)
                stack.push(l_brace);

            else if (user_string.charAt(idx) == l_brak)
                stack.push(l_brak);

            else if (user_string.charAt(idx) == r_paren){

                if (stack.isEmpty())
                    return false;

                if (stack.pop() != l_paren)
                    return false;

            }

            else if (user_string.charAt(idx) == r_brace){

                if (stack.isEmpty())
                    return false;

                if (stack.pop() != l_brace)
                    return false;


        }

            else if (user_string.charAt(idx) == r_brak){

                if (stack.isEmpty())
                    return false;

                if (stack.pop() != l_brak)
                    return false;

    }
        }
        
        return stack.isEmpty();
    }





    public static void main(String[] args) {

        // get a string of char from user 
        
        Scanner user_input = new Scanner(System.in);
        
        System.out.print("enter in {}, [], or () and check if its balanced: ");

        String user_string = user_input.nextLine();

        StdOut.println(isBalance(user_string));
        
    }
}
