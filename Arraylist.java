import java.util.ArrayList;
import java.util.List;

class Arraylist{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
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

    //   set functoion , we can update the element value 
    //  list.set(5, 40);
    // System.out.println(list.set(2, 150));
     
    //list.contains(2);
    System.out.println(list.contains(2));
    
    // itirate all element 
    

     for (int i=0; i<list.size(); i++){
     System.out.println("the element is " + list.get(i));
     }
     
     // second type itirate all element..
     for (Integer element: list)
     System.out.println("foreach element is" + element);        
    }
   
    }
