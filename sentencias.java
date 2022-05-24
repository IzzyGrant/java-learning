/* Java Sentences written by Izzy G. Osorio */

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class sentencias {

    public static void main(String[] args) throws InterruptedException {

        String nuevaLinea = System.getProperty("line.separator");
        Scanner inputkey = new Scanner(System.in);

        long startTime = System.currentTimeMillis();

        int a;

        System.out.println(nuevaLinea + "---------------------------------------------" + nuevaLinea);
        System.out.println(
                "Con la sentencia 'IF' podremos obtener un resultado si se cumple ciera condicion" + nuevaLinea);
        System.out.println("Ingrese un valor mayor a 5 para devolver 'VERDADERO', de lo contrario, será 'FALSO': ");

        a = inputkey.nextInt();

        if (a >= 5) {
            System.out.println("VERDADERO, mayor o igual a 5. El valor introducido fue: " + a);
        } else {
            System.out.println("FALSO, menor a 5. El valor introducido fue: " + a);
        }

        System.out.println(
                nuevaLinea + "La sentencia 'FOR' podemos determinar cuantas veces se cumplirá un ciclo." + nuevaLinea);
        System.out.println(
                "Ingrese un valor menor de 20 preferentemente para cumplir un numero de ciclos de 1 al numero introducido: ");

        a = inputkey.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println("El valor de 'i' es: " + i);
        }

        System.out.println(nuevaLinea + "La sentencia 'WHILE' ejecutara un ciclo si se cumple una condicion determinada similar a 'FOR'." + nuevaLinea);

        System.out.println(
                nuevaLinea + "Tomando el ultimo valor introducido: " + a + " se descontara hasta llegar a 0 con WHILE"
                        + nuevaLinea);
        System.out.println(
                nuevaLinea + "Se restara 1 por segundo" + nuevaLinea);
        TimeUnit.SECONDS.sleep(3); // Funcion para dormir programa por segundos; se declaran 3 en este caso para
                                   // lectura

        while (a >= 0) {
            System.out.println("El valor de 'a' es: " + a);
            a--;
            TimeUnit.SECONDS.sleep(1); // Contador de segundos
        }

        System.out.println(nuevaLinea + "---------------------------------------------" + nuevaLinea);

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000;

        System.out.println("Finalizo en " + totalTime + " segundos.");
        inputkey.close();

    }

}
