package practicaDirigida02;

public class Ejercicio05 {
	
	
	
	public static void main(String[] args) {

	    int[] a = { 8, 1, 4, 14, 5, 7, 9, 11 };

	    a = resizeArray(15, a);
	    
	    
	}

	public static int[] resizeArray(int resize, int[] a) {

	    int[] b = new int[resize];

	    /* 1�Arg: Array origen,
	     * 2�Arg: Por donde comienza a copiar en el origen
	     * 3�Arg: Array destino
	     * 4�Arg: Por donde comienza a copiar en el destino
	     * 5�Arg: Numero de elementos que copiara del origen
	     */
	    System.arraycopy(a, 0, b, 0, a.length);

	    return b;
	}
	

}
