package practicaDirigida02;
import java.util.Scanner;

public class Ejercicio03 {

	public static boolean ehPalindromo(String cadena) {
		
		String invertida="";
		
	
		for(int indice=cadena.length() -1; indice >=0 ;indice--)
		{	
			invertida+=cadena.charAt(indice);	
		}
		
		if(invertida.equals(cadena) ) 
			return true;
		else
			return false;
	
		}
	
	
public static void main(String[] args) {
		
	 Scanner lec=new Scanner(System.in);
	   
	   System.out.print("Palabra : ");
	   String palabra1=lec.next();
	
	
	   if(ehPalindromo(palabra1)) 
		   System.out.print("SI ES PALINDROMO");
	   else
		   System.out.print("NO ES PALINDROMO");

	   
	   
}
	 
}
	




