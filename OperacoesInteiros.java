import java.util.Scanner;

public class OperacoesInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int count = 0;
            int pares = 0;
            int impares = 0;
            int soma = 0;

            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;

            while (scanner.hasNextInt()) {
                int valor = scanner.nextInt();

                if (valor == -1) {
                    break;
                }

                count++;
                soma += valor;

                if (valor % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }

            if (count == 0) {
                break;
            }

            double media = (double) soma / count;

            System.out.println(count);
            System.out.println(pares);
            System.out.println(impares);
            System.out.println(soma);
            System.out.printf("%.2f\n", media);
            System.out.println(maior);
            System.out.println(menor);
        }

        scanner.close();
    }
}