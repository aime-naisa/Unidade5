import java.util.Scanner;

public class exer25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pontosE = 0;
        int pontosD = 0;

        while (true) {
            System.out.print("Digite o ponto (E para esquerda, D para direita): ");
            String ponto = sc.nextLine().toUpperCase();

            if (ponto.equals("E")) {
                pontosE++;
            } else if (ponto.equals("D")) {
                pontosD++;
            } else {
                System.out.println("Entrada inválida. Digite E ou D.");
                continue;
            }

            System.out.printf("Placar: Esquerda %d x %d Direita\n", pontosE, pontosD);

            if ((pontosE >= 21 || pontosD >= 21) && Math.abs(pontosE - pontosD) >= 2) {
                if (pontosE > pontosD) {
                    System.out.println("Jogador da esquerda venceu!");
                } else {
                    System.out.println("Jogador da direita venceu!");
                }
                break;
            }
        }

        sc.close();
    }
}
