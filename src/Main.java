
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor solicitado para saque: ");
        double valor = scanner.nextDouble();

        System.out.println("Valor solicitado para saque: " + valor);

        scanner.close();
    }
}
