// Stack implementation using array

class prob1 {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        int[] arr = {1, 2, 3, 4, 5};

        for (int el : arr) {
            s.push(el);
        }

        s.display(); // Display stack contents
    }
}

class Stack {
    int[] S;  // Array to store stack elements
    int top;  // Tracks the top of the stack

    // Constructor to set dynamic size
    Stack(int size) {
        S = new int[size];
        top = -1;  // Empty stack
    }

    // Check if the stack is empty
    boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    boolean isFull() {
        return top == S.length - 1;
    }

    // Push an element onto the stack
    boolean push(int i) {
        if (isFull()) {
            System.out.println("Stack Overflow. Cannot push " + i);
            return false;
        } else {
            S[++top] = i;
            return true;
        }
    }

    // Pop an element from the stack
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow. Cannot pop");
            return -1;
        } else {
            return S[top--];
        }
    }

    // Display all elements in the stack from top to bottom
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
