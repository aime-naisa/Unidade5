import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {
            System.out.print("Digite um número: ");
            int n = sc.nextInt();

            int numDigitos = String.valueOf(n).length();
            int metade = numDigitos / 2;

            int divisor = (int) Math.pow(10, metade);
            int esquerda = n / divisor;
            int direita = n % divisor;

            int soma = esquerda + direita;

            if (soma * soma == n) {
                System.out.println("\n" + n + " possui a propriedade!");
                System.out.println(esquerda + " + " + direita + " = " + soma + " -> " + soma + "² = " + (soma * soma));
            } else {
                System.out.println("\n" + n + " não possui a propriedade.");
                System.out.println(esquerda + " + " + direita + " = " + soma + " -> " + soma + "² = " + (soma * soma));
            }

            System.out.print("\nDeseja testar outro número? (s/n): ");
            continuar = sc.next().charAt(0);
            System.out.println(); 
        }

        sc.close();

    }
}
