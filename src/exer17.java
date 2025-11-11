import java.util.Scanner;

public class exer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nInscritosAlto = 0;
        int nInscritosBaixo = 0;
        double alturaAlta = Double.MIN_VALUE;
        double alturaBaixa = Double.MAX_VALUE;
        double soma = 0;
        int cont = 0;

        while (true) {
            System.out.print("Nº de Inscrição: ");
            int nInscritos = sc.nextInt();

            if (nInscritos == 0) {
                break;
            }

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            if (altura > alturaAlta) {
            alturaAlta = altura;
            nInscritosAlto = nInscritos;
            }

            if (altura < alturaBaixa) {
                alturaBaixa = altura;
                nInscritosBaixo = nInscritos;
            }

            soma += altura;
            cont++;
        }

        double mediaAltura = (cont > 0) ? soma / cont : 0;

        System.out.printf("O atleta mais baixo tem %.2fm", alturaBaixa);  
        System.out.println(" e seu número de inscrição é " + nInscritosBaixo);

        System.out.printf("\nO atleta mais alto tem %.2fm", alturaAlta);  
        System.out.println(" e seu número de inscrição é " + nInscritosAlto);

        System.out.printf("\nA altura média do grupo de atletas é: %.2fm", mediaAltura);  

        sc.close();
    }
}
