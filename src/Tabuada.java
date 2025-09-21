import java.util.Scanner; // Importa a classe Scanner para ler entrada do usuário
public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner
        int numero;
        do {
            System.out.print("Digite um número positivo: ");
            numero = scanner.nextInt(); // Lê o número digitado pelo usuário
        } while (numero <= 0);
        System.out.println("Você digitou: " + numero);
        for( int i = 1; i<= 10; i++ ) {
            int multiplicacao = i * numero;
            System.out.println ( i + " * " + numero + " = " + multiplicacao);
        }
        scanner.close(); // Fecha o scanner
    }
}

