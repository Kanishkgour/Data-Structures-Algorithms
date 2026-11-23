
public class QueueY {
       static class queue {
              static int arr[];
              static int size;
              static int rear = -1;

              queue(int n) {
                     arr = new int[n];
                     this.size = n;
              }

              public static boolean isEmpty() {
                     return (rear == -1);
              }

              public static boolean isFull() {
                     return (rear == size - 1);
              }

              public static void add(int data) {
                     if (rear == size - 1) {
                            System.out.println("Full Queue");
                            return;
                     } else {
                            rear++;
                            arr[rear] = data;
                            System.out.println("Added:"+arr[rear]);
                            return ;
                     }
              }

              public static int remove() {
                     if (isEmpty() == true) {
                            System.out.println("Empty Queue");
                            return -1;
                     }
                     int front = arr[0];
                     System.out.println(arr[rear]);
                     for (int i = 0; i < rear; i++) {
                            arr[i] = arr[i + 1];
                     }
                     rear--;
                     return front;
              }

              public static int peek() {
                     if (isEmpty()) {
                            System.out.println("Empty Queue Peek");
                            return -1;
                     }
                     return arr[0];
              }
              public static void Display(){
                     if(isEmpty()){
                            System.out.println(("Nothng To Print"));
                            return ;
                     }
                     
                     System.out.print("Queue:");
                     for(int m=0; m<=rear; m++){
                            System.out.print(" "+arr[m]);
                     }
                     System.out.println();
              }

       }

       public static void main(String[] args) {
              queue qs = new queue(5);
              qs.add(18);
              qs.add(200);
              qs.add(7);
              qs.Display();
              while (!qs.isEmpty()) {
                     qs.peek();
                     qs.remove();
                     qs.Display();
              }

       }
}
