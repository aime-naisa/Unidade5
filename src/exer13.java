import java.util.Scanner;

public class exer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número total de reabastecimentos: ");
        int n = sc.nextInt();

        int[] odometro = new int[n + 1];
        double[] combustivel = new double[n];

        System.out.print("Odômetro inicial: ");
        odometro[0] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Parada " + (i + 1) + ": Quilometragem: ");
            odometro[i + 1] = sc.nextInt();
            System.out.print("Parada " + (i + 1) + ": Combustível: ");
            combustivel[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            double kmPorLitro = (odometro[i + 1] - odometro[i]) / combustivel[i];
            System.out.printf("Parada %d: %.2f km por litro%n", i + 1, kmPorLitro);
        }

        double kmTotal = odometro[n] - odometro[0];
        double litrosTotal = 0;
        for (int i = 0; i < n; i++) {
            litrosTotal += combustivel[i];
        }
        double mediaKmPorLitro = kmTotal / litrosTotal;
        System.out.printf("Quilometragem média obtida por litro: %.2f%n", mediaKmPorLitro);

        sc.close();        
    }
}
