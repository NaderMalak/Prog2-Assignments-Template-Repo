import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        oneToN(scanner);
        multiplicationTable(scanner);
        pyramid(scanner);
        shape1(scanner);
        primeOrNot(scanner);
    }

    public static void oneToN(Scanner s) {
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void multiplicationTable(Scanner s) {
        int n = s.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }

    public static void pyramid(Scanner s) {
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            if (!(i == n)) System.out.println();
        }
    }

    public static void shape1(Scanner s) {
        int n = s.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            if (!(i == 1)) System.out.println();
        }
    }

    public static void primeOrNot(Scanner s) {
        int t = s.nextInt();
        int[] testCases = new int[t];
        for (int i = 0; i < t; i++) {
            int testCase = s.nextInt();
            testCases[i] = testCase;
        }

        int n = 1000000;
        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }
        prime[0] = prime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        for (int Case : testCases) {
            if (prime[Case]) System.out.println("Prime");
            else System.out.println("Not");
        }
    }
}
