//-> Lista de idades, percorra ela e verifique quais são maior de idade ou não

public class ListaIdades {
    public static void main(String[]args){

        int[]idade = {6,60,25,45,32,89,14,6,23,75,42,36,23,56,18};

        for(int i=0; i<idade.length; i++){

            if(idade[i] >=18){

                System.out.println (idade[i] + " Maior de Idade");

            }
            else{
                System.out.println(idade[i] + " Menor de Idade");

            }

        }
    }
}
