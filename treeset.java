import java.util.*;

public class treeset {
    public static void main(String[] args) {
         Set<Integer> set = new TreeSet<>();
         // in TreeSet get the output in sort order bcz it's use the binary tree 
      // in this set you can not add same type value.. as a like duplicate value
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
