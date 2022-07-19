import java.util.HashSet;
import java.util.Iterator;
class hashset {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        // adding elements 
        h.add(23);
        h.add(34);
        h.add(45);
        h.add(56);

        // check whether the element is present in hashset or not 
        // use contains method for checking 

        if(h.contains(23)){
            System.out.println("It does contains "+23);
        }
        // remove elements in hashset 

        h.remove(23);


        // printing elements 
        System.out.println(h);

        // using iterators 
        Iterator<Integer> it = h.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
