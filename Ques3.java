//FACTORIAL OF GIVEN NUMBER

import java.util.Scanner;
public class Ques3 {
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        int fact = n * factorial(n-1);
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.printf("Factorial of %d is %d", num , fact);
        System.out.println();

        sc.close();
    }
}
