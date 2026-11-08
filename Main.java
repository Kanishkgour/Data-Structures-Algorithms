public class Main {

    public static int BinarySearch(int arr[], int key) {
        int start, end, mid;
        start = 0;
        end = arr.length - 1;
        mid = (start + end) / 2;

        while (start <= end) {
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
                mid = (start + end) / 2;
            } else {
                end = mid - 1;
                mid = (start + end) / 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Binary Search ");
        int num[] = { 10, 11, 20, 30, 50, 60, 65, 77, 89, 98 };
        int key = 11;
        int one = BinarySearch(num, key);
        System.out.println(one);
    }
}