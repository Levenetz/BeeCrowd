import java.util.Scanner;
public class Ex1017 {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    
    double tempoGasto = input.nextDouble();
    double velocidadeMedia = input.nextDouble();
    double consumo = 12;

    double resultado = (tempoGasto*velocidadeMedia) / consumo;

    System.out.printf("%.3f%n",resultado);
    
}
}