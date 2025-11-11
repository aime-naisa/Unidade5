import java.util.Scanner;

public class exer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaAlturaMulheres = 0;
        double somaAlturaTotal = 0;
        int contadorMulheres = 0;
        int contadorTotal = 0;
        
        while (true) {
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            
            if (altura == 0) {
                break;
            }
            
            System.out.print("Genero: ");
            char genero = sc.next().charAt(0);
         
            somaAlturaTotal += altura;
            contadorTotal++;
            
            if (genero == 'F' || genero == 'f') {
                somaAlturaMulheres += altura;
                contadorMulheres++;
            }
        }
       
        double mediaAlturaMulheres = (contadorMulheres > 0) ? somaAlturaMulheres / contadorMulheres : 0;
        double mediaAlturaTotal = (contadorTotal > 0) ? somaAlturaTotal / contadorTotal : 0;
     
        System.out.printf("A média da altura das mulheres é: %.2f\n", mediaAlturaMulheres);
        System.out.printf("A média de altura do grupo é: %.2f\n", mediaAlturaTotal);
        
        sc.close();
    }
}
