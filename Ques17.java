//REVERSE THE GIVEN STRING

import java.util.Scanner;

public class Ques17 {
    static String reverseString(String str, int idx) {
        if (idx == str.length()) {
            return "";
        }
        String sub = reverseString(str, idx + 1) + str.charAt(idx);
        return sub;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(reverseString(str, 0));

        sc.close();
    }
}
