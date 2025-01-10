import java.util.Scanner;
public class Ex1013 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int valorA = input.nextInt();
        int valorB = input.nextInt();
        int valorC = input.nextInt();

        int compare1 = retornaMaior(valorA,valorB);
        int compare2 = retornaMaior(compare1,valorC);
              
                
        
               
                System.out.println(compare2+" eh o maior");
        }
        
        public static int retornaMaior(int numero1, int numero2){
    int maior = (numero1 +numero2+Math.abs(numero1-numero2))/2;
    return maior;
}
}