import java.util.*;

public class Media {
    public static void main(String[] args) {
        boolean cancel = false;
        Scanner scanner = new Scanner(System.in);
        List<Float> auxList = new ArrayList<>();

        for (int i = 0; i< 3;i++) {
            // System.out.print("Adicione um valor numerico: ");
            try {
                String input = scanner.next().replace(',', '.');
                Float newValue = Float.valueOf(input);
                auxList.add(newValue);   
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Numero invalido");
            }
            // System.out.print("Deseja adicionar um novo valor? (sim/não):");
            // cancel = scanner.next().toLowerCase().equals("nao");
        }

        float avg = (float) auxList.stream().mapToDouble(Float::doubleValue)
                .average()
                .orElse(0.0);  

        System.out.printf("%.2f\n", avg);
        
    }
}
