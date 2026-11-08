public class SelectionSort {

    public static void sort(int arr[], int strIdx, int endIdx) {
        int temp = 0;
        if (arr.length == endIdx) {
            endIdx = arr.length - 1;
        }
        for (int i = strIdx; i <= endIdx; i++) {
            for (int j = i + 1; j < endIdx; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int arr[] = { 0,3,2,8,4,5,7,1,2,5,6,9,3 };
        sort(arr, 0, 6);
    }
}
