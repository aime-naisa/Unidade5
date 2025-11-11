import java.util.Scanner;

public class exer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countMenor10 = 0, count10a20 = 0, countMaior20 = 0;
        double totalCompra = 0, totalVenda = 0, totalLucro = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o nome da mercadoria: ");
            sc.nextLine();
            
            System.out.print("Digite o preço de compra (PC) da mercadoria: ");
            double pc = sc.nextDouble();
            
            System.out.print("Digite o preço de venda (PV) da mercadoria: ");
            double pv = sc.nextDouble();
            
            double lucroPercentual = (pv - pc) / pc * 100;
            
            totalCompra += pc;
            totalVenda += pv;
            totalLucro += (pv - pc);
            
            if (lucroPercentual < 10) {
                countMenor10++;
            } else if (lucroPercentual <= 20) {
                count10a20++;
            } else {
                countMaior20++;
            }
            
            sc.nextLine();  
        }
        
        System.out.println("Mercadorias com lucro < 10%: " + countMenor10);
       
        System.out.println("Mercadorias com lucro entre 10% e 20%: " + count10a20);
       
        System.out.println("Mercadorias com lucro > 20%: " + countMaior20);
       
        System.out.println("Valor total de compra: " + totalCompra);
       
        System.out.println("Valor total de venda: " + totalVenda);
        
        System.out.println("Lucro total: " + totalLucro);

        sc.close();
    }
}
