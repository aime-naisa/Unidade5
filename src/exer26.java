import java.util.Scanner;

public class exer26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorMaximo = sc.nextDouble();

        int trechosAcimaMaximo = 0;
        int totalTrechos = 0;
        int trechosLongosAceitos = 0;

        while (true) {
            double pedagio = sc.nextDouble();
            if (pedagio < 0) {
                break;
            }
            double distancia = sc.nextDouble();
            totalTrechos++;
            if (pedagio > valorMaximo) {
                trechosAcimaMaximo++;
            }
            if (distancia > 150 && pedagio <= valorMaximo) {
                trechosLongosAceitos++;
            }
        }

        System.out.println(trechosAcimaMaximo + " (trechos com valor acima do qual ele nega-se a pagar);");
        System.out.println(totalTrechos + " (quantidade de trechos informados);");
        System.out.println(trechosLongosAceitos + " (trechos acima de 150km com valor aceito por ele).");

        sc.close();
    }
}
