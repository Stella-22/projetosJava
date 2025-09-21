public class ExemploElseIf {
    public static void main(String[] args) {
        int pontuacao = 85;
        char conceito;
        if (pontuacao >= 90) {
            conceito = 'A';
        } else if (pontuacao >= 80) {
            conceito = 'B';
        } else if (pontuacao >= 70) {
            conceito = 'C';
        } else if (pontuacao >= 60) {
            conceito = 'D';
        } else {
            conceito = 'F';
        }
        System.out.println("Sua pontuação é " + pontuacao + ", seu conceito é "
                + conceito);
        String clima = null;
        if ("chuva".equals(clima)) {
            System.out.println("Leve um guarda-chuva.");
        } else if ("sol".equals(clima)) {
            System.out.println("Use protetor solar.");
        } else {
            System.out.println("Verifique a previsão do tempo.");
        }
    }
}