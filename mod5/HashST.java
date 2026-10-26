
import java.util.ArrayList;

public class HashST <Key, Value>{

    private int m = 1024;
    private Node[] lists = new Node[m];
    private int n = 0;

    private static class Node{

        private Object key;

        private Object val;

        private Node next;

    public Node (Object key, Object val, Node next){

        this.key = key;
        this.val = val;
        this.next = next; 

        }
    }

    private int hash (Key key){

        return Math.abs(key.hashCode()%m);

    }

    public Value get (Key key){

        int i = hash(key);
        for (Node x = lists[i]; x != null; x = x.next)
            if (key.equals(x.key))
                return (Value) x.val;
        return null;


    }

    public void put (Key key, Value val){

        int i = hash(key);

        for (Node x = lists[i]; x != null; x = x.next){

            if (key.equals(x.key)){

                x.val = val;
                return;

            }

        }

        lists[i] = new Node(key, val, lists[i]);
        n++;

    }

    // add contains 
    // add keys 
    // add size 
    // methods to the code 
    //
    public boolean contains(Key key){

        return get(key) != null;
    }

    public int size(){

        return n;

    }

    public Iterable<Key> keys(){

        ArrayList<Key> all_keys = new ArrayList<Key>();
        for(int idx = 0; idx < m; idx++){
            for(Node x = lists[idx]; x != null; x = x.next){

                all_keys.add((Key)x.key);

            }


        }
        return  all_keys;



    }





    public static void main(String[] args) {
        HashST<String, Integer> fruits_ammt = new HashST<String, Integer>();
        fruits_ammt.put("apple",20);

        fruits_ammt.put("banana",2);

        fruits_ammt.put("kiwi",15);

        fruits_ammt.put("apple",8);

        System.out.println("Size: " + fruits_ammt.size());

        System.out.println("contains apple: " + fruits_ammt.contains("apple"));

        System.out.println("contains peach " + fruits_ammt.contains("peach"));


        for(String key : fruits_ammt.keys()){


        System.out.println(key + "->" + fruits_ammt.get(key));



        }







    }






}
