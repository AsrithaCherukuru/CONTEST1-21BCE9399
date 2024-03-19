
public class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    private int top;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue2.add(x);
        top = x;
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        int element = queue1.remove();
        if (!queue1.isEmpty()) {
            top = queue1.peek();
        }
        return element;
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}