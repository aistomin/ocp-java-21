import java.util.function.Consumer;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Deque;

public class QueueDequeMethods {
    public static void main(String[] args) {
	Consumer<Object> out = (p) -> {
	    System.out.println(p + "; " + p.getClass());
	};
	
	Queue<String> queue = new ArrayDeque<String>();
	queue.offer("Tom");
	queue.offer("Dick");
	queue.offer("Harry");
	out.accept(queue);

	out.accept(queue.peek());
	out.accept(queue);

	out.accept(queue.poll());
	out.accept(queue);

	Deque<String> deque = new ArrayDeque<String>();
	deque.offerFirst("Tom");
        deque.offerFirst("Dick");
        deque.offerFirst("Harry");
	out.accept(deque);

	deque.addFirst("added as first");
	deque.addLast("added as last");
	out.accept(deque);

	deque.offerFirst("offered as first");
	deque.offerLast("offered as last");
	out.accept(deque);

	out.accept(deque.peekFirst());
	out.accept(deque.peekLast());
	out.accept(deque);

	out.accept(deque.pollFirst());
	out.accept(deque.pollLast());
	out.accept(deque);

	Deque<String> stack = new ArrayDeque<String>();
	stack.push("Tom");
        stack.push("Dick");
        stack.push("Harry");
	out.accept(stack);

	out.accept(stack.peek());
	out.accept(stack);
	out.accept(stack.pop());
	out.accept(stack);
    }
}

