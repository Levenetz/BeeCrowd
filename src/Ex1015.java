import java.util.Scanner;

public class Ex1015 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        float p1x1 = input.nextFloat();
        float p1y1 = input.nextFloat();

        float p2x2 = input.nextFloat();
        float p2y2 = input.nextFloat();

        float meiaOp = (p2x2 - p1x1) * (p2x2 - p1x1);
        float meiaOp2 = (p2y2 - p1y1) * (p2y2 - p1y1);
        float soma = meiaOp + meiaOp2;

        double resultado = Math.sqrt(soma);

        System.out.printf("%.4f%n",resultado);
        input.close();

}

}


