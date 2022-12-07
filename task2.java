import java.util.LinkedList;
import java.util.Queue;

public class task2 {

    public static void main(String[] args) {

        Queue<String> turn = new LinkedList<String>();
        turn.add("0");
        turn.add("1");
        turn.add("2");
        turn.add("3");
        turn.add("4");
        System.out.println(turn);
        
        String test_element = "5";

        enqueue(turn, test_element);
        System.out.println(turn);

        dequeue(turn);
        System.out.println(turn);

        first(turn);
        

    }

    private static Queue first(Queue turn) {
        System.out.println(turn.peek());
        return turn;
    }

    private static Queue dequeue(Queue turn) {
        System.out.println(turn.poll());
        return turn;
    }

    private static Queue enqueue(Queue turn, String test_element) {
        turn.add(test_element);
        return turn;
    }
}