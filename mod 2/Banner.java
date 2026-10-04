/* This a banner program that takes in
 * 2 command line args from the user 
 * 1st will be a string and the 2nd will be 
 * the speed 
 * going to move from left to right and wrap around the scren 
 */

import java.awt.Font; 

class Banner{
public static void main(String[] args){

    // user args for text and speed 
    String user_string = args[0];
    int txt_speed = Integer.parseInt(args[1]);

    // gettign the banner font and size set up 
    Font banner_font = new Font("SansSerif",Font.BOLD, 30);
    StdDraw.setFont(banner_font);
    StdDraw.enableDoubleBuffering();

    // for loop to wrap the text around the screen 
    // going from left to right 
    for(double x_pos = 0.0; true; x_pos += 0.010){

    // making the backgrounfd black and the text white 
    StdDraw.clear(StdDraw.BLACK);
    StdDraw.setPenColor(StdDraw.WHITE);
    
    // getting the screen position for the text 
    double screen_pos = x_pos % 1.0; 
    
    // getting hte text on the screen and then making it wrap 
    StdDraw.text(screen_pos, 0.5, user_string);
    StdDraw.text(screen_pos - 1.0, 0.5, user_string);
    StdDraw.text(screen_pos + 1.0, 0.5, user_string);


    // printing out the screen aliong with the speed 
    StdDraw.show(txt_speed);


    }

}

}
