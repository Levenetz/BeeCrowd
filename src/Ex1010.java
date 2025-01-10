import java.util.Scanner;
public class Ex1010 {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
   
    int codRoup1 = input.nextInt();
    int numRoupa = input.nextInt();
    double valorRoupa = input.nextDouble();
    double totalPeca = valorRoupa*numRoupa;

    int codRoupa1 = input.nextInt();
    int numRoupa1 = input.nextInt();
    double valorRoupa1 = input.nextDouble();
    double totalPeca1 = valorRoupa1*numRoupa1;

    double totalCompra = totalPeca + totalPeca1;

    System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalCompra);

}
}
