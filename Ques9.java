// FIND GREATEST COMMON DIVISOR(GCD) OF x AND y

public class Ques9 {
    static int GCDIterative(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;

    }

    static int GCDRecursive(int x, int y) {
        if (y == 0)
            return x;
        return GCDRecursive(y, x % y);
    }

    public static void main(String[] args) {
        System.out.println(GCDIterative(24, 15));
        System.out.println(GCDRecursive(15, 24));
    }
}
