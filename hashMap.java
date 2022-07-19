import java.util.HashMap;

class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(1,1);
        h.put(2,3);
        h.put(3,4);
        System.out.println(h);
        if(h.containsKey(3)){
            System.out.println("It does contains key 3");
        }
        // get the value of key 
        System.out.println(h.get(3));

        // printing all elements in iterator 
        System.out.println(h);

    }
}
