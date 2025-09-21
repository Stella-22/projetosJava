public class ClassificadorNumeros {
    /*Exercício 4: Classificador de Números
    Crie um programa Java que declare uma variável inteira numero. Usando estruturas
    condicionais ( if , else if , else ):
    1. Verifique se o numero é positivo, negativo ou zero.
    2. Imprima a mensagem correspondente (ex: "O número é positivo.").*/

    public static void main(String[] args){
       int numero = 0;
       if (numero > 0) {
           System.out.println ("o número é positivo");

       } else if (numero < 0){
           System.out.println (" o número é negativo");
       }  else {
           System.out.println (" o número é 0");
       }



    }
}
