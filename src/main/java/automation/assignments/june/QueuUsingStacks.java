package automation.assignments.june;
import java.util.Stack;
public class QueuUsingStacks {

	public static void main(String[] args) {
		

		class QueueUsingStacks {
		    private Stack<Integer> stack1;
		    private Stack<Integer> stack2;

		    public QueueUsingStacks() {
		        stack1 = new Stack<>();
		        stack2 = new Stack<>();
		    }

		    public void enqueue(int item) {
		        while (!stack1.isEmpty()) {
		            stack2.push(stack1.pop());
		        }
		        stack1.push(item);
		        while (!stack2.isEmpty()) {
		            stack1.push(stack2.pop());
		        }
		    }

		    public int dequeue() {
		        if (stack1.isEmpty()) {
		            throw new IllegalStateException("Queue is empty");
		        }
		        return stack1.pop();
		    }

		    public int peek() {
		        if (stack1.isEmpty()) {
		            throw new IllegalStateException("Queue is empty");
		        }
		        return stack1.peek();
		    }

		    public boolean isEmpty() {
		        return stack1.isEmpty();
		    }

		    public int size() {
		        return stack1.size();
		    }
		}
		        QueueUsingStacks queue = new QueueUsingStacks();
		        queue.enqueue(10);
		        queue.enqueue(20);
		        queue.enqueue(30);

		        System.out.println("Size of queue: " + queue.size());
		        System.out.println("Dequeued item: " + queue.dequeue());
		        System.out.println("Dequeued item: " + queue.dequeue());
		        System.out.println("Peek item: " + queue.peek());
		        System.out.println("Size of queue: " + queue.size());
		    }
		    {

	}
}


