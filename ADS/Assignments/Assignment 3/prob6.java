//  Implement a Queue using an array.
class prob6 {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.dequeue();
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
        return (rear == size - 1);
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (isEmpty()) {
                front = 0;
            }
            Q[++rear] = data;
        }
    }

    int dequeue() {
        if (isEmpty()) { 
            System.out.println("Queue is empty");
            return -1;
        } else {
            int d = Q[front];
            front++;
            if (front > rear) {
                front = -1;
                rear = -1;
            }
            return d;
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // or throw an exception
        }
        return Q[front];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(Q[i] + " ");
            }
        }
    }
}
