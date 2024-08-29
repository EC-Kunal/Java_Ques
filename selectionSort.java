public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 8, 0, 7, 1, 3 };
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[min_idx] > arr[j + 1]) {
                    min_idx = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
