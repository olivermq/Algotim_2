package practicaDirigida01;
import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int anio,rest1,rest2;
		
		System.out.println("==========  ANIOS BISIESTOS  ===========");
		System.out.println("Ingrese el año a consultar:");
		anio = entrada.nextInt();
		
		rest1=anio%4;
		
		rest2=anio%100;
		
		System.out.println(" ");
		if(rest1==0 && rest2!=0) 
			System.out.println("El anio "+anio+" SI es bisiesto.");
			else
			System.out.println("El anio "+anio+" NO es bisiesto.");
		
		
		
	
	}

}

