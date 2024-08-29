// GIVEN AN ARRAY OF INTEGER, PRINT SUMS OF ALL SUBSETS IN IT. OUTPUT CAN BE PRINTED IN ANY ORDER

public class Ques19 {
    static void subsetSum(int[] arr, int idx, int sum) {

        if (idx >= arr.length) {
            System.out.println(sum);
            return;
        }
        subsetSum(arr, idx + 1, sum + arr[idx]);
        subsetSum(arr, idx + 1, sum);
    }

    public static void main(String[] args) {
        int[] a = { 2, 4, 5 };
        subsetSum(a, 0, 0);
    }
}
