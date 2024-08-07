
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        Queue<Integer> humanage = new PriorityQueue<>();

        // there are min heap condition running..
        humanage.offer(50);
        humanage.offer(60);
        humanage.offer(14);
        humanage.offer(34);
        humanage.offer(54);
        humanage.offer(26);

        System.out.println(humanage);

        System.out.println(humanage.poll());
        System.out.println(humanage);
        System.out.println(humanage.peek());
        System.out.println(humanage.poll());

        Queue<Integer> humanage1 = new PriorityQueue<>(Comparator.reverseOrder());
         // it;s direct convert min heap into max heap

        humanage1.offer(80);
        humanage1.offer(70);
        humanage1.offer(60);

        System.out.println(humanage1);


    }
    
}
