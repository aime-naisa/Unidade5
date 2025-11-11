import java.util.Scanner;

public class exer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pessoasCanal4 = 0;
        int pessoasCanal5 = 0;
        int pessoasCanal9 = 0;
        int pessoasCanal12 = 0;
        int totalPessoas = 0;

        while (true) {
            System.out.print("Informe o número do canal (4, 5, 9, 12) ou 0 para encerrar: ");
            int canal = sc.nextInt();

            if (canal == 0) {
                break;
            }

            System.out.print("Informe o número de pessoas assistindo: ");
            int pessoas = sc.nextInt();

            switch (canal) {
                case 4:
                    pessoasCanal4 += pessoas;
                    break;
                case 5:
                    pessoasCanal5 += pessoas;
                    break;
                case 9:
                    pessoasCanal9 += pessoas;
                    break;
                case 12:
                    pessoasCanal12 += pessoas;
                    break;
                default:
                    System.out.println("Canal inválido! Informe 4, 5, 9, 12 ou 0 para sair.");
                    continue;
            }

            totalPessoas += pessoas;
        }

        sc.close();

        if (totalPessoas == 0) {
            System.out.println("\nNenhuma pessoa estava assistindo TV.");
        } else {
            System.out.printf("\nPercentual de audiência do canal 4: %.0f%%\n", (pessoasCanal4 * 100.0 / totalPessoas));
            System.out.printf("Percentual de audiência do canal 5: %.0f%%\n", (pessoasCanal5 * 100.0 / totalPessoas));
            System.out.printf("Percentual de audiência do canal 9: %.0f%%\n", (pessoasCanal9 * 100.0 / totalPessoas));
            System.out.printf("Percentual de audiência do canal 12: %.0f%%\n", (pessoasCanal12 * 100.0 / totalPessoas));
        }
    }
}
