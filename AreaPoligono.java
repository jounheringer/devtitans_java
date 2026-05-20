import java.util.Scanner;

public class AreaPoligono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[][] auxMap = new float[7][2];
        int count;
        float sum = 0f;

        for (count = 0; count <= 5; count++) { 
            if (!scanner.hasNext()) break;
            float newX = scanner.nextFloat();

            float newY = scanner.nextFloat();
            
            auxMap[count][0] = newX;
            auxMap[count][1] = newY;
        }

        auxMap[count][0] = auxMap[0][0];
        auxMap[count][1] = auxMap[0][1];

        for (int i =0; i<= 5; i++) {
            sum += (auxMap[i+1][0] + auxMap[i][0]) * (auxMap[i+1][1] - auxMap[i][1]);
        }

        System.out.printf("%.4f", Math.abs(sum/2));
    }
}
