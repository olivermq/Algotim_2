package practicaDirigida01;
import java.util.Scanner;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int a,b,temp;
		
		System.out.println("INTERCAMBIO DE VALORES");
		System.out.print("Ingrese el valor de a:");
		a = entrada.nextInt();
		System.out.print("Ingrese el valor de b:");
		b = entrada.nextInt();
		
		temp=a;
		a=b;
		b=temp;
		
		
		System.out.println(" ");
		System.out.println("El nuevo valor de a es: "+a);
		System.out.println("El nuevo valor de b es: "+b);
	}

}

