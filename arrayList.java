import java.util.ArrayList;
import java.util.Collections;

class arrayList{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        // adding element
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        // adding elements in between 
        al.add(1,2);
        System.out.println(al);

        // getting elements
        System.out.println(al.get(2));

        // setting elements 
        al.set(1,2);
        System.out.println(al);
        // delete elements
        al.remove(2);
        System.out.println(al);

        // sort array 
        Collections.sort(al);
        System.out.println(al);
    }
}