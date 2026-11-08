public class reverseArray {

    public static void swapArr(int arr[]) {
        int first, last, temp;
        first = 0;
        last = arr.length - 1;

        while (first < last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first = first + 1;
            last = last - 1;
            temp = first;
        }
        System.out.print("Reversed Arr: [ ");
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx]);
            System.out.print(" ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
          System.out.print("Original Arr: [ ");
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx]);
            System.out.print(" ");
        }
        System.out.println("]");
        swapArr(arr);
    }
}
