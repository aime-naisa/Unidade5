public class exer22 {
    public static void main(String[] args) {
        double salario = 2000.00;
        double aumento = 0.015; 
        int ano = 1996;
        int anoAtual = 2025;

        while (ano <= anoAtual) {
            salario += salario * aumento;
            aumento *= 2; 
            ano++;
        }

        System.out.printf("O salário atual em %d ", anoAtual);
        System.out.printf(" é de R$ %.2f%n", salario);
    }
}
