import java.util.*;

public class hashSetPracc {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("After add(): " + set);
        set.remove("Banana");
        System.out.println("After remove(Banana) "+set); 
        boolean hasApple = set.contains("Apple");
        System.out.print("Iterting with itertor:");
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }
}
