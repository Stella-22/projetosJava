public class VerificadorVotacao {
    /*Crie um programa Java que declare uma variável inteira idade .
1. Se a idade for menor que 16, imprima "Não pode votar."
2. Se a idade for entre 16 e 17 (inclusive), imprima "Voto opcional."
3. Se a idade for 18 ou mais, imprima "Voto obrigatório."*/
    public static void main (String[] args){
        int idade = 18;
        if (idade <16){
            System.out.println ("Não pode votar.");
        }else if(idade>=16 && idade<=17){
            System.out.println ("Voto opcional.");
        } else if (idade>=18){
            System.out.println ("Voto obrigatório.");
        }


    }
}
