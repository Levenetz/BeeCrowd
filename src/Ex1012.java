import java.util.Scanner;
public class Ex1012 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double valorA = input.nextDouble();
        double valorB = input.nextDouble();
        double valorC = input.nextDouble();
        double pi = 3.14159;

        double triangulo = (valorA * valorC) / 2;
        double circulo = pi* (valorC*valorC);
        //A=(a+b)h/2
        double trapezio = ((valorA + valorB)* valorC)/2;
        double quadrado = valorB * valorB;
        double retangulo = valorB * valorA;

    System.out.printf("TRIANGULO: %.3f%n",triangulo);
    System.out.printf("CIRCULO: %.3f%n",circulo);
    System.out.printf("TRAPEZIO: %.3f%n",trapezio);
    System.out.printf("QUADRADO: %.3f%n",quadrado);
    System.out.printf("RETANGULO: %.3f%n",retangulo);

    input.close();

}
}