import java.util.Locale;
import java.util.Scanner;

public class AreaPoligono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double[] x = new double[7];
        int n = 0;
        double[] y = new double[7];
        int countY = 0;

        while (scanner.hasNextDouble()) {
            double val = scanner.nextDouble();
            if (val == -1.0) break;
            x[n++] = val;
        }

        while (scanner.hasNextDouble()) {
            double val = scanner.nextDouble();
            if (val == -1.0) break;

            if (countY < n) {
                y[countY++] = val;
            }
        }

        double sum = 0.0;

        for (int i = 0; i < n - 1; i++) {
            sum += (x[i + 1] + x[i]) * (y[i + 1] - y[i]);
        }

        double area = Math.abs(sum) / 2.0;
        System.out.printf(Locale.US, "%.4f\n", area);

        scanner.close();
    }
}