/* make a program that acts like a soda vending machine 
 * take in credits 
 * make purchase 
 * subtract credits and give change 
 *
 *
 */


public class SodaMachine {

    private int inventory ;
    private int price;
    private int balance;


    public void insertCoin(int amtOfItem){

        if (amtOfItem > 0){
            balance += amtOfItem;

        }

    }

    public double getChange(){

        int changeToReturn = balance;
        int balance = 0; 

        return changeToReturn;
    }

    public boolean buy(){
        if (inventory <= 0){
            System.out.print("Out of stock");
            return false;


        }


        if (balance < price){

            System.out.print("not enough money");
            return false;

        }
        inventory --;
        balance-=price;
        return true;



    }

    public SodaMachine(int count, int priceOfItem){
        inventory = count;
        price = priceOfItem;
        balance =0; 


    }


    public static void main(String[] args){

        SodaMachine machine = new SodaMachine(5, 150);

        
        System.out.println("putting 100");

        machine.insertCoin(100);
        
        System.out.println("Buying..." + machine.buy());

        System.out.println("putting 100");

        machine.insertCoin(100);
        
        System.out.println("Buying..." + machine.buy());


        System.out.println("Here is your change" + machine.getChange());



    }

}
