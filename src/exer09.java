import java.util.Scanner;

public class exer09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();

            System.out.print("Idade de " + nomes[i] + ": ");
            idades[i] = sc.nextInt();
            sc.nextLine();
        }

        int countAcima20 = 0;
        int count18 = 0;
        String[] alunos18 = new String[n];

        for (int i = 0; i < n; i++) {
            if (idades[i] == 18) {
                alunos18[count18] = nomes[i];
                count18++;
            }
            if (idades[i] > 20) {
                countAcima20++;
            }
        }

        System.out.print("\nNomes dos alunos que têm 18 anos: ");
        if (count18 == 0) {
            System.out.println("Nenhum aluno tem 18 anos.");
        } else {
            for (int i = 0; i < count18; i++) {
                if (i == count18 - 1 && count18 > 1) {
                    System.out.print("e " + alunos18[i]);
                } else if (i == count18 - 1) {
                    System.out.print(alunos18[i]);
                } else {
                    System.out.print(alunos18[i] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("Quantidade de alunos com idade acima de 20 anos: " + countAcima20);

        sc.close();
    }
}
