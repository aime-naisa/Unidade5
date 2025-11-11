import java.util.Scanner;

public class exer08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int q = sc.nextInt();

        int negativo = Integer.MAX_VALUE;
        int positivosS = 0;
        int contPositivo = 0;

        for (int i = 0; i < q; i++) {
            System.out.print("Difite o " + (i + 1) + "º número: ");
            int n = sc.nextInt();

            if (n < 0) {
                if (n < negativo) {
                    negativo = n;
                }
            } else {
                if (n > 0) {
                    positivosS += n;
                    contPositivo++;
                }
            }
        }    

        if (negativo != Integer.MAX_VALUE) {
            System.out.println("Menor valor negativo: " + negativo);
        } else {
           System.out.println("Não há números negativos");
        }

        if (contPositivo > 0) {
            double mediaP = (double) positivosS / contPositivo;
            System.out.printf("Média de números positivos: %.2f%n", mediaP);
        } else {
            System.out.println("Não há números positivos");
        }

        sc.close();
    }
}

