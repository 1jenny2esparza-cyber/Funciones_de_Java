import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar las cadenas
        System.out.println("Ingresa la primera cadena:");
        String cadena1 = scanner.nextLine();

        System.out.println("Ingresa la segunda cadena:");
        String cadena2 = scanner.nextLine();

        // Comparar longitud
        if (cadena1.length() == cadena2.length()) {
            System.out.println("Ambas cadenas tienen la misma longitud.");
        } else {
            System.out.println("Las cadenas tienen diferente longitud.");
        }

        // Comparar contenido
        if (cadena1.equals(cadena2)) {
            System.out.println("El contenido de las cadenas es igual.");
        } else {
            System.out.println("El contenido de las cadenas es diferente.");
        }

        scanner.close();
    }
}