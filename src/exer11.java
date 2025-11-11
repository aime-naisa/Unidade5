import java.util.Scanner;

public class exer11 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Quantas horas a máquina vai operar? ");
        int horas = sc.nextInt();

        long biscoitos = 1;
        long total = 0;

        for (int hora = 1; hora <= horas; hora++) {
            System.out.println("Hora " + hora + ": " + biscoitos);
            total += biscoitos;
            biscoitos *= 3;
        }

        System.out.println("Total de biscoitos quebrados: " + total);
        sc.close();
    }
}
