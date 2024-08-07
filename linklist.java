import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linklist {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(8);
        System.out.println(list);
        // now wwe ill add the number at the end of list..
        list.add(12);
        System.out.println(list);

        // according to your choice which index add the element , these possible..
        list.add(2,70);
        System.out.println(list);
       
        // we can add all new list element in privious list..

        List<Integer> newlist = new ArrayList<>();
        newlist.add(34);
        newlist.add(80);
          

    list.addAll(newlist);
    System.out.println(list);

    // we can get the elemeent..
   // list.get(1);
    System.out.println(list.get(2));

    // we can remove the element two types
      list.remove(6);
      System.out.println(list);       

      list.remove(Integer.valueOf(80));
      System.out.println(list);

      // we can clear the list
      list.clear();
      System.out.println(list);

    }
    
}
