import java.util.Scanner;

public class exer32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia da semana do 1º dia do mês (1=Domingo, ..., 7=Sábado): ");
        int p = sc.nextInt();
        System.out.print("Digite o número de dias do mês: ");
        int n = sc.nextInt();

        String[] diasSemana = {"D", "S", "T", "Q", "Q", "S", "S"};

        for (String dia : diasSemana) {
            System.out.print(dia + "\t");
        }
        System.out.println();

        int diaAtual = 1;
        int diaSemana = 1;

        for (int i = 1; i < p; i++) {
            System.out.print("\t");
            diaSemana++;
        }

        while (diaAtual <= n) {
            System.out.print(diaAtual + "\t");
            if (diaSemana % 7 == 0) {
                System.out.println();
            }
            diaAtual++;
            diaSemana++;
        }

        System.out.println();
        sc.close();
    }
}
