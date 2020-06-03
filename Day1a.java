import java.util.*;

public class Day1a {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }

        scanner.close();
        Arrays.sort(x);

        int q1, q2, q3 = 0;
        q1 = median(x, 0, n / 2 - 1);
        q2 = median(x, 0, n - 1);
        if (n % 2 != 0) {
            q3 = median(x, n / 2 + 1, n - 1);
        } else {
            q3 = median(x, n / 2, n - 1);
        }

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }

    public static int median(int[] x, int start, int end) {
        int median = 0;
        int length = end - start + 1;

        if (length % 2 != 0) {
            median = x[start + (length / 2)];
        } else {
            median = (x[start + (length / 2) - 1] + x[start + (length / 2)]) / 2;
        }

        return median;
    }
}