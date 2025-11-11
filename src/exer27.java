import java.util.Scanner;

public class exer27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiorDia = 0;
        int maiorProducao = 0;
        String periodoMaisProducao = "";
        int producaoPeriodo = 0;

        while (true) {
            int dia;
            do {
                dia = sc.nextInt();
                if (dia < 1 || dia > 30) {
                    System.out.println("Dia inválido");
                }
            } while (dia < 1 || dia > 30);

            int producaoManha = sc.nextInt();
            int producaoTarde = sc.nextInt();
            int totalDia = producaoManha + producaoTarde;
            double valorRecebido = 0;

            if (dia >= 1 && dia <= 15) {
                if (totalDia > 100 && producaoManha >= 30 && producaoTarde >= 30) {
                    valorRecebido = totalDia * 0.8;
                } else {
                    valorRecebido = totalDia * 0.5;
                }
            } else {
                valorRecebido = producaoManha * 0.4 + producaoTarde * 0.3;
            }

            System.out.printf("R$ %.2f\n", valorRecebido);

            if (totalDia > maiorProducao) {
                maiorProducao = totalDia;
                maiorDia = dia;
            }

            if (producaoManha > producaoTarde) {
                if (producaoManha > producaoPeriodo) {
                    producaoPeriodo = producaoManha;
                    periodoMaisProducao = "manhã";
                }
            } else {
                if (producaoTarde > producaoPeriodo) {
                    producaoPeriodo = producaoTarde;
                    periodoMaisProducao = "tarde";
                }
            }

            System.out.println("Novo funcionário: (1.sim 2.não)?");
            int opcao = sc.nextInt();
            if (opcao != 1) {
                break;
            }
        }

        System.out.println("Dia com maior produção: " + maiorDia);
        System.out.println("Período com maior produção: " + periodoMaisProducao + " (" + producaoPeriodo + ")");
        sc.close();
    }
}
