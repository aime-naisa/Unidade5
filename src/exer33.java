import java.util.Scanner;

public class exer33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votosC1 = 0;
        int votosC2 = 0;
        int votosC3 = 0;
        int votosC4 = 0;
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;

        while (true) {
            System.out.print("Digite o código do voto (1-6) ou 0 para encerrar: ");
            int codigo = sc.nextInt();

            if (codigo == 0) {
                break;
            }

            switch (codigo) {
                case 1:
                    votosC1++;
                    totalVotos++;
                    break;
                case 2:
                    votosC2++;
                    totalVotos++;
                    break;
                case 3:
                    votosC3++;
                    totalVotos++;
                    break;
                case 4:
                    votosC4++;
                    totalVotos++;
                    break;
                case 5:
                    votosNulos++;
                    totalVotos++;
                    break;
                case 6:
                    votosBrancos++;
                    totalVotos++;
                    break;
                default:
                    System.out.println("Opção incorreta");
            }
        }

        System.out.println("\nResultado da eleição:");
        System.out.println("Candidato 1: " + votosC1 + " votos");
        System.out.println("Candidato 2: " + votosC2 + " votos");
        System.out.println("Candidato 3: " + votosC3 + " votos");
        System.out.println("Candidato 4: " + votosC4 + " votos");
        System.out.println("Votos nulos: " + votosNulos);
        System.out.println("Votos em branco: " + votosBrancos);

        if (totalVotos > 0) {
            double percentualNulosBrancos = ((votosNulos + votosBrancos) * 100.0) / totalVotos;
            System.out.printf("Percentual de votos nulos e brancos: %.2f%%\n", percentualNulosBrancos);
        }

        sc.close();
    }
}
