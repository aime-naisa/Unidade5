import java.util.Scanner;

public class exer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Nome: ");
            String nome = sc.next();

            if (nome.equalsIgnoreCase("fim")) break;
            System.out.print("Nota 1: ");
            double n1 = sc.nextDouble();
           
            System.out.print("Nota 2: ");
            double n2 = sc.nextDouble();
           
            double media = (n1 + n2) / 2;
           
            System.out.println("\nA média do(a) " + nome + " é " + media);
        }
        sc.close();
    }
}
