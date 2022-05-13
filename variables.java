/* Java variables written by Izzy G. Osorio */


/*Se hace uso de los principales tipos de variables de Java y su impresion de valor.*/

class variables {

    	public static void main(String[] args) {

	String nuevaLinea = System.getProperty("line.separator"); //esta declaracion regresara una nueva linea cuando sea llamada como "newLine"
	//Aqui se esta guardando una funcion en una variable tipo String.

	String var0 = "Esto es un texto :)";

        int var1 = 12; // Se declara variable tipo INT con valor inicial.
        var1 = 13; // Se puede cambiar el valor de la variable aun despues de haber sido declarada.

	double var2 = 3.1416; // Variable decimal.

	boolean var3 = false; // Variable booleana.

	char var4 = 'K'; // Variable de letra.

		// Inicia impresion de variables:

		System.out.println(nuevaLinea + "---------------------------------------------"+ nuevaLinea);
		System.out.println("Variable tipo 'String': " + var0 + nuevaLinea);
        	System.out.println("Variable tipo 'INT': " + var1 + nuevaLinea);
		System.out.println("Variable tipo 'double': " + var2 + nuevaLinea);
		System.out.println("Variable tuipo 'boolean': " + var3 + nuevaLinea);
		System.out.println("Variable tipo 'char': " + var4);
		System.out.println(nuevaLinea + "---------------------------------------------"+ nuevaLinea);

}
}
