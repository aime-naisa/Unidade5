import java.util.Scanner;

public class exer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros: ");
        int n = sc.nextInt();

        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o numero: " + (i +1) + ": ");
            double num = sc.nextDouble();

            if (num > maior) {
                maior = num;
            } else if (num < menor) {
                menor = num;
            }
        }

        System.out.println("Maior número é: " + maior);
        System.out.println("Menor numero é: " + menor);

        sc.close();
        
    }
}
