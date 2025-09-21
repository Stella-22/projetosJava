/*import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculaIdade {
    public static void main(String[] args){
        LocalDate data1 = LocalDate.of(1979,4,27);
        LocalDate data2 = LocalDate.of(2025,9,9);

        long dias = ChronoUnit.DAYS.between(data1, data2);
        long meses = ChronoUnit.MONTHS.between(data1, data2);
        long anos = ChronoUnit.YEARS.between(data1, data2);

        System.out.println("Sua idade é: "  + anos + "Anos"  + meses + "Meses"  + dias + "Dias");
    }
}*/

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua data de nascimento (AAAA-MM-DD): ");
        String entrada = scanner.nextLine();

        LocalDate nascimento = LocalDate.parse(entrada);
        LocalDate hoje = LocalDate.now();

        Period idade = Period.between(nascimento, hoje);

        System.out.println("Sua idade é: " + idade.getYears() + " anos, " +
                idade.getMonths() + " meses e " +
                idade.getDays() + " dias.");
    }
}

