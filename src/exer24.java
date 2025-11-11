import java.util.Scanner;

public class exer24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o limite diário de pesca (em kg): ");
        double limiteDiario = sc.nextDouble();
        double limiteGramas = limiteDiario * 1000;

        double pesoTotal = 0;
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o peso do peixe (em gramas): ");
            double pesoPeixe = sc.nextDouble();

            pesoTotal += pesoPeixe;

            System.out.printf("Peso total da pesca até agora: %.2f g\n", pesoTotal);

            if (pesoTotal > limiteGramas) {
                System.out.println("Limite diário de pesca excedido!");
                break;
            }

            sc.nextLine();
            System.out.print("Deseja informar o peso de mais um peixe? s (SIM) / n (NÃO): ");
            continuar = sc.nextLine();
        }

        System.out.println("Encerrando o programa.");
        sc.close();
    }
}
