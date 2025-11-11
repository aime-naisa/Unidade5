import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }
        }

        sc.close();
    }
}
