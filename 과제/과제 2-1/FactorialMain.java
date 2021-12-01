import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int input;
        input = scanner.nextInt();

        for ( int i = 1; i <= input; i ++ ) {
            long ret;
            ret = getFactorial(i);
            System.out.printf("Factorial of %d = %d\n", i, ret);
        }
    }

    private static long getFactorial(final int n) {
        long fac = 1;
        for ( int k = 1; k <= n; k ++ ) {
            fac = fac * k;
        }
        return fac;
    }
}
