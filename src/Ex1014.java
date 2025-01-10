import java.util.Scanner;
public class Ex1014 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double km = input.nextDouble();
        double gasolinaLitros = input.nextDouble();
        double consumoMedio = km/gasolinaLitros;
        String resultado = String.format("%.3f",consumoMedio);
        
    System.out.println(resultado + " km/l");        
        
               
                
}
}