//CHECK WHETHER THE GIVEN STRING IS PALLINDROME OR NOT

import java.util.Scanner;

public class Ques15 {
    static boolean pallindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        if (firstChar != lastChar) {
            return false;
        }
        String sub = str.substring(1, str.length() - 1);
        return pallindrome(sub);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        // System.out.println(str.length());
        if (pallindrome(str)) {
            System.out.println("String is pallindrome");
        } else {
            System.out.println("String is not pallindrome");
        }

        sc.close();

    }
}
