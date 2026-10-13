/**
 * bubbleSorting
 */
public class bubbleSorting {
    public static void sort(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("[");
        for(int m=0; m<arr.length; m++){
            System.out.print(arr[m]+",");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        // int arr[] = { 8, 4, 2, 9, 7, 0, 1, 5, 6, 3 };
        int arr[] = { 78,89,45,56,12,23,10,25,47,85,1,2,5 };
        sort(arr);
    }
}