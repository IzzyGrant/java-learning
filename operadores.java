/* Java operators written by Izzy G. Osorio */


/*Se hace uso de los principales tipos de operadores de Java y su impresion de valor.*/

class operadores {

    	public static void main(String[] args) {

	String nuevaLinea = System.getProperty("line.separator"); //esta declaracion regresara una nueva linea cuando sea llamada como "newLine"
	//Aqui se esta guardando una funcion en una variable tipo String.

        int var; // Se declara variable tipo INT con valor inicial.


		// Inicia impresion de variables:

		System.out.println(nuevaLinea + "---------------------------------------------"+ nuevaLinea);
		System.out.println("Tenenmos los siguientes tipos de operadores...:" + nuevaLinea);
		var = 2+2;
        	System.out.println("Suma: 2+2 = " + var + nuevaLinea);
		var = 3-1;
		System.out.println("Resta: 3-1 = " + var + nuevaLinea);
		System.out.println(nuevaLinea + "---------------------------------------------"+ nuevaLinea);

}
}
