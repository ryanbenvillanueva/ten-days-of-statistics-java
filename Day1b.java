import java.util.*;

public class Day1b {

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

        double mean = mean(x, n);
        double standardDeviation = standardDeviation(x, n, mean);

        System.out.printf("%.1f", standardDeviation);
    }

    public static double mean(int[] x, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += x[i];
        }

        return sum / n;
    }

    public static double standardDeviation(int[] x, int n, double mean) {
        double sDev = 0;
        double squareDistance = 0;

        for (int i = 0; i < n; i++) {
            squareDistance += (x[i] - mean) * (x[i] - mean);
        }

        sDev = Math.sqrt(squareDistance / n);

        return sDev;
    }
}