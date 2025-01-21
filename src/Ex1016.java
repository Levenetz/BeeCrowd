import java.util.Scanner;
public class Ex1016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int velocidadeX = 60;
        int velocidadeY = 90;

        int diferencaVelocidade = velocidadeY - velocidadeX;

        double diferencaVelocidadePorMinuto = diferencaVelocidade / 60.0;

        // Ler a distância desejada
        double distancia = scanner.nextDouble();

        // Calcular o tempo em minutos
        double tempoEmMinutos = distancia / diferencaVelocidadePorMinuto;

        // Exibir o resultado
        System.out.println(tempoEmMinutos+"minutos");
        scanner.close();
    }
}