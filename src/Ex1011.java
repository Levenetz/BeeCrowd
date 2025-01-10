import java.util.Scanner;
public class Ex1011 {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    double valorInicial = 4/3.0;
    double raio = input.nextDouble();
    double cubo = raio*raio*raio;
    double pi =  3.14159;

    double resultadoFinal = valorInicial*cubo*pi;

    System.out.printf("VOLUME = %.3f%n", resultadoFinal);


}
}