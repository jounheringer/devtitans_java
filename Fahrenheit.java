import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float response = 0f;
        float input = 0;

        input = scanner.nextFloat();

        response = (9*input) / 5 + 32;

        System.out.printf("%.1f", response);
    }
}
