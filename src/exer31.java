import java.util.Scanner;

public class exer31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();
        int numero = n;
        int divisor = 2;

        System.out.println("número\tdecomposição");

        while (numero > 1) {
            if (numero % divisor == 0) {
                System.out.println(numero + "\t" + divisor);
                numero /= divisor;
            } else {
                divisor++;
            }
        }

        System.out.println("1\t");
        sc.close();
    }
}
