
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinklist {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();

        queue.offer(12);
        queue.offer(80);
        queue.offer(90);
        queue.offer(70);
        queue.offer(40);

        System.out.println(queue);

        //queue.poll();
        System.out.println(queue.poll());

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.add(33));
        System.out.println(queue);
    

    }
}
