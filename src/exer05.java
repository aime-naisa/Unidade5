import java.util.Scanner;

public class exer05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            n = sc.nextInt();
        } while (n <= 2);
        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);
            if (i < n) System.out.print(" + ");
        }
        sc.close();
    }
}
