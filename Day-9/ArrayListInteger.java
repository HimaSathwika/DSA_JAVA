import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Intial list :" + numbers);
        numbers.add(1,5);
        System.out.println("After inserting 5 at index 1: "+numbers);
        System.out.println("Element at index 2:" + numbers.get(2));
        numbers.set(2,15);
        System.out.println("After relacing index 2 with 15: "+numbers);
        numbers.remove(3);
        System.out.println("After removing element at 3: "+numbers);
        numbers.remove(Integer.valueOf(5));
        System.out.println("After removing value 5: "+ numbers );
        System.out.println("Contains 15? "+numbers.contains(15));
        System.out.println("Size of list: "+numbers.size());
        System.out.println("is list empty "+ numbers.isEmpty());
        System.out.print("Using iterator ");
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        List<Integer> subList = numbers.subList(0,2);
        System.out.print("Sublist (0 to 2): "+subList);
        Object[] arr =numbers.toArray();
        System.out.print("Array: ");
        for (Object obj: arr){
            System.out.print(obj + " ");
        }
        numbers.clear();
        System.out.println("\nAfter clear(): "+numbers);
    }
}
