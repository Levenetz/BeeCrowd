import java.util.Scanner;
public class Ex1005 {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    Double A = input.nextDouble();
    Double B = input.nextDouble();
    Double MEDIA = ((A *3.5) + (B*7.5)) /11.0;

    System.out.printf("MEDIA = %.5f%n", MEDIA);
    input.close();

}
}