//GIVEN A NUMBEER n AND A VALUE k. PRINT FIRST k MULTIPLES OF n

public class Ques7 {
    static void multiple(int num, int k) {
        if (k == 1) {
            System.out.print(num + " ");
            return;
        }
        multiple(num, k - 1);
        System.out.print(num * k + " ");

    }

    public static void main(String[] args) {
        multiple(5, 3);

    }
}
