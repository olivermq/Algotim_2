package practicaDirigida01;
import java.util.Scanner;
public class InvertirString {
	public static void main(String[] args) {
		
		
		String cadena="MASCOTITA";
		String invertida="";
		
		for(int indice=cadena.length() -1; indice >=0 ;indice--)
		{
			
			invertida+=cadena.charAt(indice);
			
		}
		System.out.println("cadena original: "+cadena );
		System.out.print("cadena invertida: "+invertida );
		
	}
}
