import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar texto al usuario
        System.out.println("Ingresa un texto largo:");

        // Leer todo el texto
        String texto = scanner.nextLine();

        // Convertir texto a minúsculas
        texto = texto.toLowerCase();

        // Separar palabras
        String[] palabras = texto.split(" ");

        int contador = 0;

        // Contar cuántas veces aparece "ingeniería"
        for (String palabra : palabras) {

            // Eliminar signos de puntuación
            palabra = palabra.replaceAll("[^a-záéíóúñ]", "");

            if (palabra.equals("ingeniería")) {
                contador++;
            }
        }

        // Mostrar resultado
        System.out.println("La palabra 'ingeniería' aparece "
                + contador + " veces.");

        scanner.close();
    }
}