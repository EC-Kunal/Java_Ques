// SEARCH FOR A GIVEN ELEMENT IN THE GIVEN ARRAY (LINEAR SEARCH)

import java.util.Scanner;

public class Ques13 {
    static boolean searchElement(int[] arr, int val, int idx) {
        if (idx > arr.length - 1) {
            return false;
        }

        if (arr[idx] == val) {
            return true;
        }

        return searchElement(arr, val, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want to search in the array:  ");
        int s = sc.nextInt();
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        if (searchElement(arr, s, 0)) {
            System.out.println("Element is present in the array");
        } else {
            System.out.println("Element is not present in the array");
        }

        sc.close();
    }
}
