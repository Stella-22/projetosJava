//Exercicio 2 =
//Criar variáveis representando:
//Nome do cliente.
//Número da conta.
//Saldo.
//Status da conta (ativa ou não).
//
//E imprimir na tela
public class Exercicio2 {public static void main(String[] args){
    String nomeCliente="Estela Aparecida Pinto Bettarello";
    int numerodaConta=1234666;
    double saldo=-50.00;
    boolean statusdaConta=false;
    System.out.println("Nome do cliente: " +nomeCliente);
    System.out.println("Número da conta: " +numerodaConta);

    if(statusdaConta==true){
        System.out.println("Situação da conta: Ativa");
    }else{
        System.out.println("Situação da conta: Inativa");
    }
    if(saldo<=0){
        System.out.println("Saldo disponível: "+"Indisponível para Saque");
    }else{
        System.out.println("Saldo disponível: "+saldo);
    }

}
}

