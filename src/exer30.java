import java.util.ArrayList;
import java.util.Scanner;

public class exer30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N (início da sequência): ");
        int N = sc.nextInt();
        System.out.print("Digite K (decremento): ");
        int K = sc.nextInt();
        System.out.print("Digite M (capacidade da mochila): ");
        int M = sc.nextInt();

        ArrayList<Integer> sequencia = new ArrayList<>();
        for (int i = N; i > 0; i -= K) {
            sequencia.add(i);
        }

        ArrayList<Integer> dentro = new ArrayList<>();
        ArrayList<Integer> fora = new ArrayList<>();

        int somaDentro = 0;
        int somaFora = 0;
        int capacidadeRestante = M;

        for (int valor : sequencia) {
            if (valor <= capacidadeRestante) {
                dentro.add(valor);
                somaDentro += valor;
                capacidadeRestante -= valor;
            } else {
                fora.add(valor);
                somaFora += valor;
            }
        }

        System.out.println("Elementos da sequência: " + sequencia);
        System.out.println("Entraram na mochila: " + dentro);
        System.out.println("Ficaram fora da mochila: " + fora);
        System.out.println("Soma dos elementos na mochila: " + somaDentro);
        System.out.println("Soma dos elementos fora da mochila: " + somaFora);

        sc.close();
    }
}
