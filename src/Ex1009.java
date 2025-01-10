import java.util.Scanner;
public class Ex1009 {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    String nome = input.nextLine();
    double salario = input.nextDouble();
    double totalVendas = input.nextDouble();

    double montanteTotal = salario + totalVendas * 0.15;

    System.out.printf("TOTAL = R$ %.2F%n", montanteTotal );
}
}
