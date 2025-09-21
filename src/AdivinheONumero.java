import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero{
    public static void main(String[] args){

        // 1. Gerar um número aleatório entre 1 e 10
        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;
        boolean acertou = false;
        int numeroTentativas = 0;
        do {
            //2. O programa pede ao usuário para adivinhar o número
            System.out.println("Digite um número de 1 até 10:");

            //3.O usuário digita sua tentativa.
            Scanner scanner = new Scanner(System.in);
            int tentativa = scanner.nextInt();
            scanner.nextLine();
            numeroTentativas++;

            //4. O programa compara a tentativa com o número secreto:
            //Se a tentativa for menor, diz "Muito baixo!".
            //Se a tentativa for maior, diz "Muito alto!".
            //Se a tentativa for igual, diz "Parabéns! Você acertou!" e mostra quantas
            //tentativas foram necessárias.

            if(tentativa < numeroSecreto){
                System.out.println("Muito baixo! Tente Novamente");
            }else if (tentativa > numeroSecreto){
                System.out.println("Muito alto! Tente Novamente");
            }else{
                acertou=true;
                System.out.println("Parabéns! Você adivinhou o número em " + numeroTentativas + " tentativas.");
            }

            //5. O jogo continua até que o usuário acerte o número.

        } while (acertou==false);

    }
}

