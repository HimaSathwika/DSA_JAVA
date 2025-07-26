import java.util.*;
public class LinkedListString {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After add(): " + list);
        list.add(1,"Mango");
        System.out.println("After add(1,\"Mango\"): " + list);
        list.addFirst("Orange");
        System.out.println("After addFirst(\"Orane\"): " + list);
        list.addLast("Grapes");
        System.out.println("After addLast(\"Grapes\"): "+list);
        System.out.println("First element: "+list.getFirst());
        System.out.println("Last element: "+list.getLast());
        list.set(2,"PineApple");
        System.out.println("aAfter set(2,\"PineApple\") "+list);
        list.remove(3);
        System.out.println("After remove: " + list);
        list.remove("Apple");
        System.out.println("After remove(\"Apple\") "+ list);
        list.removeFirst();
        System.out.println("After removeFirst(): "+list);
        list.removeLast();
        System.out.println("After removeLast(): "+list);
        System.out.println("Contains Banana "+list.contains("Banana"));
        list.add("Banana");
        list.add("Cherry");
        list.add("Banana");
        System.out.println("Add Banana "+list);
        System.out.println("First IndexOf Banana "+list.indexOf("Banana"));
        System.out.println("Last IndexOf Banana "+list.lastIndexOf("Banana"));
        System.out.println("Size of list: " +list.size());
        System.out.println("Is list Empty: "+list.isEmpty());
        System.out.print("Iterating using iterator: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.print("Iterating in reverse order: ");
        Iterator<String> descIt = list.descendingIterator();
        while(descIt.hasNext()){
            System.out.print(descIt.next()+ " ");
        }
        System.out.println();
        System.out.println("Peek (head element): " +list.peek());
        System.out.println("Poll (removes head): " + list.poll());
        System.out.println("After poll: " + list);
        list.offer("Kiwi");
        list.offerFirst("Lemon");
        list.offerLast("Berry");
        System.out.println("After offer operations: " + list);
        Object[] arr = list.toArray();
        System.out.print("Array version: ");
        for (Object obj : arr){
            System.out.print(obj + " ");
        }
        System.out.println();
        list.clear();
        System.out.println("After clear: " + list);
    }
}
