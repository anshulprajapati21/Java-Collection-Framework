
import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        Map<String,Integer> number = new HashMap<>();
        number.put("One", 1);
        number.put("two", 2);
        number.put("three", 3);
        System.out.println(number);
       // number.put("two", 89);

        
        number.putIfAbsent("two", 70);
        System.out.println(number);
       
        for (Map.Entry<String, Integer>e: number.entrySet()) {
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
            
        }
    


    }
    
}
