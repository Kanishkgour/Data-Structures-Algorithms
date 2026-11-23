public class CircularQueue {

    static class queue {
        static int arr[];
        static int size;
        static int front = -1;
        static int rear = -1;

        queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return (rear == -1 && front == -1);
        }

        public static boolean isFull() {
            return ((rear + 1) % size == front);
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Full Queue");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
            // System.out.println("Added:" + arr[rear]);
            
        }

        public static int remove() {
            if (isEmpty() ) {
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];
            if(rear == front ){
                rear = front = -1;
            } else {
                front = (front +1) %size;
            }
            // rear--;
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue Peek");
                return -1;
            }
            return arr[front];
        }

        public static void Display() {
            if (isEmpty()) {
                System.out.println(("Nothng To Print"));
                return;
            }

            System.out.print("Queue:");
            for (int m = 0; m <= rear; m++) {
                System.out.print(" " + arr[m]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        queue qs = new queue(3);
        qs.add(18);
        qs.add(200);
        qs.add(7);
        qs.add(14);
        qs.add(26);
        qs.Display();
        // while (!qs.isEmpty()) {
        //     qs.peek();
        //     qs.remove();
        //     qs.Display();
        // }

    }
}
