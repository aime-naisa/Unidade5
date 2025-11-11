public class exer03 {
    public static void main(String[] args) {
        double soma = 0.0;

        for (int i = 1; i <= 100; i++) {
            soma+= 1.0/i;
        }

        System.out.printf("A soma da série é: %.2f%n", soma);
    }
}
