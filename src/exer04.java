public class exer04 {
    public static void main(String[] args) {
        double soma = 0.0;

        for (int i = 1; i <=20; i++) {
            double numerador = 2 * i + 1;
            double denominador = i * (i+1);

            soma += numerador / denominador;
        }

        System.out.printf("A soma dos primeiros termos é: %.2f%n", soma);
    }
}
