import java.util.Scanner;

public class exer06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("Altura da pessoa " + 1 + ": " );
            double altura = sc.nextDouble();

            soma += altura;
        }

        double media = soma / 20;

        System.out.printf("A média de altura é de: %.2f%n", media);
        sc.close();
        
    }
}
