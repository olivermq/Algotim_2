package practicaDirigida01;
import java.util.Scanner;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int sumatoria,pre,n;
		
		System.out.println("SUMA DE CUBOS PARA N PRIMEROS NUMEROS NATURALES");
		System.out.print("Ingrese el valor de N:");
		n = entrada.nextInt();
		
		pre=n*(n+1)/2  ;
		
		sumatoria=pre*pre;
		
		System.out.println("El volumen es: "+sumatoria);
	}

}

