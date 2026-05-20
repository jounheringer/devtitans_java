import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaColecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float input = 0f;
        List<Float> auxList = new ArrayList<>();

        while (true) {
            input = scanner.nextFloat();

            if (input == -1f) break;

            auxList.add(input);
        }   

        float avg = (float) auxList.stream().mapToDouble(Float::doubleValue)
                .average()
                .orElse(0.0);  

        System.out.printf("%.2f\n", avg);
    }
}
