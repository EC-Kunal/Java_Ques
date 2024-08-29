//REMOVE ALL THE OCCURENCES OF A GIVEN CHARACTER IN THE GIVEN STRING

import java.util.Scanner;

public class Ques16 {
    static String removeOccurences(String str, char ch, int idx) {
        if (idx == str.length()) {
            return "";
        }
        String ans = removeOccurences(str, ch, idx + 1);
        char currChar = str.charAt(idx);
        if (currChar != ch) {
            return currChar + ans;
        } else {
            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter the character you want to remove: ");
        char ch = sc.next().charAt(0);
        System.out.println(removeOccurences(str, ch, 0));

        sc.close();
    }
}
