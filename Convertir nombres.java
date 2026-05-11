import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombre;

        // Ciclo repetitivo
        while (true) {

            // Solicitar nombre
            System.out.println("Ingresa un nombre completo en minúsculas (o escribe 'salir' para terminar):");
            nombre = scanner.nextLine();

            // Verificar si desea salir
            if (nombre.equalsIgnoreCase("salir")) {
                System.out.println("Programa finalizado.");
                break;
            }

            // Convertir a mayúsculas
            String nombreMayusculas = nombre.toUpperCase();

            // Mostrar resultado
            System.out.println("Nombre en mayúsculas: " + nombreMayusculas);
        }

        scanner.close();
    }
}