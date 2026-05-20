import java.util.Scanner;

public class AreaPoligono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[][] auxMap = new float[6][2];
        int count = 0;
        float sum = 0f;

        while (true) { 
            String x = scanner.next().replace(',', '.');
            float newX = (float) Float.valueOf(x);

            String y = scanner.next().replace(',', '.');
            if (y.equals("-1")) break;
            float newY = (float) Float.valueOf(y);

            auxMap[count][0] = newX;
            auxMap[count][1] = newY;
            
            count++;
        }

        auxMap[count+1][0] = auxMap[0][0];
        auxMap[count+1][1] = auxMap[0][1];

        for (int i =0; i< 5; i++) {
            sum += (auxMap[i+1][0] + auxMap[i][0]) * (auxMap[i+1][1] - auxMap[i][1]);
        }

        System.out.printf("%.4f", Math.abs(sum/2));
    }
}
