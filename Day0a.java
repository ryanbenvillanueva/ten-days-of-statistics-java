import java.util.*;

public class Day0a {

    public static double mean(int[] arr) {
        double average = 0.0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        average = (double) sum / arr.length;

        return average;
    }

    public static double median(int[] arr) {
        double median = 0.0;

        Arrays.sort(arr);

        int n = arr.length / 2;

        if (arr.length % 2 == 0) {
            median = (double) (arr[n - 1] + arr[n]) / 2;
        } else {
            median = arr[n];
        }

        return median;
    }

    public static int mode(int[] arr) {
        int maxCount = 0;
        int mode = 0;
        Arrays.sort(arr);

        for (int number : arr) {
            int count = 0;

            for (int innerNumber : arr) {
                if (number == innerNumber) {
                    ++count;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = number;
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = scanner.nextInt();
        }
        scanner.close();
        double mean = mean(X);
        double median = median(X);
        int mode = mode(X);

        System.out.printf("%.1f\n", mean);
        System.out.printf("%.1f\n", median);
        System.out.println(mode);
    }
}