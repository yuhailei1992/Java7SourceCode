/**
 * Solution 1: use two queues;
 * Solution 2: use only one queue;
 * Solution 3: 
 */
class MyStack {
    private Queue<Integer> qFront = new LinkedList<Integer>();
    private Queue<Integer> qBack = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        qBack.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        if (qBack.isEmpty()) {
            while (!qFront.isEmpty()) {
                qBack.add(qFront.poll());
            }
        }
        while (qBack.size() != 1) {
            qFront.add(qBack.poll());
        }
        // get rid of the last one (stack top).
        qBack.poll();
    }

    // Get the top element.
    public int top() {
        if (qBack.isEmpty()) {
            while (!qFront.isEmpty()) {
                qBack.add(qFront.poll());
            }
        }
        while (qBack.size() != 1) {
            qFront.add(qBack.poll());
        }
        return qBack.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return qBack.isEmpty() && qFront.isEmpty();
    }
}

// Solution 2:
class MyStack {
    private Queue<Integer> queue = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        queue.poll();
    }

    // Get the top element.
    public int top() {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}