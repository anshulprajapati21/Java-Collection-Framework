
import java.util.ArrayDeque;

public class QueueArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(45);
        adq.offerFirst(98);
        adq.offerLast(89);
        adq.offer(60);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.pollLast());
        System.out.println(adq);

        System.out.println(adq.pollFirst());
        System.out.println(adq);

    }
    
}
