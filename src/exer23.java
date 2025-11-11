import java.util.Scanner;

public class exer23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome do vendedor: ");
            String nome = sc.nextLine();

            System.out.print("Digite o número de produtos vendidos: ");
            int n = sc.nextInt();

            double totalVendas = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Digite o preço do produto " + i + ": R$ ");
                double preco = sc.nextDouble();

                System.out.print("Digite a quantidade vendida do produto " + i + ": ");
                int quantidade = sc.nextInt();

                totalVendas += preco * quantidade;
            }

            double salario = totalVendas * 0.3;

            System.out.println("\n----- Relatório do Vendedor -----");
            System.out.println("Nome: " + nome);
            System.out.printf("Total de Vendas: R$ %.2f\n", totalVendas);
            System.out.printf("Salário (30%% de comissão): R$ %.2f\n", salario);
            System.out.println("--------------------------------\n");

            sc.nextLine();
            System.out.print("Deseja digitar os dados de mais um vendedor? s (SIM) / n (NÃO): ");
            continuar = sc.nextLine();
        }

        System.out.println("Fim do programa.");
        sc.close();
    }
}
