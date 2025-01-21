import java.util.Scanner;
public class Ex1002 {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    Double R = input.nextDouble();
    Double N = 3.14159;
    Double A = N*(Math.pow(R, 2)); //Math = biblioteca java 
                                     //Pow= Calculo de potencia

    
    System.out.printf("A=%.4f%n", A);
    input.close();

}
}