import java.util.Scanner;
public class Ex1008 {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    int numeroFuncionario = input.nextInt();
    int qtdHoras = input.nextInt();
    double valorHoras = input.nextDouble();
    
    double calculo = valorHoras*qtdHoras;

    System.out.println("NUMBER = "+ numeroFuncionario);
    System.out.printf("SALARY = U$ %.2F%n", calculo);
    
}
}