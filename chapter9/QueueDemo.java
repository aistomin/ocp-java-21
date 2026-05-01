import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {
	Queue<Integer> queue = new LinkedList<>();
	queue.add(10); 	
	queue.add(6); 	
        System.out.println(queue);

	queue.offer(4);
        System.out.println(queue);

        System.out.println(queue.element());
        System.out.println(queue.peek());

        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);

        // System.out.println(queue.element()); - Exception in thread "main" java.util.NoSuchElementException 
        System.out.println(queue.peek());
        // System.out.println(queue.remove()); - Exception in thread "main" java.util.NoSuchElementException
        System.out.println(queue.poll());

	Deque<String> deque = new LinkedList<>();
	deque.addFirst("First1");
	deque.offerFirst("First2");
	deque.addLast("Last1");
	deque.offerLast("Last2");
        System.out.println(deque);

	System.out.println(deque.getFirst());
	System.out.println(deque.peekFirst());
	System.out.println(deque.getLast());
	System.out.println(deque.peekLast());
	
	
	System.out.println(deque.removeFirst());
	System.out.println(deque.pollFirst());

	System.out.println(deque.removeLast());
	System.out.println(deque.pollLast());

        System.out.println(deque);

	// System.out.println(deque.getFirst()); - Exception in thread "main" java.util.NoSuchElementException
	System.out.println(deque.peekFirst());
	// System.out.println(deque.getLast()); - Exception in thread "main" java.util.NoSuchElementException
	System.out.println(deque.peekLast());
	
	
	// System.out.println(deque.removeFirst()); - Exception in thread "main" java.util.NoSuchElementException
	System.out.println(deque.pollFirst());

	// System.out.println(deque.removeLast()); - Exception in thread "main" java.util.NoSuchElementException
	System.out.println(deque.pollLast());

	deque.push("Hello!!!");
	deque.push("World!!!");
        System.out.println(deque);

	System.out.println(deque.pop());
	System.out.println(deque.peek());
	System.out.println(deque.pop());

	// System.out.println(deque.pop()); - Exception in thread "main" java.util.NoSuchElementException
	System.out.println(deque.peek());
    }
}

