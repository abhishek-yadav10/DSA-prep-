package Function;



import java.util.Scanner;

public class PrimeM2N {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimesInRange(int m, int n) {
        System.out.println("Prime numbers between " + m + " and " + n + " are:");
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(" " + i);
            }
        }
        System.out.println(); // For a new line after printing all primes
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound (m): ");
        int m = sc.nextInt();
        System.out.print("Enter the upper bound (n): ");
        int n = sc.nextInt();

        printPrimesInRange(m, n);
        sc.close();
    }
}