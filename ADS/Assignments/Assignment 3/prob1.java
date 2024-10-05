// Stack implementation using array

class prob1 {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        int[] arr = {1, 2, 3, 4, 5};

        for (int el : arr) {
            s.push(el);
        }

        System.out.println("Peek: " + s.peek()); // Display the top element without removing it
        s.display(); // Display stack contents
    }
}

class Stack {
    int[] S;  
    int top;  

    Stack(int size) {
        S = new int[size];
        top = -1;  
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == S.length - 1;
    }

    boolean push(int i) {
        if (isFull()) {
            System.out.println("Stack Overflow. Cannot push " + i);
            return false;
        } else {
            S[++top] = i;
            return true;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow. Cannot pop");
            return -1;
        } else {
            return S[top--];
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow. Cannot peek");
            return -1;
        } else {
            return S[top];
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements (top to bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(S[i] + " ");
            }
            System.out.println();
        }
    }
}
