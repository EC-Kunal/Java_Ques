//FIND THE FIBONACCI TERM

public class Ques4 {
    static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        int fibo = fibonacci(n - 1) + fibonacci(n - 2);
        return fibo;
    }

    public static void main(String[] args) {
        // System.out.println(fibonacci(5)); //Nth FIBONACCI NUMBER

        for (int i = 0;  i <= 10; i++) {
            System.out.println(fibonacci(i)); // FIRST N TERMS OF FIBONACCI SERIES
        }
    }
}
