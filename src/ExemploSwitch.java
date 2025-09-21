public class ExemploSwitch {
    public static void main(String[] args) {
        int diaDaSemana = 7;
                // considerar Domingo sendo 1
        String nomeDia;

        switch (diaDaSemana) {
            case 1:
            nomeDia = "Domingo";
            break;
            case 2:
                nomeDia = "Segunda-Feira";
                break;
            case 3:
                nomeDia = "Terça-Feira";
                break;
            case 4:
                nomeDia = "Quarta-Feira";
                break;
            case 5:
                nomeDia = "Quinta-Feira";
                break;
            case 6:
                nomeDia = "Sexta-Feira";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = "Dia Inválido";
        }
        System.out.println( "Hoje é " + nomeDia);
    }
}
