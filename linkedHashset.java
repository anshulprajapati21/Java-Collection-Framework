import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashset {
    public static void main(String[] args) {
         Set<Integer> set = new LinkedHashSet<>();
      // In HashSet and Linked Hash Set do not major difference.. 
      //in LinkedHashset value print in order that which give in input.. 
      // can't use multiple type value..
        set.add(45);
        set.add(80);
        set.add(78);
        set.add(30);
        System.out.println(set);

        set.add(45);  // we are print 45 second time, but outout will be get in one time..

        set.remove(30);
        System.out.println(set.contains(80)); // it's called bulean value return in true false..
        System.out.println(set.size());
        set.clear();
        System.out.println(set);



    }
    
}
