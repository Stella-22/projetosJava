//-> Lista de saldos, percorrer ela e mostrar somente os clients VIPs, ou seja, com saldo maior que 10.000

import static java.lang.String.format;

public class ClienteVip {
    public static void main(String[] args) {

        double[] saldos = {10000.00, -5000.00, 13000.00, -2.00};

        for (int i = 0; i < saldos.length; i++) {

            if (saldos[i] >= 10000.00) {

                System.out.println(format("%.2f", saldos[i]) + " Cliente VIP");

            }
        }
    }
}
