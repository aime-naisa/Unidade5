import java.util.Scanner;

public class exer34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contasEncerradas = 0;

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Encerrar conta de um hóspede");
            System.out.println("2 - Verificar número de contas encerradas");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir quebra de linha

            if (opcao == 1) {
                System.out.print("Nome do hóspede: ");
                String nome = sc.nextLine();
                System.out.print("Número de diárias: ");
                int diarias = sc.nextInt();

                double taxaServico;
                if (diarias < 15) {
                    taxaServico = 7.50;
                } else if (diarias == 15) {
                    taxaServico = 6.50;
                } else {
                    taxaServico = 5.00;
                }

                double total = diarias * (50 + taxaServico);
                System.out.printf("Hóspede: %s\nTotal a pagar: R$ %.2f\n", nome, total);
                contasEncerradas++;

            } else if (opcao == 2) {
                System.out.println("Número de contas encerradas: " + contasEncerradas);

            } else if (opcao == 3) {
                System.out.println("Encerrando o programa...");
                break;

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}
