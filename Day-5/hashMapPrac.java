import java.util.*;
public class hashMapPrac {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Cherry");
        System.out.println("After put(): "+map);

        Map<Integer, String> anotherMap = new HashMap<>();
        anotherMap.put(4,"Dates");
        anotherMap.put(5,"Elderberry");
        map.putAll(anotherMap);
        System.out.println("After putAll(): "+map);

        System.out.println("get(2): "+ map.get(2));
        map.remove(3);
        System.out.println("After remove: "+map);
        System.out.println("ContainsKey(1): " + map.containsKey(1));
        System.out.println("Contains value(Banana): "+ map.containsValue("Banana"));
        System.out.println("Size(): "+map.size());
        System.out.println("isEmpty(): " +map.isEmpty());
        Set<Integer> keys = map.keySet();
        System.out.println("KeySet(): "+keys);
        Collection<String> values = map.values();
        System.out.println("Values(): "+values);
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("entrySet(): "+entries);
        for(Map.Entry<Integer,String>e : entries){
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }
        map.replace(2,"Mango");
        System.out.println("After relpace: "+ map);
        map.clear();
        System.out.println("After clear: "+map);
        System.out.println("isEmpty() after clear "+map.isEmpty());
    }
}
