// SUM OF DIGITS OF A GIVEN NUMBER & COUNT OF DIGITS IN A GIVEN NUMBER

public class Ques5 {
    static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        } 
        int sum = sumOfDigits(n/10)+ n%10;
        return sum;
    }
    static int count(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        int c = count(n/10) + 1;
        return c;

    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1542));
        System.out.println(count(1542));
        
    }
}
