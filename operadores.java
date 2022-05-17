/* Java operators written by Izzy G. Osorio */

import java.util.Scanner; // Nos permitira utilizar inputs, para introduccion de valores por el usuario.

/*Se hace uso de los principales tipos de operadores de Java y su impresion de valor.*/

public class operadores {

    	public static void main(String[] args) {

	String nuevaLinea = System.getProperty("line.separator"); //esta declaracion regresara una nueva linea cuando sea llamada como "newLine"
	//Aqui se esta guardando una funcion en una variable tipo String.
	Scanner lectura = new Scanner(System.in); // Hacemos un objeto Scanner para introducir valores.


        int a, b, c; // Se declaran variables a usar .

		long startTime = System.currentTimeMillis(); // Captura el tiempo desde que inicia este punto del programa

		System.out.println(nuevaLinea + "---------------------------------------------"+ nuevaLinea);
		System.out.println("Tenenmos los siguientes tipos de operadores. Introduzca 2 valores por operacion:" + nuevaLinea);
        	System.out.print("Suma: ");
		a = lectura.nextInt();
		System.out.print(" + ");
		b = lectura.nextInt();
		c= a + b;
		System.out.print(" = " + c + nuevaLinea);

		System.out.print("Resta: ");
                a = lectura.nextInt();
                System.out.print(" - ");
                b = lectura.nextInt();
                c= a - b;
		System.out.print(" = " + c + nuevaLinea);

                System.out.print("Multiplicacion: ");
                a = lectura.nextInt();
                System.out.print(" * ");
                b = lectura.nextInt();
                c= a * b;
                System.out.print(" = " + c + nuevaLinea);

                System.out.print("Division: ");
                a = lectura.nextInt();
                System.out.print(" / ");
                b = lectura.nextInt();
                c= a / b;
                System.out.print(" = " + c + nuevaLinea);

		System.out.println(nuevaLinea + "---------------------------------------------"+ nuevaLinea);

		long endTime = System.currentTimeMillis(); // Captura el tiempo en otra variable.
		long totalTime = (endTime - startTime)/1000; // Opera el inicio y fin de ambos tiempos

		System.out.println("Finalizo en " + totalTime + " segundos.");// muestra el tiempo que paso en completar el programa.
		lectura.close(); // Se cierra objeto de Scanner.
}
}
