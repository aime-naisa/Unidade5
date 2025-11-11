import java.util.Scanner;

public class exer20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a massa inicial (em kg): ");
        double massaInicial = sc.nextDouble();

        double massa = massaInicial;
        int tempo = 0;

        while (massa >= 0.0005) {
            massa /= 2;
            tempo += 50;
        }

        System.out.printf("\nMassa inicial: %.6f kg%n", massaInicial);
        System.out.printf("Massa final: %.6f kg%n", massa);
        System.out.printf("Tempo necessário: %d segundos%n", tempo);

        sc.close();
    }
}
