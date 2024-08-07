
import java.util.Stack;

public class leaarn_Stack {
    public static void main(String[] args) {
        Stack<String> animlas = new Stack<>();
        animlas.push("dog");
        animlas.push("cat");
        animlas.push("lion");
        animlas.push("jaguar");
        animlas.push("zebra");

        System.out.println(animlas);

        System.out.println(animlas.peek());

        animlas.pop();
        System.out.println(animlas.peek());


        Stack<Integer> number = new Stack<>();
        number.push(2);
        number.push(4);
        number.push(8);
        number.push(4);
        number.push(18);

        System.out.println(number);

        System.out.println(number.peek());

         number.pop();
         System.out.println(number.peek());

    
    }
    
}
