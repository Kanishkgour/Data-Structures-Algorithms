public class PracQuest {
    public static void printOccurenceOf(int arr[][], int element) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[0].length - 1; j++) {
                if (arr[i][j] == element) {
                    count += 1;
                }
                ;
                // System.out.print("[" + i + "," + j + "] :" + arr[i][j] + "\n");
            }
            ;
        }
        ;
        if(count > 0){
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };
        printOccurenceOf(arr, 4);
    }
}