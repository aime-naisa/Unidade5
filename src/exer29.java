import java.util.Scanner;

public class exer29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor a ser sacado: ");
        int valor = sc.nextInt();

        int[] cedulas = {20, 10, 5, 2, 1};
        int[] quantidade = new int[cedulas.length];

        for (int i = 0; i < cedulas.length; i++) {
            quantidade[i] = valor / cedulas[i];
            valor %= cedulas[i];
        }

        System.out.println("Cédulas fornecidas:");
        for (int i = 0; i < cedulas.length; i++) {
            if (quantidade[i] > 0) {
                System.out.println(quantidade[i] + " cédula(s) de " + cedulas[i]);
            }
        }

        sc.close();
    }
}
