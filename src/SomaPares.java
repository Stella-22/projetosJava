public class SomaPares {
    /*Crie um programa Java que use um laço for para somar todos os números pares de 1
a 50 e imprima o resultado final.*/
    public static void main(String[] args){
        int soma = 0;
        for ( int i =0; i<=50; i=i+2){
            System.out.println( i );
            soma = soma+ i;
        }
        System.out.println( soma );
    }
}
