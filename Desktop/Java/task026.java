import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class task026 {
    public static void main(String[] args) {
        Deque<String> queue = new LinkedList<String>();
        queue.add("12");
        queue.add("0");
        queue.add("9");
        queue.add("3");
        queue.add("17");
        queue.add("6");
        System.out.println(queue);
        enqueue(queue);
        System.out.println(queue);
        dequeue(queue);
        System.out.println(queue);
        first(queue);
    }

    public static Deque<String> enqueue(Deque<String> lineOfstring) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите новый элемент");
        String str = scn.nextLine();
        lineOfstring.addLast(str);
        return lineOfstring;
    }

    public static String dequeue(Deque<String> lineOfstring) {
        String result = lineOfstring.pollFirst();
        return result;
    }

    public static String first(Deque<String> lineOfstring) {
        String result = lineOfstring.getFirst();
        System.out.println(result);
        return result;
    }

}
