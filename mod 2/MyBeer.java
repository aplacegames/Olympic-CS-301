/* this program runs 1000 times with random chance 
 * of if a person picks up their og beer after htey
 * left and came back to a party and prints out the fraction
*/



class MyBeer{
static void main(StripWhitespaceFilterng[] args){

    // cmd line for number of people at the party 
    int people_num = Integer.parseInt(args[0]);

    // value for how many times its gonna run 
    int sim_num = 1000; 

    // value for number of times someone got the og beer 
    int beer_num = 0; 


    // initialize and take sample from the number of poeple
    // along with creatiung the random chance here 
    for (int idx = 0; idx < sim_num; idx++){
	
	int [] perm = new int[people_num];
	

	for(int jdx = 0; jdx < people_num; jdx++){

	    perm[jdx] = jdx;

	}

	for (int kdx = 0; kdx < people_num; kdx++){

	    int rando_beer = kdx + (int) (Math.random()*(people_num - kdx));
	    int temp_num = perm[rando_beer];
	    perm[rando_beer] = perm[kdx];
	    perm[kdx] = temp_num;


	}

    

    // print a fraction using stdout printf 
    // for a cleaner output to terminal 
    boolean og_beer = false;
    for (int ldx = 0; ldx < people_num; ldx ++){
	if (perm[ldx] == ldx){
	    // if true break into next block 
	    og_beer = true;
	    break;
	    
	}
    }
    //if its true adds 1 to the counter 
    if(og_beer){

	beer_num++;

    }

    }

    //printing out fraction with formating 
    System.out.printf("%d/%d%n",beer_num,sim_num);

 }
}
