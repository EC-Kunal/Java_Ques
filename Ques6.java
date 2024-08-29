// FOR TWO NUMBERS p AND q, FIND p^q

public class Ques6 {
    static int power(int p, int q) {
        if (q == 0)
            return 1;
        int pow = power(p, q - 1) * p;
        return pow;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
}
