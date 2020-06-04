import java.util.*;

public class Day1c {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        int[] f = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            f[i] = scanner.nextInt();
        }

        scanner.close();
        int length = 0;

        for (int i : f) {
            length += i;
        }

        int[] s = new int[length];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < f[i]; j++) {
                s[index] = x[i];
                index++;
            }
        }

        Arrays.sort(s);

        double q1 = median(s, 0, s.length / 2 - 1);
        double q3 = median(s, (s.length + 1) / 2, s.length - 1);

        System.out.printf("%.1f", q3 - q1);
    }

    private static double median(int[] s, int start, int end) {
        double median = 0;

        if ((end - start) % 2 == 0) {
            median = s[(end + start) / 2];
        } else {
            median = (s[(end + start) / 2] + s[(end + start) / 2 + 1]) / 2;
        }

        return median;
    }
}
