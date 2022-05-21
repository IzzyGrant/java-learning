// Creates a .txt file by Izzy G. Osorio

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException; // Necesarias para la creacion de archivos .txt
import java.time.LocalDateTime; // libreria para fechas y tiempo

public class arrayToTxt {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        // Revisar bien como esta estructurada void main ademas de throws...
        // Los siguientes arreglos(arrays) son los que se imprimiran en el documento de
        // texto
        String productos[] = { "Paleta", "Papas", "Galletas de chocolate", "Refresco" };
        double precios[] = { 2.50, 14.00, 15.50, 34.70 };
        int existencias[] = { 8, 12, 9, 45 };

        // Se crea el objeto que alojara el valor de tiempo actual
        LocalDateTime today = LocalDateTime.now();

        // Aqui se crea el archivo de texto como su nombre y tipo de caracteres
        PrintWriter writer = new PrintWriter("archivo.txt", "UTF-8");

        // Aqui se inicia a escribir el contenido en el docunemto .txt mediante
        // writer.println();
        writer.println("Lista de Productos");

        writer.println("Hoy es: " + today); // Aqui se escribe la hora y fecha actual

        System.out.println("El arreglo productos tiene: " + productos.length + " elementos.");

        // En este ciclo for se escribira cada elemento del arreglo
        for (int i = 0; i < productos.length; i++) {

            writer.println(
                    "ID: " + i + " -> " + productos[i] + " <<$" + precios[i] + ">> Existencias: " + existencias[i]);

        }
        // finaliza la escritura del documento y se cierra la funcion
        writer.close();

    }
}
