import java.util.Locale;
import java.util.Scanner;
import static java.lang.String.format;
import java.util.Locale;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //estou criando uma variavel scanner que busca o dado digitado no teclado
        scanner.useLocale(Locale.US);
        System.out.print("Informe a sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Informe o seu peso (em kg): ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: "+ format("%.2f", imc));
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Você está com peso normal.");
        } else if (imc < 30) {
            System.out.println("Você está com sobrepeso. ");
        } else {
            System.out.println("Você está obeso.");
        }

        scanner.close();
    }
}
