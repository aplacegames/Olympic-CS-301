
 /* this program prints out circles to the screen
  * it will take in user commands to determin the 
  * min radius and max radius, number of circles 
  * and the probability of each circle is black 
  * using stddraw library 
  */





class Circles{
    public static void main(String[] args){
	
	//get command args
	int num_of_circles = Integer.parseInt(args[0]);
	double circles_color = Double.parseDouble(args[1]);
	double min_rad = Double.parseDouble(args[2]);
	double max_rad = Double.parseDouble(args[3]);
	
	// make a loop to draw circles from user input 
	for (int idx = 0; idx <= num_of_circles; idx ++){
	    
	    // random areas for the circle to be in x and y
	    double x_pos = Math.random();
	    double y_pos = Math.random();

	    // making random radius between user args 
	    double rando_radius = min_rad + Math.random() * (max_rad - min_rad);

	    // where the circle will be black or white 
    	    if (Math.random() < circles_color){
		StdDraw.setPenColor(StdDraw.BLACK);		
    
	    }else{

		StdDraw.setPenColor(StdDraw.WHITE);		
	    }

	    // crawing the circles out 
	    StdDraw.filledCircle(x_pos, y_pos, rando_radius);
	}
	
    }

}
