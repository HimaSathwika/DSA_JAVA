import java.util.Iterator;
import java.util.Vector;

public class VectorString {
    public static void main(String[] args){
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        System.out.println("After add(): " + vector);
        vector.add(1,"Mango");
        System.out.println("After add(1,\"Mango\") " + vector);
        vector.remove(2);
        System.out.println("After remove(2) "+vector);
        vector.remove("Apple");
        System.out.println("After remove(Apple) "+vector); 
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Banana");
        System.out.println("Add Banana "+vector);
        System.out.println("First IndexOf Banana "+vector.indexOf("Banana"));
        System.out.println("Last IndexOf Banana "+vector.lastIndexOf("Banana"));  
        vector.removeElementAt(2);
        System.out.println("After removeELementAt(2) "+vector );
        System.out.println("After removeELementAt(2) " );
        Iterator<String> it = vector.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
