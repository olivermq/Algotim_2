package practicaDirigida02;

public class Ejercicio05 {
	
	
	
	public static void main(String[] args) {

	    int[] a = { 8, 1, 4, 14, 5, 7, 9, 11 };

	    a = resizeArray(15, a);
	    
	    
	}

	public static int[] resizeArray(int resize, int[] a) {

	    int[] b = new int[resize];

	    /* 1ºArg: Array origen,
	     * 2ºArg: Por donde comienza a copiar en el origen
	     * 3ºArg: Array destino
	     * 4ºArg: Por donde comienza a copiar en el destino
	     * 5ºArg: Numero de elementos que copiara del origen
	     */
	    System.arraycopy(a, 0, b, 0, a.length);

	    return b;
	}
	

}
