import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar fecha al usuario
        System.out.println("Ingresa una fecha con formato YYYY-MM-DD:");
        String fechaTexto = scanner.nextLine();

        // Convertir texto a LocalDate
        LocalDate fecha = LocalDate.parse(fechaTexto);

        // Una semana después
        LocalDate semanaDespues = fecha.plusWeeks(1);

        // Un mes antes
        LocalDate mesAntes = fecha.minusMonths(1);

        // Mostrar resultados
        System.out.println("Fecha ingresada: " + fecha);
        System.out.println("Una semana después: " + semanaDespues);
        System.out.println("Un mes antes: " + mesAntes);

        scanner.close();
    }
}