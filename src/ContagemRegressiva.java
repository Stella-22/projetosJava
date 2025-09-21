public class ContagemRegressiva {
    /*Crie um programa Java que use um laço while para fazer uma contagem regressiva
de 10 até 0, imprimindo cada número. Ao final, imprima "Fogo!".*/
    public static void main(String[] args){
        int numero = 10;
        while (numero >= 1) {
            System.out.println ( numero--);
        }
        System.out.println("Fogo!");
    }
}
