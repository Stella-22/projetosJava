//Lista de saldos, percorrer e  informe se cada cliente está no positivo ou no negativo.

public class ListaSaldos {
    public static void main(String[] args) {

        double[] saldos = {125.44, -96.35, 52.27, -78.25, 502.38, 0};

        for (int i = 0; i < saldos.length; i++) {

            if (saldos[i] > 0) {

                System.out.println(saldos[i] + " Valor Disponível para saque");

            } else if (saldos[i] == 0) {

                System.out.println(saldos[i] + " Saldo 0.00");


            } else {
                System.out.println(saldos[i] + " Seu saldo está negativo");

            }
        }
    }
}



