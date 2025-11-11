import java.util.Scanner;

public class exer19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalRecebido = 0;

        while (true) {
            System.out.print("Valor da compra: ");
            double valorCompra = sc.nextDouble();

            if (valorCompra == 0) {
                break;
            }

            double valorPagar;
            if (valorCompra > 500) {
                valorPagar = valorCompra * 0.8;
            } else {
                valorPagar = valorCompra * 0.85;
            }

            System.out.printf("Valor a pagar: R$%.2f%n", valorPagar);
            totalRecebido += valorPagar;
        }

        System.out.printf("\nO valor total recebido foi de R$%.2f%n", totalRecebido);
        sc.close();
    }
}
