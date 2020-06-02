import java.util.*;

public class Day0b {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] X = new int[N];
        int[] W = new int[N];

        for (int i = 0; i < N; i++) {
            X[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            W[i] = scanner.nextInt();
        }

        scanner.close();

        int sum = 0;
        int weightSum = 0;
        double weightedMean = 0.0;

        for (int i = 0; i < N; i++) {
            sum += X[i] * W[i];
            weightSum += W[i];
        }

        weightedMean = (double) sum / weightSum;

        System.out.printf("%.1f", weightedMean);
    }
}