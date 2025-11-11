import java.util.Scanner;

public class exer28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votosNenhum = 0;
        int votosCPM22 = 0;
        int votosSkank = 0;
        int votosJotaQuest = 0;
        int totalVotos = 0;

        while (true) {
            System.out.println("Mais um voto: s (SIM) / n (NÃO)?");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }

            System.out.println("Digite o código do conjunto (1-4):");
            int codigo = sc.nextInt();
            switch (codigo) {
                case 1:
                    votosNenhum++;
                    break;
                case 2:
                    votosCPM22++;
                    break;
                case 3:
                    votosSkank++;
                    break;
                case 4:
                    votosJotaQuest++;
                    break;
                default:
                    System.out.println("Código inválido.");
                    continue;
            }
            totalVotos++;
        }

        System.out.println("Total de votos:");
        System.out.println("Nenhum de Nós: " + votosNenhum);
        System.out.println("CPM22: " + votosCPM22);
        System.out.println("Skank: " + votosSkank);
        System.out.println("Jota Quest: " + votosJotaQuest);

        if (totalVotos > 0) {
            System.out.println("Percentual de votos:");
            System.out.printf("Nenhum de Nós: %.2f%%\n", (votosNenhum * 100.0 / totalVotos));
            System.out.printf("CPM22: %.2f%%\n", (votosCPM22 * 100.0 / totalVotos));
            System.out.printf("Skank: %.2f%%\n", (votosSkank * 100.0 / totalVotos));
            System.out.printf("Jota Quest: %.2f%%\n", (votosJotaQuest * 100.0 / totalVotos));
        }

        int maxVotos = Math.max(Math.max(votosNenhum, votosCPM22), Math.max(votosSkank, votosJotaQuest));
        System.out.print("Grupo vencedor: ");
        if (votosNenhum == maxVotos) System.out.println("Nenhum de Nós");
        else if (votosCPM22 == maxVotos) System.out.println("CPM22");
        else if (votosSkank == maxVotos) System.out.println("Skank");
        else if (votosJotaQuest == maxVotos) System.out.println("Jota Quest");

        sc.close();
    }
}
