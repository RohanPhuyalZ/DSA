public class CircularQueueExample {
    int size = 5;
    private int[] data;
    private int front;
    private int rear;
    private int len;

    public CircularQueueExample() {
        data = new int[size];
        front = -1;
        rear = -1;
        len = 0;
    }

    public int enQueue(int n) {
        if (isFull()) {
            System.out.println("Full");
            return -1;
        } else {
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % size;
            data[rear] = n;
            len++;
        }
        return n;
    }

    public boolean isFull() {
        return len == size;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        int item = data[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        len--;
        return item;
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public void print() {
        for (int i = 0; i < len; i++) {
            System.out.println(data[(front + i) % size] + "\t");
        }
    }

    public static void main(String[] args) {
        CircularQueueExample q = new CircularQueueExample();
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        System.out.println("After Eequque: ");
        q.print();
        q.deQueue();
        q.deQueue();
        System.out.println("After Dequque: ");
        q.print();
    }
}
