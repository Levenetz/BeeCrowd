import java.util.Scanner;
public class Ex1007 {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    int A = input.nextInt();
    int B = input.nextInt();
    int C = input.nextInt();
    int D = input.nextInt();
    int DIFERENCA = ((A*B) - (C*D));

    System.out.println("DIFERENCA = " +DIFERENCA);
    input.close();

}
}