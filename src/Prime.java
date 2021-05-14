import java.util.*;
public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrime(n);
    }

    static void printPrime(int n) {
        for (int i = 2; i <=n; i++) {
            if (isPrime(i)==true)
                System.out.print(i + " ");
        }
    }

    static boolean isPrime(int n) {
        int num=n;
        for (int i = 2; i < num; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}