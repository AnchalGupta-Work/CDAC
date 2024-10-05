//Implement a Circular Queue using an array.
class prob7 {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.dequeue();
        q.enqueue(9);
        q.enqueue(10);
        q.display();
     
    }
}

class Queue {
    int size;
    int[] Q;
    int front;
    int rear;

    Queue() {
        size = 5;
        Q = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return (front == -1);
    }

    boolean isFull() {
        return ((rear + 1) % size == front);
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % size;
            Q[rear] = data;
        }
    }

    int dequeue() {
        if (isEmpty()) { 
            System.out.println("Queue is empty");
            return -1;
        } else {
            int d = Q[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return d;
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return Q[front];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            int i = front;
            while (true) {
                System.out.print(Q[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
        }
    }
}
